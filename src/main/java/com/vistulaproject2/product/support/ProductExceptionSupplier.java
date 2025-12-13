package com.vistulaproject2.product.support;

import com.vistulaproject2.product.support.Exception.ProductNotFoundException;

import java.util.function.Supplier;

public class ProductExceptionSupplier {
    public static Supplier<ProductNotFoundException> ProductNotFoundExceptionSupplier(Long id) {
        return () -> new ProductNotFoundException(id);
    }
}
