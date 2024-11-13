 class device {
    String modelname;
    double cost;
    public static void main(String[] args) {
        laptop lap = new laptop(14, "macbook", 700);
        lap.displayDetails();
    }

    device(String modelname ,double cost ){
        this.modelname = modelname;
        this.cost = cost;
    }

    public void displayDetails(){

    }
 }
    class laptop extends device{
        int ramsize;
        // after this we wil initialse the constructor
        laptop(int ramsize , String modelname ,double cost){
        super(modelname , cost);
        this.ramsize = ramsize;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Ram size:"+ ramsize + "model name:" + modelname + "cost:"+ cost);

    }

}


    
