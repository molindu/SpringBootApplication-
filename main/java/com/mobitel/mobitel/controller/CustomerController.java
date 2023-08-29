package com.mobitel.mobitel.controller;

import com.mobitel.mobitel.dto.CustomerDTO;
import com.mobitel.mobitel.dto.request.CustomerUpdateDTO;
//import com.mobitel.mobitel.service.CustomerService;
import com.mobitel.mobitel.service.CustomerService;
//import com.mobitel.mobitel.service.impl.CustomerServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
//@CrossOrigin("localhost:4200")//4200 port request only allowed
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/saveUser")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO){

        customerService.saveCustomer(customerDTO);

        return "saved";
    }
    @PutMapping("/update")
    public String updateCustomer(@RequestBody CustomerUpdateDTO customerUpdateDTO){

        String messege = customerService.updateCustomer(customerUpdateDTO);
        return messege;
    }

}
