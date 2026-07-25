package com.ashwini.demoApp.DTO;

import com.ashwini.demoApp.Entity.EmployeeEntity;

import java.util.Objects;

public class EmployeeDTO {

    String name;
    String department;
    Integer age;

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDTO that = (EmployeeDTO) o;
        return Objects.equals(name, that.name) && Objects.equals(department, that.department) && Objects.equals(age, that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, age);
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }

    public EmployeeDTO EmployeeMapper(EmployeeEntity employee){
        this.setAge(employee.getAge());
        this.setDepartment(employee.getDepartment());
        this.setName(employee.getName());
        return this;
    }



}
