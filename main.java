class vehicle{

    public void start(){
        System.out.println("vehicle started");
    }
}

class car extends vehicle{
    @Override
    public void start(){
        System.out.println("car started");

    }
}

// we have to create a two new objects one with the name vehicle and the other with the name 
// car
// creating the two objects
public class main {
    public static void main(String[] args) {
         vehicle vech = new vehicle();
         vech.start();

         car car1 = new car();
         car1.start();
    }
    

    
}


    

