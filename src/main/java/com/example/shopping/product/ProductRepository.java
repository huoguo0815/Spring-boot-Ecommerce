package com.example.shopping.product;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<ProuductModel, Integer> {

    ProuductModel findByproductname(String productname);
    ProuductModel findByprice(int price);
    ProuductModel findByquantity(int quantity);

}
