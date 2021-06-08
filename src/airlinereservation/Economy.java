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
public class Economy extends Business{
  
    String discount;
    public void economy(String discount){
    this.discount=discount;
    
    }
    
    public void economy(){
        System.out.println("Discount : "+discount);
    
    }
    
}
