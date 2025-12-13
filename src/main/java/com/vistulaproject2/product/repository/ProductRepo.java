//package com.vistulaproject2.product.repository;
//
//import com.vistulaproject2.product.api.request.ProductRequest;
//import com.vistulaproject2.product.api.response.ProductResponse;
//import com.vistulaproject2.product.domain.Product;
//import org.springframework.stereotype.Repository;
//
//
//import java.util.*;
//
//@Repository
//public class ProductRepo {
//    protected final Map<Long, Product> products = new HashMap<>();
//    protected  long counter=1;
//
//    public Product save(Product entity) {
//        setID(entity);
//        return  entity;
//    }
//
//    private Product setID(Product entity) {
//        if(entity.getId()!=null){
//            products.put(entity.getId(),entity);
//        }else {
//            entity.setId(counter);
//            products.put(entity.getId(), entity);
//            counter++;
//        }
//
//        return entity;
//    }
//
//
//
//    public Optional<Product> findById(Long id) {
//        return Optional.ofNullable(products.get(id));
//    }
//
//    public List<Product> findAll() {
//        return new ArrayList<>(products.values());
//    }
//
//    public void delete(Long id) {
//        products.remove(id);
//    }
//}
