import java.util.Scanner;
public class Surfsup2of3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height;
		 Scanner input=new Scanner(System.in);
		 
		 System.out.print("Enter wave height in feet ");
		 height=input.nextInt();
		 input.close();
		 
		 if (height >=6){
		 System.out.println("Great day for surfing!");
		 } else{
		 System.out.println("Go body Boarding!");
		 }

	}

}
