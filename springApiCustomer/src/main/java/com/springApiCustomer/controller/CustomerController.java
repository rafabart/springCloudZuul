package com.springApiCustomer.controller;

import com.springApiCustomer.entity.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping
    public List findAll() {

        return Arrays.asList(
                new Customer(1L, "Customer 1"),
                new Customer(1L, "Customer 2"),
                new Customer(1L, "Customer 3"),
                new Customer(1L, "Customer 4")
        );
    }
}