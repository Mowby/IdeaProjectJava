package com.cursan.homeshop;

public class DirectDelivery implements Delivery {
    @Override
    public Double getPrice(){
        return 4.99;
    }

    public String affiche(){
        String typeDeLivraison = "livraison directe";
        return typeDeLivraison;
    }
}
