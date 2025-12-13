package com.vistulaproject2.product.support.Exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(Long id) {
        super(String.format("Product not found with id %d", id));
    }
}
