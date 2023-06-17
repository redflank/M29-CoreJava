package com.tns.collections.set;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class ProductSetDemo {
    public ProductSetDemo() {
    }

    public static void main(String[] args) {
        Comparator<Product> comp = (p1, p2) -> {
            return (int)(p1.getPrice() - p2.getPrice());
        };
        SortedSet<Product> productSet = new TreeSet(comp);
        productSet.add(new Product(101, "Textbook", 670.0F));
        productSet.add(new Product(106, "Notebook", 120.0F));
        productSet.add(new Product(103, "Register", 340.0F));
        productSet.add(new Product(102, "Pen", 80.0F));
        System.out.println(productSet);
    }
}
