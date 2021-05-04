package com.cursan.homeshop;

public class Product {
    String name;
    String description;
    Double price;

    public void look(){

    }

    public void buy(Bill bill, int quantity ){
        System.out.println(String.format(name + " : " + price + "%n" + description));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
