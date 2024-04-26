/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class OOP_Project {

 
    public static void main(String[] args) {
     
       
       try{
           FileReader reader = new FileReader("C:\\Users\\hp\\OneDrive\\المستندات\\NetBeansProjects\\OOP_Project\\src\\oop_project\\LogicalExp.txt");
           BufferedReader buffered = new BufferedReader(reader);
           String line;
            
           line = buffered.readLine();
           while(line != null){
            String Postfix = PostfixExpression.InfixToPostfix(line);
//             System.out.println("postfix = "+ Postfix);
            boolean result = EvaluatePostExpression.evaluatePostfix(Postfix);
            System.out.println("value of : "+ line + " = "+ result);
             line = buffered.readLine();
       }
       }
       catch(IOException e){
           e.printStackTrace();
       }
       
    }
   
}
