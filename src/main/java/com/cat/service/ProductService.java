package com.cat.service;

import com.cat.POJO.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface ProductService {
    public ResponseEntity<String> addNewProduct(Map<String, String> requestMap);

    public ResponseEntity<List<Product>> getAllProduct();

}