package com.product.catalog.service;

import com.product.catalog.model.ProductEntity;
import com.product.catalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
     
    @Autowired
    ProductRepository productRepository;

    public ProductEntity addorUpdateProduct(ProductEntity productEntity)
    {
        ProductEntity product = productRepository.save(productEntity);

        return product;
    }
    public ProductEntity reduceQuantity(ProductEntity userRouteEntity)
    {
        ProductEntity userRoute = productRepository.save(userRouteEntity);

        return userRoute;
    }
    public ProductEntity findById(String id)
    {
        Optional<ProductEntity> product = productRepository.findById(id);

        return product.orElse(null);
    }
    public List<ProductEntity> listProduct()
    {
        List<ProductEntity> productList = productRepository.findAll();

        return productList;
    }
}