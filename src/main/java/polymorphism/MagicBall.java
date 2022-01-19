package polymorphism;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String question = input.nextLine();
        do {
            int answer = new Random().nextInt(3);
            if (answer == 1) {
                System.out.println("Да");
            } else if (answer == 2) {
                System.out.println("Нет");
            } else {
                System.out.println("Может быть");
            }
        }
        while (question != null);
    }
}
