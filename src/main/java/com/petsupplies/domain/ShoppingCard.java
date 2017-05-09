package com.petsupplies.domain;

/**
 * Created by fselanno on 9-5-2017.
 */
public class ShoppingCard {
    private Long id;
    private double totalAmount;

    public void setId(Long id){ this.id = id;}
    public void getId(){ return id;}

    public double setTotalAmount(double totalAmount){ this.totalAmount = totalAmount;}
    public double getTotalAmount(){return totalAmount;}

}
