package com.tns.collections.set;

public class Product {
    private int prodId;
    private String name;
    private float price;

    public int getProdId() {
        return this.prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String toString() {
        return "Product [prodId=" + this.prodId + ", name=" + this.name + ", price=" + this.price + "]";
    }

    public Product(int prodId, String name, float price) {
        this.prodId = prodId;
        this.name = name;
        this.price = price;
    }

    public Product() {
    }
}
