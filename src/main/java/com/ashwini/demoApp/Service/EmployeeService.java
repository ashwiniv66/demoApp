package com.ashwini.demoApp.Service;

import com.ashwini.demoApp.DTO.EmployeeDTO;
import com.ashwini.demoApp.Entity.EmployeeEntity;
import com.ashwini.demoApp.Repository.EmployeeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRespository employeeRespository;

    public EmployeeDTO getEmployee(Integer id) {
        EmployeeEntity employee = employeeRespository.getEmployee(id);
        EmployeeDTO employeeDTO = new EmployeeDTO();
        return employeeDTO.EmployeeMapper(employee);
    }

    /* BASIC
    public String getEmployee(Integer id){
        return employeeRespository.getEmployee(id);
    }
     */
}
