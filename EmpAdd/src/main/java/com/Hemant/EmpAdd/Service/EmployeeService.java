package com.Hemant.EmpAdd.Service;

import com.Hemant.EmpAdd.model.Employee;
import com.Hemant.EmpAdd.repo.IEmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    IEmpRepo empRepo;
    public String addEmployee(Employee newEmployee) {
        empRepo.save(newEmployee);
        return "added";
    }

    public List<Employee> getAllEmployee() {
        return empRepo.findAll();
    }

    public String getEmpById(Long id) {
        Employee emp= empRepo.findById(id).orElse(null);
        if(emp!=null){
            emp.setId(id);
            empRepo.save(emp);
            return"Found Successful";
        }else{
            return"not found";
        }
    }

    public String updateEmpById(Long id, String Firstname) {
        Employee emp = empRepo.findById(id).orElse(null);
        if(emp != null){
            emp.setFirstName(Firstname);
            empRepo.save(emp);
            return "update";
        }else{
            return "not found";
        }
    }

    public String deleteEmpById(Long id) {
         empRepo.deleteById(id);
         return "deleted";
    }
}
