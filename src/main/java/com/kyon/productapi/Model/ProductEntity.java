package com.kyon.productapi.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class ProductEntity {
    @Id
    @Column(name="id")
    private String title;
    private String text;
    private int price;
    private String imageTitle;
}
