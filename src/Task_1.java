//Составить алгоритм: если введенное число больше 7, то вывести “Привет”

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите число: ");

            if (scanner.hasNextInt()) {

                int number = scanner.nextInt();

                if (number > 7) {
                    System.out.println("Привет");
                    break;
                } else {
                    System.out.println("Число меньше, либо равно 7");
                }
            } else {
                System.out.println("Ошибка, введите целое число");
                scanner.next();
            }
        }
    }
}
