package example1;
import java.util.Scanner;
public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		char ch;
		Account account=new Account();

		do {
		System.out.println("Enter 1:Create account \n 2:Deposit \n 3: withdraw  \n 4: checkbalance \n 5: exit");
		System.out.println("enter the option");
		int option=sc.nextInt();
		//Account account=new Account();
		switch(option) {
		/*case 1:account= new Account();
		System.out.println("Please enter ur account number");
		account.setAccno(sc.nextInt());
		System.out.println("Please enter the amount");
		account.setAmt(sc.nextInt());
			break;*/
		case 2: System.out.println("Please enter the amount you want to deposit:");
		account.deposit(sc.nextInt());
			break;
		case 3: System.out.println("Please enter the amount you want to withdraw:");
		account.withdraw(sc.nextInt());
			break;
			case 4: account.checkBalance();
				break;
			case 5: System.exit(0);
				break;
				default: System.out.println("etner the valid option");
				break;
		}
		System.out.println("do yo uwant to continue press yes else n");
		ch=sc.next().charAt(0);
		}while(ch=='y'|| ch=='Y');

	
		
	}



	}


