package com.mobitel.mobitel.service.impl;

import com.mobitel.mobitel.dto.CustomerDTO;
import com.mobitel.mobitel.dto.request.CustomerUpdateDTO;
import com.mobitel.mobitel.entity.Customer;
import com.mobitel.mobitel.repo.CustomerRepo;
import com.mobitel.mobitel.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceIMPL implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public String saveCustomer(CustomerDTO customerDTO) {

        Customer customer = new Customer(
                customerDTO.getCustomerId(),
                customerDTO.getCustomerName(),
                customerDTO.getCustomerAddress(),
                customerDTO.getCustomerSalary(),
                customerDTO.getNic(),
                customerDTO.isActiveStatus()
        );

        customerRepo.save(customer);
//        System.out.println("service customer :"+customerDTO);
        return "saved";
    }

    @Override
    public String updateCustomer(CustomerUpdateDTO customerUpdateDTO) {

        if (customerRepo.existsById(customerUpdateDTO.getCustomerId())) {
//            System.out.println("exists");
            Customer customer = customerRepo.getReferenceById(customerUpdateDTO.getCustomerId());
//            System.out.println("customer " + customer);
            customer.setCustomerName(customerUpdateDTO.getCustomerName());
            customer.setCustomerAddress(customerUpdateDTO.getCustomerAddress());
            customer.setCustomerSalary(customerUpdateDTO.getCustomerSalary());

            customerRepo.save(customer);
            return "updated customer";
        } else {

//            System.out.println("not exists");
            throw new RuntimeException("no data found for that id");
        }
//        return "null";
    }


}

