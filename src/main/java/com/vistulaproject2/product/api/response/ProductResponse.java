package com.vistulaproject2.product.api.response;

public class ProductResponse {
    private Long id;
    private String name;

    public  ProductResponse(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public Long getID() {
        return id;
    }
    public void setID(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
