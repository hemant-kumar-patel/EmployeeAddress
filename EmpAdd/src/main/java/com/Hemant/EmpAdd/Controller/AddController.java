package com.Hemant.EmpAdd.Controller;

import com.Hemant.EmpAdd.Service.AddressService;
import com.Hemant.EmpAdd.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddController {
    @Autowired
    AddressService addressService;
    @PostMapping("address")
    public String addAddress(@RequestBody Address newAddress){
        return addressService.addAddress(newAddress);
    }
    @GetMapping("Address")
    public List<Address> getAllAddress(){
        return  addressService.getAllAddress();
    }
    @GetMapping("Address/id")
    public String getAddressById(@RequestParam Long id){
        return addressService.getAddressById(id);
    }
    @PutMapping("address/{id}")
    public String updateAddress(@RequestParam Long id,@RequestParam String city){
        return addressService.updateAddress(id,city);
    }
    @DeleteMapping("Delete/address/id")
    public String removeAddressById(@RequestParam Long id){
       return addressService.removeAddressById(id);
    }
}
