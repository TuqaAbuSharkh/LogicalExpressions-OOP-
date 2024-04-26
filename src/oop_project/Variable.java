/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_project;

/**
 *
 * @author hp
 */
public class Variable extends LogicalExpression {
     private boolean value = false;
     
     public Variable(boolean value)
     {
         this.value=value;
         
     }
    public void setVal(boolean v)
    {
        this.value = v;
    }
     
    public boolean getValue() {
        return value;
    }
    public boolean evaluate()
     {
         return getValue();
     }
}
