package Lab2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // Очищення буфера
        System.out.print("Введіть електронну пошту: ");
        String email = scanner.nextLine();
        if (email.contains("@")) {
            String username = email.substring(0, email.indexOf('@'));
            String domain = email.substring(email.indexOf('@') + 1);
            System.out.printf("Інформація про користувача: username – %s, поштовий сервіс - %s\n", username, domain);
        } else {
            System.out.println("Ви ввели не електронну адресу. Спробуйте ще раз.");
            scanner.close();
        }
    }
}
