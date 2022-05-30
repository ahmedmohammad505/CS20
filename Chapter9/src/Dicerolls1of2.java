import java. util. Scanner; 
		import java. util. Random;
		
public class Dicerolls1of2 
{

		public static void main (String args) 
			{
				int[] outcomes = new int[13];
				
				Scanner input = new Scanner (System. in);
				int numRolls; 
				Random rand = new Random ();
				int outcome; 
				/* prompt user for number of rolls */
				System. out. print("How many rolls?");
				numRolls = input. nextInt();
				// roll dice and add to outcomes */
				for (int roll = 0; roll < numRolls; roll++) 
				{
					outcome = (rand. nextInt(6) + 1) + (rand. nextInt(6) + 1); outcomes [outcome] += 1;
					/* show counts of outcomes */
					for (int i = 2; i <= 12; i++)
					 System. out. println (i + ":" + outcomes[i]);
				}
			
				}

			
	}
