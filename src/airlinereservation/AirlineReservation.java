/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinereservation;

import java.util.Scanner;

/**
 *
 * @author Abdul Moiz Chishti
 */
public class AirlineReservation  {
    public static void main(String[] args) {
 
        Scanner sc=new Scanner(System.in);
        FlightData obj=new FlightData();   
        Business obj1=new Business();
        Economy obj2=new Economy();
        Employee obj3=new Employee();
        
        
        System.out.print("Enter Flight code :");
        String flightcode=sc.nextLine();
        
        System.out.print("Enter Takeoff :");
        String takeoff=sc.nextLine();
        
        System.out.print("Enter Destination :");
        String destination=sc.nextLine();
        
        System.out.print("Enter Date of Travel :");
        String dot=sc.nextLine();
        
        System.out.print("Enter passenger name :");
        String pname=sc.nextLine();
        
        System.out.print("Enter Address :");
        String add=sc.nextLine();
        
        System.out.print("Enter Mobile number :");
        String mobno=sc.nextLine();
        
        System.out.print("Enter Ticket Amount :");
        String ta=sc.nextLine();
    
        System.out.print("Enter Discount :");
        String d=sc.nextLine();
    
        System.out.print("Enter Empolyee Code :");
        String ec=sc.nextLine();
        
        
    obj.flightdata(flightcode, takeoff, destination, dot);
    obj.flightdata();
    
    obj1.business(pname, add, mobno, ta);
    obj1.business();
    
    obj2.economy(dot);
    obj2.economy();
    
    
    }
 }
 
   