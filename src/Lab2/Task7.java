package Lab2;

import java.util.Scanner;;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть мінімальне значення: ");
        int min = scanner.nextInt();
        System.out.print("Введіть максимальне значення: ");
        int maxRange = scanner.nextInt();
        int randomNum = min + (int) (Math.random() * (maxRange - min + 1));
        System.out.printf("Згенероване число: %d\n", randomNum);
        System.out.printf("Число %d є %s.\n", randomNum, (randomNum % 2 == 0 ? "парним" : "непарним"));
        scanner.close();
    }
}
