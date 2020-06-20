package kr.co.fastcampus.eatgo.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Restaurant {

    @Id
    @GeneratedValue
    @Setter
    private long id;

    private String name;

    private String address;

    @Transient
    private List<MenuItem> menuItems;

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = new ArrayList<>(menuItems);

//        for(MenuItem menuItem : menuItems) {
//            addMenuItem(menuItem);
//        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfomation() {
        return name + " in " + address;
    }

    public void updateInformation(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
