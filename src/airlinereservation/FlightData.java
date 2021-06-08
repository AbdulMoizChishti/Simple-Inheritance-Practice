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
public class FlightData {
    
    
    
    String flightcode,takeoff,destination,dot;
    public void flightdata(String flightcode,String takeoff,String destination,String dot){
    this.flightcode=flightcode;
    this.takeoff=takeoff;
    this.destination=destination;
    this.dot=dot;
    }
    
    public void flightdata(){
        System.out.println("******************************/n");
        System.out.println("Flightcode : "+flightcode);
        System.out.println("Take-off : "+takeoff);
        System.out.println("Destination : "+destination);
        System.out.println("Date of Travel : "+dot);
    
    }
    
    
    
    
    
    
    }

