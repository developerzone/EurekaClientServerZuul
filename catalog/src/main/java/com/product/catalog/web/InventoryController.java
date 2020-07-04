package com.product.catalog.web;

import com.product.catalog.model.ProductEntity;
import com.product.catalog.model.ProductInventoryEntity;
import com.product.catalog.service.ProductInventoryService;
import com.product.catalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController
{
    @Autowired
    ProductInventoryService service;

    @GetMapping(value="/list",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ProductInventoryEntity>> listProduct() {
        List<ProductInventoryEntity> productList = service.listProduct();
        return new ResponseEntity<List<ProductInventoryEntity>>(productList, new HttpHeaders(), HttpStatus.OK);
    }
    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProductInventoryEntity> getById(@PathVariable ("id") String id) {
        ProductInventoryEntity product = service.findById(id);
        return new ResponseEntity<ProductInventoryEntity>(product, new HttpHeaders(), HttpStatus.OK);
    }
}