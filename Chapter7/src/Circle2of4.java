
public class Circle2of4 {

	private static final double PI = 3.14;
    private double radius;

    public Circle2of4() {
        radius = 1;
    }

    //  Part 2 of 4
    public Circle2of4(double radius){
        this.radius = radius;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public double area() {
        double circleArea;
        circleArea = PI * radius * radius;
        return (circleArea);
    }

    public double getRadius() {
        return (radius);
    }

    public double circumference() {
        return (2 * PI * radius);
    }

    // Part 3 of 4
    public void displayAreaFormula(){
        System.out.println("Area of Circle : \u03C0"+" * radius * radius");
   } {
}


public static void main(String[] args) {
    Circle2of4 spot = new Circle2of4();

    spot.setRadius(3);
    System.out.println("Circle Radius: " + spot.getRadius());
    System.out.println("Circle circumference: " + spot.circumference());
    spot.displayAreaFormula();



	}

}
