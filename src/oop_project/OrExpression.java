/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_project;

/**
 *
 * @author hp
 */
public class OrExpression extends LogicalExpression {
    private final LogicalExpression left;
    private final LogicalExpression right;


    public OrExpression(LogicalExpression left, LogicalExpression right) {
        this.left = left;
        this.right = right;
    }
    
    public boolean evaluate()
    {
        return (left.evaluate() || right.evaluate());
    }
}
