package com.kyon.productapi.Controller;

import com.kyon.productapi.Model.ProductEntity;
import com.kyon.productapi.Model.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;


@RestController
@RequestMapping("/1/api/productadd")
public class ProductAddController {
    @Autowired
    ProductRepository repository;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public ProductEntity addProduct(@RequestBody ProductEntity data/*, @RequestParam("file") MultipartFile file*/){
        /*
        String fileName = file.getOriginalFilename();
        try {
            File uploadFile = new File("image/" + fileName);
            byte[] bytes = file.getBytes();
            BufferedOutputStream uploadFileStream = new BufferedOutputStream(new FileOutputStream(uploadFile));
            uploadFileStream.write(bytes);
            uploadFileStream.close();
        } catch (Exception e) {
        }*/

        if(repository.findTitle(data.getTitle()).size() == 0){
            return repository.save(data);
        }
        return repository.save(data);
    }
}
