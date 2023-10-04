package com.Hemant.EmpAdd.repo;

import com.Hemant.EmpAdd.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAddressRepo extends JpaRepository<Address,Long> {

}
