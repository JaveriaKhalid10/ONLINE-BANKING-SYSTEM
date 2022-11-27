import java.util.Scanner;

public class Loan {
	int loan_id=1;
	 String loan_type="Personal loan";
	 
	 int loan2_id=2;
	 String loan2_type="Student loan";

	public void choice1() {
		
		 System.out.println("Loan menu");
		 System.out.println("\n1) Check loan status");
		 System.out.println("\n2) Take new loan");
		 Scanner sc = new Scanner(System.in);
	        int choice = sc.nextInt();
	        
	        
	   switch(choice){        
	         case 1: check();
	          break;
	         case 2: newL();
	          break;}
	 }

	public void check() {
		System.out.println("\n 1:loan id:"+loan_id+"\n loan Type:"+loan_type);
		System.out.println("\n 2:loan id:"+loan2_id+"\n loan Type:"+loan2_type);
	}
public void newL() {
	System.out.println("\nSorry ! You have already taken one. You cannot Take another");
	System.out.println("\nYour Loan is: "+loan_id+""+loan_type);
		
	}}
		