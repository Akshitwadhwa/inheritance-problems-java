 class shape {
    // since we dont know the area yet , we have to define it as a double area
    public double getarea(){
        System.out.println("area of the shape is still unknown");

}
// creating a new class rectangle that extends shape
// we will also define the constructor
class rectangle extends shape{
    private double lenght;
    private double width;
    // now we need to the initialse the constructor

    public rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;

    }
    @Override
    public double getarea(){
        return lenght * width;
    }
    }
  public class  mainshape {
  
            public static void main(String[] args) {
            shape sh = new shape();
            System.out.println("area of the shape:" +sh.getarea());
            // for the last part we need to add a new rectangle object
            rectangle1 rect = new rectangle1();
            System.out.println("Area of rectangle:" + rect.getarea());
        }
 }
 }
 // Define a base Shape class
class Shape {
    public double getArea() {
        return 0;  // Default area for a generic shape
    }
}

// Define a Rectangle class that inherits from Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor to initialize the rectangle's length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return length * width;  // Area of the rectangle
    }
}

public class Main {
    public static void main(String[] args) {
        Shape sh = new Shape();
        System.out.println("Area of the shape: " + sh.getArea());
        // Create a Rectangle object with specified dimensions
        Rectangle rect = new Rectangle(5, 3);  // Example values for length and width
        System.out.println("Area of rectangle: " + rect.getArea());
    }
}




    






