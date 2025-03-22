package Lab3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nЗавдання 2: Гра 'Вгадай число'");
        int secretNumber = 15; // Задайте секретне число
        int guess;
        do {
            System.out.print("Введіть число: ");
            guess = scanner.nextInt();
            if (guess < secretNumber) {
                System.out.println("Загадане число більше.");
            } else if (guess > secretNumber) {
                System.out.println("Загадане число менше.");
            }
        } while (guess != secretNumber);
        System.out.println("Ви вгадали!");
        scanner.close();
    }
}
