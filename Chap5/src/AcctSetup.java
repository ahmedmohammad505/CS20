import java.util.Scanner;

public class AcctSetup {

	public static void main(String[] args) {
		String password, username;
		 int passwordLength;
		 Scanner input = new Scanner(System.in);
		 
		 System.out.print("Enter a username:  ");
		 username = input.next();
		 System.out.print("Enter a password that is at least 8 characters:  ");
		 password = input.next();
		 passwordLength = password.length();
		 
		 while (passwordLength < 8) {
		 System.out.print("Enter a password less thats at least 8 characters:  ");
		 password = input.next();
		 passwordLength = password.length();
		 }
		 input.close(); 
		 
		 System.out.println("Your username is " + username.toLowerCase() + " and your password is "
		 + password.toLowerCase()); 
	
	}

}
