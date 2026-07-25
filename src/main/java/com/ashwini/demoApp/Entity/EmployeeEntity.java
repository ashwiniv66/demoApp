package com.ashwini.demoApp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmployeeEntity {

    @Id
    Integer id;
    String name;
    String department;
    Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }



    public EmployeeEntity() {
    }

    public EmployeeEntity(Integer id, String name, String department, Integer age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
    }

}
