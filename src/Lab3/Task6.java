package Lab3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nЗавдання 6: Мінімум, максимум, середнє та парні числа");
        int min = Arrays.stream(array).min().orElse(0);
        int max = Arrays.stream(array).max().orElse(0);
        double average = Arrays.stream(array).average().orElse(0.0);
        long evenCount = Arrays.stream(array).filter(num -> num % 2 == 0).count();
        System.out.printf("Мінімальне: %d, Максимальне: %d, Середнє: %.2f, Парних чисел: %d\n", min, max, average, evenCount);
        scanner.close();
    }
}
