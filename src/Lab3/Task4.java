package Lab3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nЗавдання 4: Сума чисел від 1 до N");
        System.out.print("Введіть N: ");
        int N = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("Сума: " + sum);
        scanner.close();
    }
}
