package com.cursan.homeshop;

import java.util.Map;

public class Bill {
    Customer customer;
    Map<Product, Integer> products;

    /**
     * Add a product with a quantity in the bill
     * @param product product to add
     * @param quantity quantity of the product
     */

    public Bill(Customer customer){
        this.customer = customer;
    }

    public void addProduct(Product product, Integer quantity){

    };

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }
}
