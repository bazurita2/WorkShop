/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercisesobjects;

import ec.edu.espe.controller.logic.SalesPrice;

/**
 *
 * @author bryan
 */
public class ExcercisesObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float base=0;
        float tax=12;
        float finalPrice=0;
        
        base=10;
        
        computeFinalPrice(base,tax,finalPrice);
        //System.out.println("base= "+base+" tax= "+tax+" finalPrice= "+finalPrice);
        System.out.println("Printing from main 1st");
        SalesPrice salesPrice= new SalesPrice(20F,10F);
        System.out.println(salesPrice);
        System.out.println("Printing from main 2nd");
        computeFinalPrice(salesPrice);
        System.out.println(salesPrice);
        computeInteger(6);
    }
    public static void computeFinalPrice(float mBase,float mTax,float mFinalPrice){
        System.out.println("Printing from method whit Variables");
        mTax= 10;
        mFinalPrice=mBase*mTax/100+mBase;
        System.out.println("base= "+mBase+" tax= "+mTax+" finalPrice= "+mFinalPrice);
        }
    public static void computeFinalPrice(SalesPrice mSalesPrice){
        System.out.println("Printing from method whit Object");
        System.out.println(mSalesPrice.getBase()*mSalesPrice.getTax()/100+mSalesPrice.getBase());
        }
    public static void computeInteger(Integer integer){
        int power;
        System.out.println("Printing from method whit Object Integer");
        System.out.println(integer.intValue());
        power=integer.intValue()*integer.intValue();
        System.out.println("Power(2) = "+power);
        
        }
}

