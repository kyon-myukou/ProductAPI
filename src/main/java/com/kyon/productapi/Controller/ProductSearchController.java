package com.kyon.productapi.Controller;

import com.kyon.productapi.Model.ProductEntity;
import com.kyon.productapi.Model.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.core.io.ResourceLoader;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RestController
@RequestMapping("/1/api/productsearch")
public class ProductSearchController {
    @Autowired
    ProductRepository repository;
    @Autowired
    ResourceLoader resourceLoader;

    @RequestMapping(value = "{title}", method = RequestMethod.GET)
    public List<ProductEntity> getProducts(@PathVariable String title){
        return repository.findTitle(title);
    }

/*
    @RequestMapping(value = "{title}", method = RequestMethod.GET)
    public HttpEntity<byte[]> getProduct(@PathVariable String title) throws IOException {
        String ImageTitle = repository.findTitle(title).getImageTitle();
        Resource resource = resourceLoader.getResource("classpath:image/"+ImageTitle+".jpg");
        ByteArrayOutputStream bout = new ByteArrayOutputStream();

        try (InputStream image = resource.getInputStream()) {
            int c;
            while ((c = image.read()) != -1) {
                bout.write(c);
            }
        }
        byte[] b = bout.toByteArray();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);
        headers.setContentLength(b.length);
        return new HttpEntity<byte[]>(b, headers);
    }*/
}
