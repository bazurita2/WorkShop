/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller.logic;

/**
 *
 * @author bryan
 */
public class SalesPrice {
    private float base;
    private float tax=12;
    private float finalPrice;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public float getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(float finalPrice) {
        this.finalPrice = finalPrice;
    }

    public SalesPrice(float base, float finalPrice) {
        this.base = base;
        this.finalPrice = finalPrice;
    }
    
    //////////////////////////
    public void computeFinalPrice(){
        finalPrice=base*tax/100+base;
    }
    
    @Override
    public String toString(){
        String temp;
        temp= "base= "+base+" tax= "+tax+" finalPrice= "+finalPrice;
        return temp;
    }
}
