package com.Hemant.EmpAdd.Service;

import com.Hemant.EmpAdd.model.Address;
import com.Hemant.EmpAdd.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public String addAddress(Address newAddress) {
       addressRepo.save(newAddress);
       return "added";
    }
    public List<Address> getAllAddress() {
         return addressRepo.findAll();
    }

    public String getAddressById(Long id) {
               addressRepo.findById(id);
           return"found";
    }

    public String updateAddress(Long id, String city) {
        Address address=addressRepo.findById(id).orElse(null);
        if(address!=null){
            address.setCity(city);
            addressRepo.save(address);
            return "Successfully Updated";
        }else {
            return "address not found";
        }
    }

    public String removeAddressById(Long id) {
        addressRepo.deleteById(id);
        return "Deletion Successful";
    }
}
