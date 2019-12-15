package com.kyon.productapi.Model;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class ProductEntity {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String text;
    private Integer price;
    private String image_title;

    //private Integer state;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public String getImageTitle() {
        return image_title;
    }
    public void setImageTitle(String image_title) {
        this.image_title = image_title;
    }
}
