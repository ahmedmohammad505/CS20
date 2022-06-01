import java.util.Scanner;
public class Circle3of4 {

	//data attributes
    double radius;
    String color;
    static final double PI =3.14;
    //This variable counts the number of objects declared so far
    static int count =0;
    
  
    public Circle3of4()
    {
            radius = 10;
            color ="Red";
            count++;
    }
    
    //parameterized constuctor
    public Circle3of4(double r, String c)
    {
            radius = r;
            color = c;
            count++;
    }
    
   
    public double getRadius()
    {
            return radius;
    }
    
    public String getColor()
    {
            return color;
    }
    
    public void setRadius(double r)
    {
            radius = r;
    }
    
    public void setColor(String c)
    {
            color =c;
    }
    //This method prints all the pertinent data
    void print()
    {
            System.out.println("Radius: " +radius+"\nColor: "+color+"\nArea: "+findArea());
    }
    //To calculate the area of the circle.
    double findArea()
    {
            return PI*radius*radius;
    }
    
    public static void main(String [] args)
    {
            Scanner input = new Scanner(System.in);
            
            //declare objects
            Circle3of4 c1 = new Circle3of4(); //default constructor invoked
            Circle3of4 c2 = new Circle3of4(12.5, "Green");//parameterized constructor invoked.
            //calling the print method
            // print is an instance method and should be called using the object
            c1.print(); 
            c2.print();
            
            System.out.println("Enter the radius :");
            double r = input.nextDouble();
            System.out.println("Enter the color:");
            String col = input.next();
            
            //change the values of c1's attributes to the user given values using the mutators
            c1.setRadius(r);
            c1.setColor(col);
            
            c1.print();
            
            System.out.println("There are "+count+" objects");
    } {
}
		// TODO Auto-generated method stub

	}


