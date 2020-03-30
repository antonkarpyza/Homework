package Week1;

public class Task2 {
    public static void main(String[] args) {

        int a = 66;
        int b = 33;
        int c = 51;

        if (a < b && a < c){
            if(b < c)
                System.out.println("Вывод: " + a + ", " + b + ", " + c);
            else
                System.out.println("Вывод: " + a + ", " + c + ", " + b);

        }else if (b < a && b < c){
            if(a<c)
                System.out.println("Вывод: " + b + ", " + a + ", " + c);
            else
                System.out.println("Вывод: " + b + ", " + c + ", " + a);
        }else{
            if(a<b)
                System.out.println("Вывод: " + c + ", " + a + ", " + b);

            else
                System.out.println("Вывод: " + c + ", " + b + ", " + a);
        }
    }
}
