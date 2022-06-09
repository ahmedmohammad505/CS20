
import com.phidget22.*;

public class TugOfWar {
    //Handle Exceptions | Exceptions will happen in your code from time to time. These are caused by unexpected things happening. Make sure you’ve added "throws Exception" to your main method.
    public static void main(String[] args) throws Exception{

    int count = 0;
   
    int count2 = 0;
   
    int LED = 0;
   
    boolean test = false;
   
    boolean test2 = false;

        //Create | Create objects for your buttons and LEDs.
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address | Address your four objects which lets your program know where to find them.
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Open | Connect your program to your physical devices.
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
       
        boolean player1 = redButton.getState();
       
        boolean player2 = greenButton.getState();

        //Use your Phidgets | This code will turn on the LED when the matching button is pressed and turns off the LED when the matching button is released. The sleep function slows down the loop so the button state is only checked every 150ms.
        while(true){

            if( greenButton.getState()){
                redLED.setState(false);
            }

            if(redButton.getState()){
                greenLED.setState(false);
            }
           
            if (greenButton.getState() == true && test == false) {
           
            count ++;

            test = true;
           
            System.out.println("\nGreen: " + count);
           
            }
            else if (greenButton.getState() == false) {
            test = false;
            }
           
           
           
            if (redButton.getState() == true && test2 == false) {
           
            count2 ++;
           
           
            test2 = true;
           
            System.out.println("\nRed: " + count2);
           
            }
            else if (redButton.getState() == false) {
           
            test2 = false;
            }
           
            if (count == 10 && LED < 5){
               
            greenLED.setState(true);
                 Thread.sleep(1500);
                 greenLED.setState(false);
                 
                 LED ++ ;
                 
                 System.out.println("\nPLAYER 1 WINS!!!");
                 
                 
                 System.exit(0);
                 
            }

             else if (count2 == 10 && LED < 5) {
               
                LED++;
               
                redLED.setState(true);
                     Thread.sleep(1500);
                     redLED.setState(false);
                     Thread.sleep(1500);
                     
                     System.out.println("\nPLAYER 2 WINS!!!");
                     
                     System.exit(0);
                 }
                             
             }
           
        }
   
}
