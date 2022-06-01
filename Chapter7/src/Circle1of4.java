import java.util.Random;

public class Circle1of4 {

	int radious;
	static final double PI =3.14;
	//empty constructor
	Circle1of4(){}
	//filled Constructor
	Circle1of4(int r){
	radious=r;
	}
	void setRadious(int r){//set value here for circle
	radious=r;
	}
	int getRadious(){//get value of Radious
	return radious;
	}
	double circuference(){//Here return circuference of Circle
	return 2*PI*radious;
	}
	double displayAreaFormula(){//here we return Area of Circle
	return PI*radious*radious;
	}

	public String toString()
	{
	return "Circle Radious ::"+this.getRadious()+"\nCircle Cirfurence ::"+this.circuference()+"\nCircle Area ::"+this.displayAreaFormula();//here it return Display All that thing
	}
	public boolean equals(Object anObject) { //here return true if it eqauls other wise it will false
	if (this == anObject) {
	return true;
	}
	else
	return false;
	}
	public static void main(String[] args) {
	// TODO code application logic here
	Circle1of4 spot=new Circle1of4();//new object create
	spot.setRadious(3);//radious
	System.out.println(spot.toString());//display it
	Circle1of4 spot1=new Circle1of4(10);//new object create
	System.out.println(spot1.toString());//display output here
	System.out.println("Here both Object are Different"+spot.equals(spot1));//display output
	System.out.println("Here both Object is Same"+spot1.equals(spot1));//display output
	}
	  
	}

		
	

