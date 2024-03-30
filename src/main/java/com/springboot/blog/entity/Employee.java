package com.springboot.blog.entity;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @Column(name = "employee_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeid;

    @Column(name = "user_name", length = 255)
    private String employeeName;

    @Column(name = "email", length = 255)
    private String email;

    @Column(name = "password", length = 255)
    private String password;


    public Employee() {
    }

    public Employee(int employeeid, String employeeName, String email, String password) {
        this.employeeid = employeeid;
        this.employeeName = employeeName;
        this.email = email;
        this.password = password;
    }
    //create getters and setters

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeename) {
        this.employeeName = employeename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

