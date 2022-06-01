import java.util.Scanner;
public class StudentRoster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("Enter number of students:");
		int number_of_student=input.nextInt();
		String[] student=new String[number_of_student];
		input.nextLine();
		
		for(int x=0; x<number_of_student; x++)
		{
			System.out.print("Enter a student name:");
			student[x]=input.nextLine();
		}
		
		System.out.println("Student Roster");
		for(int x=0; x<number_of_student; x++)
		{
			System.out.println(student[x]);
	}

}
}