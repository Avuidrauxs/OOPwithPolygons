/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopwithpolygons;

/**
 *
 * @author Avuidrauxs
 */
public class OOPwithPolygons {
    
    // this exhibits encapsulation since they cannot be accessed directly from outside the class. 
    // They can only be set and get values of these variables through the methods of the class.
    private int sides;

    public OOPwithPolygons(int sides) {
        this.sides = sides;
    }
    
    public void mention() {
        System.out.println("I am a polygon");
    }
    
    public void mention (int sides) {
        System.out.println("I can be overloaded too and I have "+sides+" sides");
    }
    
    // Getter metod
    public int getSides() {
        return sides;
    }

    // Setter method
    public void setSides(int sides) {
        this.sides = sides;
    }

    
}
