package com.kyon.productapi.Controller;

import com.kyon.productapi.Model.ProductEntity;
import com.kyon.productapi.Model.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/1/api/productedit")
public class ProductEditController {
    @Autowired
    ProductRepository repository;

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ProductEntity addProduct(@PathVariable Integer id, @RequestBody ProductEntity data){
        ProductEntity entity = repository.getOne(id);
        if(data.getTitle() != null){
            if(!data.getTitle().isEmpty()) {
                entity.setTitle(data.getTitle());
            }
        }
        if(data.getText() != null) {
            if (!data.getText().isEmpty()) {
                entity.setText(data.getText());
            }
        }
        if(data.getPrice() != null){
            entity.setPrice(data.getPrice());
        }
        if(data.getImageTitle() != null) {
            if (!data.getImageTitle().isEmpty()) {
                entity.setImageTitle(data.getImageTitle());
            }
        }
        return repository.save(entity);
    }
}
