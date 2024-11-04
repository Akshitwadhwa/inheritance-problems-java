public class animal {
    public void makesound(){
        System.out.println("animal makes sound");
    }
    public static void main(String[] args) {
        animal a = new animal();
        a.makesound();

        mammal m = new mammal();
        m.makesound();
        m.givebirth();

        dog d = new dog();
        d.makesound();
        d.givebirth();

    }


}
class mammal extends animal{
    public void givebirth(){
        System.out.println("giving birth");
    }
}

class dog extends mammal{
    @Override
    public void makesound(){
        System.out.println("woof!");
    }
}
