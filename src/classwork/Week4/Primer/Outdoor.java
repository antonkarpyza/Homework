package classwork.Week4.Primer;

public class Outdoor {

    public Fly flies[];

    public Outdoor(Fly[] workables) {
        this.flies = workables;
    }

    public void inflightAll() {
        for (int i = 0; i < flies.length; i++) {
            flies[i].inflight();
        }
    }

    public void ontheGround() {
        for (int i = 0; i < flies.length; i++) {
            flies[i].ontheGround();
        }
    }

    public static void main(String[] args) {
        Fly flies[] = new Fly[3];
        flies[0] = new AirPlane();
        flies[1] = new Balloon();
        flies[2] = new Bird();

        Outdoor room312 = new Outdoor(flies);
        room312.inflightAll();
        room312.ontheGround();
    }

}
