package com.uday.hibernate.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="USER_COMPOSITE_COL_MAP")
public class UserCompositeCollection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="USER_ID")
    private int UserId;
    private String firstName;
    private String lastName;

    @ElementCollection
    @CollectionTable(name="USER_ADDRESS",
            joinColumns=@JoinColumn(name = "USER_ID"))
    private List<AddressCompositeCollection> addressList;

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<AddressCompositeCollection> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<AddressCompositeCollection> addressList) {
        this.addressList = addressList;
    }
}
