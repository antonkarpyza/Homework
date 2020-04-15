package classworkweek5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise {

    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();
        list.add("Car");
        list.add("Airplane");
        list.add("Phone");
        list.add("Computer");
        list.add("Mouse");

        list.remove(3);

        Collections.reverse(list);



        System.out.println(list);


    }
}
