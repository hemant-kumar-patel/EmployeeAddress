package com.Hemant.EmpAdd.repo;

import com.Hemant.EmpAdd.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpRepo extends JpaRepository<Employee,Long> {

}
