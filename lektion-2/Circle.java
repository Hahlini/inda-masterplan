import java.lang.Math;

public class Circle {
    static final double PI = Math.PI; 
    static final double ALLOWED_ERROR = 1e-9; 
    int xCoordinate;
    int yCoordinate;
    double radius;
    String color;

    public Circle(int xCoordinate, int yCoordinate, double radius, String color) {
        this.xCoordinate = xCoordinate; 
        this.yCoordinate = yCoordinate;
        this.color = color;
        this.radius = radius;
    }

    public double area(){
        return PI * radius * radius;
    }

    public double circumference(){
        return PI * radius * 2;
    }

    public boolean isSameSize(Circle otherCircle){
        return Math.abs(this.radius - otherCircle.radius) <= ALLOWED_ERROR;
    }

    public double distanceToOtherCircle(Circle otherCircle) {
        int xDistance = this.xCoordinate - otherCircle.xCoordinate;
        int yDistance = this.yCoordinate - otherCircle.yCoordinate;
        double distance = Math.sqrt(xDistance * xDistance + yDistance * yDistance) - this.radius - otherCircle.radius;
        return distance;
    }

    public void resize(double resizeFactor){
        if (resizeFactor < 0){
            System.out.println("A circle cannot have a negative radius");
        } else {
            radius *= resizeFactor;
        }
    }

/*
* The main method will NOT contain errors! It is for you to test if the program behaves as expected.
*/
    public static void main(String[] args) {
        Circle blueCircle = new Circle(0, 0, 5.0, "blue");
        Circle redCircle = new Circle(9, 7, 5.0, "red");
        Circle greenCircle = new Circle(-8, 4, 1, "green");
        Circle yellowCircle = new Circle(-8, 4, 2.5, "yellow");

        System.out.printf("Area of circles: \nblue  = %3.2f \ngreen = %3.2f\n\n", blueCircle.area(), greenCircle.area());
        // Blue = 78.54 and Green = 3.14

        System.out.printf("The green circle is the same size as the yellow one: \n%B\n\n", greenCircle.isSameSize(yellowCircle));
        // FALSE

        System.out.printf("The blue circle is the same size as the red one: \n%B\n\n", blueCircle.isSameSize(redCircle));
        // TRUE

        System.out.printf("The distance between blue and red is: \n%3.2f\n\n", blueCircle.distanceToOtherCircle(redCircle));
        // 1.40

        System.out.println("Resizing blue by 6.40/5.0...");
        blueCircle.resize(6.40/5.0);
        System.out.printf("The distance between blue and red is: %3.2f\n", blueCircle.distanceToOtherCircle(redCircle));
        // 0.00
    }
}
