package Lab1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        boolean isAdult = age >= 18;
        if (isAdult) {
            System.out.print("I finished the school");
        } else {
            System.out.print("I entered the University");
            scanner.close();
        }
    }
}
