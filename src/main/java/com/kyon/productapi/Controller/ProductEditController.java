package com.kyon.productapi.Controller;

import com.kyon.productapi.Model.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/1/api/productedit")
public class ProductEditController {
    @Autowired
    ProductRepository repository;
}
