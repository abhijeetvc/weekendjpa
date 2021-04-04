package com.spjpa.weekendjpa.controller;

import com.spjpa.weekendjpa.model.Employee;
import com.spjpa.weekendjpa.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// OneToOne, OneToMany, ManyToOne, ManyToMany

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/saveEmp")
    public String saveEmployee(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Employee saved";
    }

    @GetMapping("getAllEmps")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @GetMapping("/getemp/{id}")
    public Optional<Employee> getEmployee(@PathVariable Integer id){
        return employeeRepository.findById(id);
    }

    @PutMapping("/updateEmp")
    public String updateEmployee(@RequestBody Employee employee){
        Optional<Employee> emp=employeeRepository.findById(employee.getId());
        if(emp.isPresent()){
            emp.get().setName(employee.getName());
            emp.get().setCity(employee.getCity());
            employeeRepository.save(emp.get());
            return "Employee updated";
        }
        return "Record not found";
    }

    @GetMapping("/getEmpByNameAndCity/{name}/{city}")
    public List<Employee> getEmpByNameAndCity(@PathVariable String name,@PathVariable String city){
        return employeeRepository.findByNameAndCity(name,city);
    }

}
