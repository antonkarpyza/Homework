package Week2;

public class MultiplicationTable {

    public static void Table() {

        System.out.println("Таблица умножения");

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i*j + " ");
                if(i*j<10){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
