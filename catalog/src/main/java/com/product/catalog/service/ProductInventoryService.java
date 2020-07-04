package com.product.catalog.service;

import com.product.catalog.model.ProductEntity;
import com.product.catalog.model.ProductInventoryEntity;
import com.product.catalog.repository.ProductInventoryRepository;
import com.product.catalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductInventoryService {
     
    @Autowired
    ProductInventoryRepository productInventoryRepository;


    public List<ProductInventoryEntity> listProduct()
    {
        List<ProductInventoryEntity> productList = productInventoryRepository.findAll();

        return productList;
    }
    public ProductInventoryEntity findById(String id)
    {
        Optional<ProductInventoryEntity> product = productInventoryRepository.findByProductId(id);

        return product.orElse(null);
    }
}