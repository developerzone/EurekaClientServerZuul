package com.product.catalog.repository;



import com.product.catalog.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository
        extends JpaRepository<ProductEntity, String> {
    public Optional<ProductEntity> findById(String id);
}
