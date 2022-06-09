
import com.phidget22.*;

public class Thermostat {
    public static void main(String[] args) throws Exception{
   
    double setTemp = 21;
   
    double currentTemp;
   

        //Create | Here you have created a TemperatureSensor object. TemperatureSensor is a class in your Phidgets library that gathers temperature data from your Phidget.
        TemperatureSensor temperatureSensor = new TemperatureSensor();
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
        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception occur.
        temperatureSensor.open(1000);
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
        //Use your Phidgets | This code will print humidity and temperature read by the sensor every 150ms.
       
        currentTemp = temperatureSensor.getTemperature();
       
        while(true){
            System.out.println("Set Temperature: " + setTemp + "°C");
            Thread.sleep(500);
           
            System.out.println("\nCurrent Temperature: " + currentTemp + "°C");
            Thread.sleep(500);
           
            if (greenButton.getState()) {
           
            setTemp ++;
           
            }
           
            else if (redButton.getState()) {
           
            setTemp --;
           
            }
           
            if (setTemp >= currentTemp - 2) {
           
            greenLED.setState(true);
            Thread.sleep(500);
            greenLED.setState(false);
            Thread.sleep(500);
            }
           
            else if (setTemp != currentTemp - 2) {
           
            redLED.setState(true);
            Thread.sleep(500);
            redLED.setState(false);
            Thread.sleep(500);
            }
           
           
        }
    }
}
