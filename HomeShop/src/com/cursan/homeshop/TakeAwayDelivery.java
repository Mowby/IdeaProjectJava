package com.cursan.homeshop;

public class TakeAwayDelivery implements Delivery{

    @Override
    public Double getPrice(){
        return 0.0;
    }

    public String affiche(){

        String typeDeLivraison = "livraison take away ";
        return typeDeLivraison;
    }
}
