import java.util.Scanner;
public class OddSum {

	public static void main(String[] args) {
	
		 Scanner input=new Scanner(System.in);
		 int num, count=1, add=0;
		 
		 System.out.println("Enter a number");
		 num=input.nextInt();
		 input.close();
		 
		 do{
		 count+=2;
		 add+=count;
		 }while(count<num);
		 
		 System.out.println("odd numbers sum is "+ add);
	}

}
