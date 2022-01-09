package com.pbo.pmo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "teams")
public class Team {
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

    @Column(name = "company_id")
    private int company_id;
    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false, insertable = false, updatable = false)
    @JsonBackReference
    private Company company;

    @JsonIgnore
    @OneToMany
    @JoinColumn(name = "employee_fk", referencedColumnName = "id")
    @JsonManagedReference
    private Set<Employee> memberSet;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "scrum_id", referencedColumnName = "id")
    private Scrum scrum;


    public Team() {
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

    public Set<Employee> getMemberSet() {
        return memberSet;
    }

    public void setMemberSet(Set<Employee> memberSet) {
        this.memberSet = memberSet;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
