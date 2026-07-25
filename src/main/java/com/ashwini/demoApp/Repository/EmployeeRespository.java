package com.ashwini.demoApp.Repository;

import com.ashwini.demoApp.Entity.EmployeeEntity;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRespository {
    /*
    public String getEmployee(Integer id){
        return "emp";
    }
     */

    public EmployeeEntity getEmployee(Integer id){
        return new EmployeeEntity(1,"ash","CSE",27);
    }

}
