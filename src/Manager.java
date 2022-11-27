import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public class Manager {

	private int customer_id;
	 private String customer_name;
	
	
      Manager(int customer_id, String customer_name ){
           this.customer_id= customer_id;
            
            this.customer_name=customer_name;
         
       }
        
       public int getcustomer_id() {
	  return customer_id;
	 } 

	 public String getcustomer_name() {
	  return customer_name;
	 }

public String toString(){
   return customer_id + " " +customer_name+ " ";
}


	
	 public void choice1(){
		 System.out.println("\n****Welcome to Manager menu****");
	     List<Manager> col=new ArrayList<Manager>();
	     Scanner sc = new Scanner(System.in);
	     Scanner s1= new Scanner(System.in);
	     int choice;
	     System.out.println("\n1. Add Customer");
         System.out.println("2. View record");
         System.out.println("3. Delete customer");
         System.out.println("4. Update customer");
         System.out.println("5. Exit");
         choice = sc.nextInt();
	     do{ 
	         switch(choice){
	             case 1:
	                 System.out.print("Enter customer id:");
	                 int customer_id=sc.nextInt();
	                 System.out.print("Enter customer name:");
	                 String customer_name=s1.nextLine();
	               
	                 col.add(new Manager(customer_id, customer_name));
	                 break;
	             case 2:
	            	 System.out.println("***");
	                 Iterator<Manager> i=col.iterator();
	                 while(i.hasNext()){
	                     Manager D= i.next();
	                     System.out.println(D);
	                 }
	                 System.out.println("***");
	                 break;
	             case 3:
	                 boolean Del=false;
	                 System.out.print("Enter customer id to Delete:");
	                 customer_id=sc.nextInt();
	                 System.out.println("***");
	                 i=col.iterator();
	                 while(i.hasNext())
	                 {
	                     Manager D=i.next();
	                     if(D.getcustomer_id()==customer_id){
	                         i.remove();
	                         Del=true;
	                     }
	                 }
	                 if(!Del){
	                     System.out.println("Customer not found");
	                 }else
	                 {
	                     System.out.println("Customer deleted successfully");
	                 }
	                 System.out.println("***");
	                 break;
	             case 4:
	                 Del=false;
	                 System.out.print("Enter customer id to Update:");
	                 customer_id=sc.nextInt();
	                 System.out.println("***");
	                 ListIterator<Manager>li = col.listIterator();
	                 while(li.hasNext())
	                 {
	                     Manager D=li.next();
	                     if(D.getcustomer_id()==customer_id){
	                         System.out.println("Enter new Customer name:");
	                         customer_name=s1.nextLine();
	                         
	                         li.set(new Manager(customer_id,customer_name));
	                         Del=true;
	                     }
	                 }
	                 if(!Del){
	                     System.out.println("Customer not found");
	                 }else
	                 {
	                     System.out.println("Customer is updated successfully");
	                 }
	                 System.out.println("====");
	                 break;  
	             case 5:
	 	                System.out.println("Good Bye!");
	 	                break;
	         }
	      
	     }while(choice !=5);
	     
	     }
	     
		
	}

