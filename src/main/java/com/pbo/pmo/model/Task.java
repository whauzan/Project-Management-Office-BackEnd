package com.pbo.pmo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
            name="id",
            updatable = false
    )
    private  int id;
    @Column(
            name = "name",
            nullable = false
    )
    private String name;
    @Column(
            name = "description",
            nullable = false
    )
    private String description;
    @Column(
            name = "done",
            columnDefinition = "boolean default false",
            nullable = false
    )
    private Boolean done;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;

    @Column(name = "scrum_id")
    private int scrum_id;
    @ManyToOne
    @JoinColumn(name = "scrum_id", nullable = false, insertable = false, updatable = false)
    @JsonBackReference
    private Scrum scrum;

    public Task() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getScrum_id() {
        return scrum_id;
    }

    public void setScrum_id(int scrum_id) {
        this.scrum_id = scrum_id;
    }

    public Scrum getScrum() {
        return scrum;
    }

    public void setScrum(Scrum scrum) {
        this.scrum = scrum;
    }
}
