/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_project;

/**
 *
 * @author hp
 */
public class AndExpression extends LogicalExpression {
    private final LogicalExpression left ;
    private final LogicalExpression right ;

    public AndExpression(LogicalExpression left, LogicalExpression right) {
        this.left = left;
        this.right = right;
    }
    
    public boolean evaluate()
    {
        return (left.evaluate() && right.evaluate());
    }
    
}
