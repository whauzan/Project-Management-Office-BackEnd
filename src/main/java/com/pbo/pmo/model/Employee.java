package com.pbo.pmo.model;

import javax.persistence.*;

@Entity
public class Employee {
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
            name = "gender",
            nullable = false
    )
    private char gender;
    @Column(
            name = "email",
            nullable = false,
            unique = true
    )
    private String email;
    @Column(
            name = "address",
            nullable = false
    )
    private String address;
    @Column(
            name = "phoneNumber",
            nullable = false
    )
    private String phoneNumber;

    public Employee() {
    }

//    public Employee(String name, char gender, String email, String address, String phoneNumber) {
//        this.name = name;
//        this.gender = gender;
//        this.email = email;
//        this.address = address;
//        this.phoneNumber = phoneNumber;
//    }

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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}