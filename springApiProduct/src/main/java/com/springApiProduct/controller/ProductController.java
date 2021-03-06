package com.springApiProduct.controller;

import com.springApiProduct.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public List findAll() {

        return Arrays.asList(
                new Product(1L, "Product 1"),
                new Product(1L, "Product 2"),
                new Product(1L, "Product 3"),
                new Product(1L, "Product 4")
        );
    }
}