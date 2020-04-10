package classwork.Week4.Primer;

public class Balloon implements Fly {

    public boolean inflight() {
        System.out.println("Воздушный шар в полете");
        return true;
    }

    public boolean ontheGround() {
        System.out.println("Воздушный шар на земле");
        return false;


    }
}