package com.cursan.homeshop;

public class ExpressDelivery implements Delivery{
    private String region;

    public ExpressDelivery(String region) {
        this.region = region;
    }

    @Override
    public Double getPrice() {
        if (region.equals("Paris"))
            return 6.99;
        else
            return 9.99;
    }
}
