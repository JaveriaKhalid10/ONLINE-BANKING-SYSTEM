import java.io.*;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
    	System.out.println("****Welcome to Online Bank Management System****"); 
		  System.out.println("\n Please Select from following: \n  1)User \n  2)Manager \n  3)EXIT");
		  Scanner sc = new Scanner(System.in);
		        int choice = sc.nextInt();
		        
		    do{
		   switch(choice){        		    
		  
		   case 1: User U = new User();
         U.choice1();
         break;
	         case 2: Manager M = new Manager(choice, null);
	           M.choice1();
	    
		          break;
	         case 3:
	        	 System.out.println("YOU CHOOSE TO EXIT");
		   }
		        }while(choice !=3);
		 }
		 
		
	}

