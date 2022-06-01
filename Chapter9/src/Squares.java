public class Squares {

    public static void main(String[] args) {

      
        int[] squared = new int[5];
        
       
        for (int i = 0; i < squared.length; i++) {
          
            squared[i] = square(i);
        }
        
      
    }


    public static int square(int i) {
        return i * i;
    }
    
  
    public static void print(int[] squared) {
        for (int i = 0; i < squared.length; i++) {
            System.out.println("Square value of " + i + " is " + squared[i]);
        }
    }
}


