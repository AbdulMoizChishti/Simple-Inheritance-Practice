/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinereservation;

/**
 *
 * @author Abdul Moiz Chishti
 */
public class Employee extends Economy{
    
    String ec;
    public void employee(String ec){
    this.ec=ec;
    
    }
    
    public void employee(){
        System.out.println("Employee Code : "+ec);
    }
    
}
