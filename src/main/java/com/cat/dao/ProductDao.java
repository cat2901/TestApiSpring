package com.cat.dao;

import com.cat.POJO.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
