package com.example.shopping.product;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Product")
@Getter @Setter
public class ProuductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    @NotBlank(message = "商品名稱不可空白")
    private String productname;

    @Column
    @NotBlank(message = "售價不可空白")
    private int price;

    @Column
    @NotBlank(message = "庫存不可空白")
    private int quantity;

    public void setId(int id) {
        this.id = id;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductname() {
        return productname;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int Quantity) {
        Quantity = quantity;
    }
}
