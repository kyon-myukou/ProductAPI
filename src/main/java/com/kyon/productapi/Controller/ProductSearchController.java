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
@RequestMapping("/1/api/productsearch")
public class ProductSearchController {
    @Autowired
    ProductRepository repository;

    @RequestMapping(value = "{title}", method = RequestMethod.GET)
    public List<ProductEntity> getProducts(@PathVariable String title){
        return repository.findTitle(title);
    }
}
