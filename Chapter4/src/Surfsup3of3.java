import java.util.Scanner;
public class Surfsup3of3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int height;
		 Scanner input=new Scanner(System.in);
		 
		 System.out.print("Enter wave height in feet ");
		 height=input.nextInt();
		 input.close();
		 
		 if (height >=6){
		 System.out.println("Great day for surfing");
		 } else if(height>=3){
		 System.out.println("Go body Boarding");
		 } else if(height>=0){
		 System.out.println("Go for a swim");
		 } else if(height>=8){
		 System.out.println("Woa! What kind of surf is that");
		 }	
	
	
	}
	}
