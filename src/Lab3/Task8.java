package Lab3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nЗавдання 8: Пошук у масиві");
        System.out.print("Введіть число для пошуку: ");
        int search = scanner.nextInt();
        boolean found = Arrays.stream(array).anyMatch(num -> num == search);
        System.out.println(found ? "Число знайдено!" : "Число не знайдено!");

        scanner.close();
    }
}
