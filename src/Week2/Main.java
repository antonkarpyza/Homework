package Week2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int MakeChoice;
        do {
            MakeChoice =  menu();
            switch (MakeChoice){
                case 1:
                    MultiplicationTable.Table();
                    break;
                case 2:
                    Work21 countcharacters = new Work21();
                    countcharacters.symbolCount();
                    break;
                case 3:
                    GamePoker poker = new GamePoker();
                    break;
                case 4:
                    System.out.println("Благодарим Вас за выбор нашей программы!");
                    break;
                default:
                    System.out.println("Выбран неверный пункт меню! Пожалуйста, повторите ваш выбор.");
            }
        } while (MakeChoice != 4);
    }

    private static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите пункт меню:");
        System.out.println("1. Таблица умножения.");
        System.out.println("2. Подсчет символов.");
        System.out.println("3. Покер.");
        System.out.println("4. Выход.");
        return scanner.nextInt();
    }
}