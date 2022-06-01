
public class Reverse {

	 //create a variable for integer array
    private int[] numbers;

    //create a public constructor
    //initialize the integer array and set the size to 10
    //this will be called when you create an instance of this object
    //inside the main method
    public Reverse() {
        numbers = new int[10];
    }

    public static void main(String[] args) {
        //create an instance of TestCountdown object
        //this will call/invoke the public constructor
        //int array numbers will be initialized
        Reverse countdown = new Reverse();
        //after we initialized the integer array
        //we can not set or populate the index of our array
        //call the setNumber() method
        countdown.setNumbers();
        countdown.reverseNumbers();
    }

    /**
     * use for-loop to iterate through the integer array loop until it reached
     * the size of the array (10) it will be populated from 0 - 9 take note that
     * array's index always starts at 0 number[0] = 0; number[1] = 1; ....
     * number[10] = 9;
     */
    public void setNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
    }

    /**
     * display the integer array number in reverse
     */
    public void reverseNumbers() {
        //print this message on the console
        System.out.println("Countdown");
        //use for-loop to iterate through the integer array
        //since it is reverse, we will assign the length of array to int i
        //int i = 10; then check if i is greater than 0, then decrement by 1
        for (int i = numbers.length; i > 0; i--) {
            //get the value of int array using the index
            //we will deduct by 1 to prevent the java.lang.ArrayIndexOutOfBoundsException 
            System.out.println(numbers[i - 1]);
        }
    }

}