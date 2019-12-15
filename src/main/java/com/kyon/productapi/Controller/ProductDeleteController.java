package com.kyon.productapi.Controller;

import com.kyon.productapi.Model.ProductEntity;
import com.kyon.productapi.Model.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/1/api/productdelete")
public class ProductDeleteController {
    @Autowired
    ProductRepository repository;

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public String deleteProduct(@PathVariable Integer id){
        repository.deleteById(id);
        return "delete";
    }
}
