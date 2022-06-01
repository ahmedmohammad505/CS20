import java.util.Scanner;

public class Adder {
    // function to generate a random number bewtween max and min values max is exclusive.
    public static int randomInteger(int min, int max) {
        int nextInteger = (int) ((Math.random() * (max - min)) + min);
        return nextInteger;
    }

    // Function to get answer by adding the two numbers
    public static int getAnswer(int n1, int n2) {
        return n1 + n2;
    }

    // Diver code.
    public static void main(String[] args) {
        // scanner to read user input
        Scanner sc = new Scanner(System.in);
        // entry variable to keep user input
        int entry = 0;
        // score to hold score of user.
        int score = 0;
        // loop until 999 was entered.
        do {
            // current points are 5. for the first try.
            int currPoint = 5;
            // generate 2 random number.
            int number1 = randomInteger(0, 21);
            int number2 = randomInteger(0, 21);
            // display 2 numbers
            System.out.print(number1 + " + " + number2 + " = ");
            entry = sc.nextInt();
            // if entry is not equal to 999
            if (entry != 999) {
                // if not answer
                if (entry != getAnswer(number1, number2)) {
                    // try 2
                    // current points are 3
                    currPoint = 3;
                    // ask for input from user.
                    System.out.print("Wrong answer. Enter another answer: ");
                    entry = sc.nextInt();

                    // if exit then break from loop
                    if (entry == 999)
                        break;
                    else if (entry != getAnswer(number1, number2)) {
                        // try 3
                        // ask again for inputs
                        currPoint = 1;
                        System.out.print("Wrong answer. Enter another answer: ");
                        entry = sc.nextInt();
                        // if 99 then exit. 
                        if (entry == 999)
                            break;
                        // if not correct answer 
                        else if (entry != getAnswer(number1, number2)) {
                            // current points are 0
                            currPoint = 0;
                            // print current answers
                            System.out.println("Correct Answer is: " + getAnswer(number1, number2));
                        }

                    }
                }
                // increase the score.
                score += currPoint;
            }
        } while (entry != 999);
        // print the score.
        System.out.println("Your score is: " + score);
    }
}
