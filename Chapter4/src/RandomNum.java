import java.util.Random;
import java.util.Scanner;
public class RandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	} {

	int first,second;
	 Random r=new Random(1);
	 
	Scanner input=new Scanner(System.in);
	 
	 System.out.println("Enter minimunm number: ");
	 first=input.nextInt();
	 System.out.println("Enter maximimum number: ");
	 second=input.nextInt();
	
	 
	 System.out.println("Number is: "+ r.nextInt(second-first+1)+first);
	 
}	
	
}