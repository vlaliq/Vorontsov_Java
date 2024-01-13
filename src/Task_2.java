/*
Составить алгоритм: если введенное имя совпадает с Вячеслав,
то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
*/

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите имя: ");

            if (scanner.hasNextLine()) {

                String name = scanner.nextLine();

                if (name.equals("Вячеслав")) {
                    System.out.println("Привет, Вячеслав");
                    break;
                } else {
                    System.out.println("Нет такого имени");
                }
            }
        }

    }
}
