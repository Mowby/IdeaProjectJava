package com.cursan.homeshop;

public class RelayDelivery implements Delivery {
    private int number;

    public RelayDelivery(int number) {
        this.number = number;
    }

    @Override
    public Double getPrice() {
        if (number >= 1 && number <= 22)
            return 0.0;
        else if (number >= 23 && number <= 47)
            return 2.99;
        else
            return 4.99;
    }

    public String affiche(){
        String typeDeLivraison = "livraison en point relais";
        return typeDeLivraison;
    }
}
