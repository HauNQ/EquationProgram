/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import responsitory.ComputingEquation;
import view.Menu;

/**
 *
 * @author Nguyen Quang Hau
 */
public class Programming extends Menu<String>{
    private ComputingEquation computing = new ComputingEquation();

    public Programming() {
        super("========Equation Program========", new String[]{"Calculate Superlative Equation","Calculate Quadratic Equation","Exit"});
    }
    
    
    @Override
    public void excute(int n) {
        switch (n) {
            case 1:
                computing.superlativeEquation();
                break;
            case 2:
                computing.quadraticEquation();
                break;
            default:
                System.out.println("GoodBye");
        }
    }
    
}
