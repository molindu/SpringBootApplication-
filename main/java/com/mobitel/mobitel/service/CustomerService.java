package com.mobitel.mobitel.service;
import com.mobitel.mobitel.dto.CustomerDTO;
import com.mobitel.mobitel.dto.request.CustomerUpdateDTO;
import org.springframework.web.bind.annotation.RequestBody;

public interface CustomerService {
    public String saveCustomer(CustomerDTO customerDTO);


    String updateCustomer(CustomerUpdateDTO customerUpdateDTO);
}
