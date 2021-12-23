package com.pbo.pmo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
            name = "id",
            updatable = false
    )
    private int id;

    @Column(
            name = "name",
            nullable = false
    )
    private String name;

    @Column(
            name = "type",
            nullable = false
    )
    private String type;

    @Column(
            name = "technology",
            nullable = false
    )
    private String technolgy;

    @Column(
            name = "price",
            nullable = false
    )
    private int price;

    @Column(
            name = "duedate",
            nullable = false
    )
    private Date duedate;

    @JsonIgnore
    @OneToOne(mappedBy = "project")
    private Customer customer;

    public Project() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTechnolgy() {
        return technolgy;
    }

    public void setTechnolgy(String technolgy) {
        this.technolgy = technolgy;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDuedate() {
        return duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
