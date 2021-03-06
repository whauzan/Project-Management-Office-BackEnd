package com.pbo.pmo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "employees")
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

    @Column(name = "company_id")
    private int company_id;
    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false, insertable = false, updatable = false)
    @JsonBackReference
    private Company company;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "project_manager_id", referencedColumnName = "id")
    private ProjectManager projectManager;

    @Column(name = "team_id")
    private int team_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "task_id",referencedColumnName = "id")
    private Task task;

    public Employee() {
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public int getId() {
        return id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
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

    public ProjectManager getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(ProjectManager projectManager) {
        this.projectManager = projectManager;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
