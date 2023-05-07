package com.example.shopping.product;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Integer addProduct(ProuductModel Product){
        ProuductModel newProduct = productRepository.save(Product);
        return newProduct.getId();
    }
}
