package com.cursan.homeshop;

import java.util.HashMap;
import java.util.Map;

public class Bill {
    private Customer customer;
    private Map<Product, Integer> products = new HashMap<Product, Integer>();
    private Delivery delivery;

    public Bill(Customer customer, Delivery delivery){
        this.customer = customer;
        this.delivery = delivery;
    }

    public void addProduct(Product product, int quantity){
        this.products.put(product, quantity);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void generate(Writer writer){
        writer.start();
        writer.writeLine("HomeShop Compagnie");
        writer.writeLine(" 1 Place Charles de Gaulle, 75008 Paris" );
        writer.writeLine("Facture à l'attention de " + customer.getFullname());
        writer.writeLine(customer.getAddress() );
        writer.writeLine("Mode de livraison : " + delivery.affiche() + delivery.getPrice() );
        writer.writeLine("Produits :" );
        writer.writeLine("----------------------------------------------------");
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            Integer quantity = entry.getValue();
            writer.writeLine(product.getName() + " - " + product.getPrice() + " - " + quantity + " unité(s)" );
            writer.writeLine(product.getDescription());
            writer.writeLine("");
        }
        writer.writeLine("Livraison : " + delivery.getPrice());
        writer.writeLine("----------------------------------------------------");
        writer.writeLine("Total : " + this.getTotal());
        writer.stop();
    }

    public Double getTotal(){
        Double total = delivery.getPrice();
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            Integer quantity = entry.getValue();
            total += product.getPrice() * quantity;
        }
        return total;
    }
}
