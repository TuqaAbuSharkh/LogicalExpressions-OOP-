/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_project;

/**
 *
 * @author hp
 */
public class Negation extends LogicalExpression{
     private final LogicalExpression right;

    public Negation(LogicalExpression right) {
        this.right = right;
    }
     
     public boolean evaluate()
     {
         return !(right.evaluate());
     }
}
