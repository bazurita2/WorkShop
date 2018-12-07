/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.libraries.area;

/**
 *
 * @author bryan
 */
public class Triangle extends Figure{
    private float base; 
    private float high;

    public Triangle(float base, float high) {
        this.base = base;
        this.high = high;
    }
    
    
    @Override
    public float computeArea() {
        area = (base*high)/2;
        return area;
    }
    
}
