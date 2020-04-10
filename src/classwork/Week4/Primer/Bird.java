package classwork.Week4.Primer;

public class Bird implements Fly {


    @Override
    public boolean inflight() {
        System.out.println("Птица в полете");
        return true;
    }

    @Override
    public boolean ontheGround() {
        System.out.println("Птица на земле");
        return false;
    }
}
