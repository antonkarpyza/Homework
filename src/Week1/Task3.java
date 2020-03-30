package Week1;

public class Task3 {
    public static void main(String[] args) {
        double x = 8.5;
        double y = 8.5;
        double a = x-10;
        double b = y-10;



        a=a<0 ? -a:a;
        b=b<0 ? -b:b;

        if(a<b){
            System.out.println("ближайшее к 10 число " +x);
        }
        else if (a>b){
            System.out.println("ближайшее к 10 число " +y);
        }
        else {
            System.out.println("числа равноудаленны от 10");
        }


    }
}
