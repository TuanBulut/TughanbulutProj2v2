package com.vistulaproject2.product.support;
import com.vistulaproject2.product.api.request.ProductRequest;
import com.vistulaproject2.product.api.request.UpdateProductRequest;
import com.vistulaproject2.product.api.response.ProductResponse;
import com.vistulaproject2.product.domain.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    public Product toProduct(ProductRequest productRequest) {
        return new Product(productRequest.getName());
    }
    public Product toProduct(Product product, UpdateProductRequest updateProductRequest) {
        product.setName(updateProductRequest.getName());
        return product;
    }
    public ProductResponse toProductResponse(Product product) {
        return new ProductResponse(product.getId(),product.getName());
    }
}
