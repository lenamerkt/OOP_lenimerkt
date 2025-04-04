package Lab3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nЗавдання 10: Заповнення масиву вручну");
        System.out.print("Введіть розмір нового масиву: ");
        int newSize = scanner.nextInt();
        int[] manualArray = new int[newSize];
        for (int i = 0; i < newSize; i++) {
            System.out.print("Введіть елемент " + (i + 1) + ": ");
            manualArray[i] = scanner.nextInt();
        }
        System.out.println("Введений масив:");
        for (int num : manualArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Дублікати у масиві:");
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int num : manualArray) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        if (duplicates.isEmpty()) {
            System.out.println("Дублікати відсутні.");
        } else {
            System.out.println(duplicates);
        }
        scanner.close();
    }
}
