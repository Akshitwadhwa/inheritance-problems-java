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

    





