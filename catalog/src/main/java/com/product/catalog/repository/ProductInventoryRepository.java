package com.product.catalog.repository;

import com.product.catalog.model.ProductInventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductInventoryRepository
        extends JpaRepository<ProductInventoryEntity, Long> {
    public Optional<ProductInventoryEntity> findByProductId(String id);
 
}
