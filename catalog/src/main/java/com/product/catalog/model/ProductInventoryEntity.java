package com.product.catalog.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="T_PRODUCT_INVENTORY")
public class ProductInventoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="product_id")
    private String productId;

	@Column(name="quantity")
	private Long quantity;

	@Column(name="min_limit")
	private Long minLimit;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getMinLimit() {
		return minLimit;
	}

	public void setMinLimit(Long minLimit) {
		this.minLimit = minLimit;
	}
}