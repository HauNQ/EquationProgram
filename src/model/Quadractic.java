/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import common.Validation;

/**
 *
 * @author Nguyen Quang Hau
 */
public class Quadractic {
    private float a,b,c;

    public Quadractic() {
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    
    public void instance(){
        Validation valid = new Validation();
        a = valid.getFloatNumber("Enter A: ");
        b = valid.getFloatNumber("Enter B: ");
        c = valid.getFloatNumber("Enter C: ");
    }

    @Override
    public String toString() {
        return a+"X^2"+b+"X"+c;
    }
    
    
    
}
