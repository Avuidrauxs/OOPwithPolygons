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
// Square inheriting from OOPwithPolygons
public class Square extends OOPwithPolygons 
{
    
    public Square(int sides) {
        super(sides);
    }
    
    //Overriding the method 'mention()' inherited from OOPwithPolygons
    @Override
    public void mention(){
        System.out.println("I am a Square with 4 sides");
    }
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Square newSquare = new Square(4);
        newSquare.mention();
    }
    
}
