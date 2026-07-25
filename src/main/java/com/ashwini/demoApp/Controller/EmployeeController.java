package com.ashwini.demoApp.Controller;

import com.ashwini.demoApp.DTO.EmployeeDTO;
import com.ashwini.demoApp.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    /* Basic
    @GetMapping("/getEmployee/{id}")
    public ResponseEntity<String> getEmployee(@PathVariable Integer id){
        String employee = employeeService.getEmployee(id);
        return ResponseEntity.ok(employee);
    }
     */

    //Using DTO's
    @GetMapping("/getEmployee/{id}")
    public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable Integer id){
        EmployeeDTO employee = employeeService.getEmployee(id);
        return ResponseEntity.ok(employee);
    }
}
