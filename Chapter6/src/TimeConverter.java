import java.util.Scanner;
public class TimeConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hours,minutes;

		 Scanner input =new Scanner(System.in);
 System.out.println("Enter the amount of hours: ");

		 hours=input.nextInt();

		 input.close();

		 minutes=hours*60;

		 System.out.println(minutes+" minutes in "+hours+" hours");

		 }

		  public static void daystohours(){

		 int hours,days;

		 Scanner input =new Scanner(System.in);

		 System.out.println("Enter the amount of days: ");

		 days=input.nextInt();

		 input.close();

		 hours=days*24;

		 System.out.println(hours+" hours in "+days+" days");

		 }

		 
 public static void minutestohours(){

		 int hours,minutes;

		 Scanner input =new Scanner(System.in);

		 System.out.println("Enter the amount of minutes: ");

		 minutes=input.nextInt();

		 input.close();

		 hours=minutes/60;

		 System.out.println(hours+" hours in "+minutes+" minutes");

		 }
 public static void hourstodays(){

		 int hours,days;

		 Scanner input =new Scanner(System.in);

		 System.out.println("Enter the amount of hours: ");

		 hours=input.nextInt();

		 input.close();

		 days=hours/24;

		 System.out.println(days+" days in "+hours+" hours");

		 }

		 int choice;

		 Scanner input=new Scanner(System.in);

		System.out.println("Enter 1 for hours to minutes");

		 System.out.println("Enter 2 for days to hours");

		 System.out.println("Enter 3 for minutes to hours");

		 System.out.println("Enter 4 for hours to days");

		 choice=input.nextInt();

		 if(choice==1){

		 hourstodays();

		 }else if(choice==2){

		 daystohours();

		 }else if(choice==3){

		 hourstodays();

		 }else {

		 hourstodays();

		 }
}
}
