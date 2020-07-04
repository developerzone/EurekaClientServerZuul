package com.product.catalog.web;
import com.product.catalog.model.ProductEntity;
import com.product.catalog.model.ProductInventoryEntity;
import com.product.catalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController
{
    @Autowired
    ProductService service;

    @GetMapping
    public ResponseEntity<String> healthCheck() {
        return new ResponseEntity<String>("CATALOG SERVICE IS UP AND RUNNING FINE.", new HttpHeaders(), HttpStatus.OK);
    }
    @PutMapping("/add")
    public ResponseEntity<ProductEntity> addProduct(@RequestBody ProductEntity productEntity) {
        ProductEntity created = service.addorUpdateProduct(productEntity);
        return new ResponseEntity<ProductEntity>(created, new HttpHeaders(), HttpStatus.OK);
    }
    @GetMapping(value="/list",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ProductEntity>> listProduct() {
        List<ProductEntity> productList = service.listProduct();
        return new ResponseEntity<List<ProductEntity>>(productList, new HttpHeaders(), HttpStatus.OK);
    }
    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProductEntity> getById(@PathVariable ("id") String id) {
        ProductEntity product = service.findById(id);
        return new ResponseEntity<ProductEntity>(product, new HttpHeaders(), HttpStatus.OK);
    }
}