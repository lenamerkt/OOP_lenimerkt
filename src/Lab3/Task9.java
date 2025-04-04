package Lab3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nЗавдання 9: Зміна елемента у масиві");
        System.out.print("Введіть індекс елемента (0-" + (array.length - 1) + "): ");
        int index = scanner.nextInt();
        System.out.print("Введіть нове значення: ");
        int newValue = scanner.nextInt();
        if (index >= 0 && index < array.length) {
            array[index] = newValue;
        } else {
            System.out.println("Неправильний індекс.");
        }
        System.out.println("Оновлений масив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        scanner.close();
    }
}
