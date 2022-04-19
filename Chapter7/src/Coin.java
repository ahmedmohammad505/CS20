import java.util.Random;
public class Coin {

	 public int faceUp;
	 
	 /**
	  * Shows the face of the coin
	
	  * post: The face of the coin is returned
	  */
	 public  int showFace(){
	 return(faceUp);
	 }
	 
	 /**
	  * Flips a coin
	   * post:The coin has been flipped
	  */
	 public int flipCoin(){
	 Random r=new Random();
	 
	 faceUp=r.nextInt(1);
	 return(faceUp);
	 }
	 
	 public String toString(){
	 String faceString;
	 int face=showFace();
	 if(face==1){
	 faceString="The coin is face down";
	 return(faceString);
	 }else{
	 faceString="The coin is face up";
	 return(faceString);
	 }
	 }
	 
	 public static void main(String[]args){
	 Coin nickel=new Coin();
	 
	 if(nickel.flipCoin()==0){
	 System.out.println("Heads up!");
	 } else{
	 System.out.println("Tails up!");
	 }
	 }
	}