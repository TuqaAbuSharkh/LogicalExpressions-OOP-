/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_project;

/**
 *
 * @author hp
 */
import java.util.Stack;
public class PostfixExpression{

    
    public static String InfixToPostfix(String expression)
    {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>(); 
        
        for(int i=0;i<expression.length();i++)
        {
            char c =expression.charAt(i);
            if(c==' ')
                continue;
            if(Character.isLetterOrDigit(c))
                postfix.append(c);
            else if(c=='(')
                stack.push(c);
            else if(c==')')
            {
                while(!stack.isEmpty()&& stack.peek()!= '(')
                        {
                            postfix.append(stack.pop());
                        }
                stack.pop();
            }
            else if(c=='~')
            {
                if(i+1<expression.length()&& expression.charAt(i+1)=='~')
                { 
                    i++;
                continue;
                }
                stack.push(c) ;          }
            else
            {
                while(!stack.isEmpty()&& precedence(c)<= precedence(stack.peek()))
                { postfix.append(stack.pop());}
                 stack.push(c);
            }
           
        }
        while(!stack.isEmpty()){
            postfix.append(stack.pop());
        }
        return postfix.toString();
    }
    
    private static int precedence(char opreation)
    {
        switch(opreation)
        {
            case '+':
                return 1;
            case '.':
                return 2;
            case '~':
                return 3;
            default:
                return -1;
        }
    }
    
}
