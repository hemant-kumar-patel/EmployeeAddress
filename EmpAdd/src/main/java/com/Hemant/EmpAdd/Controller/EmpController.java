package com.Hemant.EmpAdd.Controller;
import com.Hemant.EmpAdd.Service.EmployeeService;
import com.Hemant.EmpAdd.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping("Employee")
    public String addEmployee(@RequestBody Employee newEmployee){
        return employeeService.addEmployee(newEmployee);
    }
    @GetMapping("employees")
    public List<Employee> getAllEmployee(){
         return employeeService.getAllEmployee();
    }
    @GetMapping("employees/id")
    public String getEmpById(@RequestParam Long id){
        return employeeService.getEmpById(id);
    }
    @PutMapping("employees/id")
    public String updateEmpById(@RequestParam Long id,@RequestParam String Firstname){
        return employeeService.updateEmpById(id,Firstname);
    }
    @DeleteMapping("Delete/employee/id")
        public String deleteEmpById(@RequestParam Long id){
            return employeeService.deleteEmpById(id);
        }
}
