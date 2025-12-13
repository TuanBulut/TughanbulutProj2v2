package com.vistulaproject2.product.service;

import com.vistulaproject2.product.api.request.ProductRequest;
import com.vistulaproject2.product.api.request.UpdateProductRequest;
import com.vistulaproject2.product.api.response.ProductResponse;
import com.vistulaproject2.product.domain.Product;

import com.vistulaproject2.product.repository.ProductRepository;
import com.vistulaproject2.product.support.ProductExceptionSupplier;
import com.vistulaproject2.product.support.ProductMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    private final ProductRepository productRepo;
    private final ProductMapper productMapper;
    public ProductService(ProductRepository productRepo, ProductMapper productMapper) {
        this.productRepo = productRepo;
        this.productMapper = productMapper;
    }
    public ProductResponse create(ProductRequest productRequest) {
        Product product = productRepo.save(productMapper.toProduct(productRequest));
        return productMapper.toProductResponse(product);
    }
    public ProductResponse find(Long id) {
        Product product = productRepo.findById(id).orElseThrow(ProductExceptionSupplier.ProductNotFoundExceptionSupplier(id));
        return productMapper.toProductResponse(product);
    }

    public ProductResponse update(Long id, UpdateProductRequest updateProductRequest) {
        Product product = productRepo.findById(id).orElseThrow(ProductExceptionSupplier.ProductNotFoundExceptionSupplier(id));
       productRepo.save(productMapper.toProduct(product,updateProductRequest));
       return productMapper.toProductResponse(product);
    }

    public List<ProductResponse> findAll() {
        return productRepo.findAll().stream().map(productMapper::toProductResponse).collect(Collectors.toList());
    }

    public void delete(Long id) {
        Product product = productRepo.findById(id).orElseThrow(ProductExceptionSupplier.ProductNotFoundExceptionSupplier(id));
        productRepo.delete(product);

    }
}
