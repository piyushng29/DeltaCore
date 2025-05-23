package com.example.deltacore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.deltacore.Entity.Products;


public interface ProductRepository extends JpaRepository<Products, Integer> {

}
