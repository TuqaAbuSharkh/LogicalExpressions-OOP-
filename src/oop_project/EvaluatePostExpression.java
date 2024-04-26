/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package oop_project;

/**
 *
 * @author hp
 */
import java.util.*;
import javax.swing.JOptionPane;

public class EvaluatePostExpression {
    private static  Map<Character , Variable> VariableMap = new HashMap<>();
     
    public static boolean evaluatePostfix(String postfix)
    {
        Stack<Boolean> stack = new Stack<>();
        
        for (char c: postfix.toCharArray())
        {
            if(isOpreand(c))
            {
                stack.push(convertchar(c));
            }
            
            else if(Character.isLetter(c))
            {
                Variable var = VariableMap.get(c);
                if(var == null)
                { 
                    int val = Integer.parseInt(JOptionPane.showInputDialog("Enter the value for variable "+ c +":"));
                    var = new Variable(convert(val));
                    VariableMap.put(c, var);
                }
                stack.push(var.evaluate());
            }
            else
            {
                   LogicalExpression opreator;
                   LogicalExpression right =  new Variable(stack.pop());
                    if (c =='~')
                    {
                        opreator = new Negation(right);
                        stack.push(opreator.evaluate());
                    }
                     else
                     {
                          LogicalExpression left =  new Variable(stack.pop());
                          if(c == '.')
                           {
                               opreator = new AndExpression(left,right);
                              stack.push( opreator.evaluate());
                           }
                          else if(c == '+')
                          {
                              opreator  = new OrExpression(left,right);
                             stack.push(opreator.evaluate());
                          }
                      }
       
            }
        }
             return stack.pop();
    }
    
     private static boolean isOpreand(char token)
    {
        return token == '1'|| token == '0';
    }
     private static boolean convert(int x)
    {
        return x != 0;
    }
     private static boolean convertchar(char x)
    {
        return x != '0';
    }
     
    
}
