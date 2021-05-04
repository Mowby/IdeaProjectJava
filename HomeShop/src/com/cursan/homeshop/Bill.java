package com.cursan.homeshop;

import java.util.Map;

public class Bill {
    private Customer customer;
    private Map<Product, Integer> products;
    private Delivery delivery;
    /**
     * Add a product with a quantity in the bill
     * @param product product to add
     * @param quantity quantity of the product
     */

    public Bill(Customer customer, Delivery delivery){
        this.customer = customer;
        this.delivery = delivery;
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
