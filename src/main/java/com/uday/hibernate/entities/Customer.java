package com.uday.hibernate.entities;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_ID")
    private int customerId;
    private String customerName;

    @ElementCollection
    @CollectionTable(name="CUSTOMER_CARS",
            joinColumns = @JoinColumn(name = "CUSTOMER_ID"))
    @MapKeyColumn(name="CAR_MAKE")
    @Column(name = "MODEL")
    private Map<String, String> cars=new HashMap<String, String>();

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Map<String, String> getCars() {
        return cars;
    }

    public void setCars(Map<String, String> cars) {
        this.cars = cars;
    }
}
