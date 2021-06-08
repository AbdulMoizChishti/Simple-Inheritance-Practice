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
public class Business extends FlightData{
    
    String pname,add,mobno,ta;
    
    public void business(String pname,String add,String mobno,String ta){
        this.pname=pname;
        this.add=add;
        this.mobno=mobno;
        this.ta=ta;
        
    }
        
    public void business(){
        System.out.println("Passenger Name : "+pname);
        System.out.println("Address : "+add);
        System.out.println("Mobile number : "+mobno);
        System.out.println("Ticket Amount : "+ta);
    
    }

}
    

