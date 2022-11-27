import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class User {

	 public void choice1(){
		 BankAccount bankAccount = BankAccount.getInstance("Javeria", 50000);

	        Scanner scanner = new Scanner(System.in);
	        String answer = null;
	        while (true){
	            System.out.println("\n******Welcome to Customer Menu!*******");
	            System.out.println("Please Select the menu!!");
	            System.out.println("(1) Withdraw");
	            System.out.println("(2) Credit");
	            System.out.println("(3) Take Loan");
	            System.out.println("(Other) Exit");

	            int a = scanner.nextInt();
	            if(a == 1){
	                System.out.println("Your balance is " + bankAccount.balance + "$");
	                System.out.println("How many money do you want to withdraw?");
	                

	                BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	                try {
	                    answer = input.readLine();

	                    double withdraw_amount = Double.parseDouble(answer);
	                    bankAccount.withdraw(withdraw_amount);

	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }

	            else if(a == 2){
	                System.out.println("Your balance is " + bankAccount.balance + "$");
	                System.out.println("How many money do you want to credit?");

	                BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	                try {
	                    answer = input.readLine();

	                    double credit_amount = Double.parseDouble(answer);
	                    bankAccount.credit(credit_amount);

	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	            else if(a == 3){
	            	Loan L = new Loan();
	            	L.choice1();
	            }
	            else{
	                System.out.println("Good Bye!");
	                break;
	            }
	           break;
	        }

	    
	 }
}
