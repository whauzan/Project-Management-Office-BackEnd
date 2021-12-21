package com.pbo.pmo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "companies")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
            name = "company_id",
            updatable = false
    )
    private int id;
    @Column(
            name = "name",
            nullable = false
    )
    private String name;
    @Column(
            name = "phoneNumber",
            nullable = false
    )
    private String phoneNumber;
    @Column(
            name = "email",
            nullable = false
    )
    private String email;
    @Column(
            name = "address",
            nullable = false
    )
    private String address;

    @JsonIgnore
    @OneToMany(mappedBy = "company_id")
//    @JoinColumn(name = "company_id")
    private Set<Employee> employeeSet;

    public Company() {}

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

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
}
