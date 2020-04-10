package classwork.Week4.Primer;

public class AirPlane implements Fly {


    public boolean inflight() {
        System.out.println("Самолет в полете");
        return true;
    }

    public boolean ontheGround() {
        System.out.println("Самолет на земле");
        return false;
    }
}