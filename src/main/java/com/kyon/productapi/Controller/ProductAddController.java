package com.kyon.productapi.Controller;

import com.kyon.productapi.Model.ProductEntity;
import com.kyon.productapi.Model.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/1/api/productadd")
public class ProductAddController {
    @Autowired
    ProductRepository repository;

    @RequestMapping(method = RequestMethod.POST)
    public String addProduct(ProductEntity data){
        this.repository.save(data);
        return data.getText();
    }
}
