//Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3

import java.util.Random;
import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size;

        while (true) {
            System.out.println("Введите размерность массива: ");
            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
                if (size <= 0) {
                    System.out.println("Размерность массива должна быть больше 0.");
                } else {
                    break;
                }
            } else {
                System.out.println("Некорректный ввод, введите целое число.");
                scanner.next();
            }
        }

        int[] array = new int[size];

        System.out.println("Выберите способ заполнения массива:");
        System.out.println("    1 - Заполнение рандомными числами");
        System.out.println("    2 - Ручной ввод с клавиатуры");

        int select = scanner.nextInt();

        if (select == 1){
            for (int i = 0; i<size; i++){
                array[i] = random.nextInt(101);
            }
        }
        else if (select == 2){
            System.out.println("Вводите числа через пробел");
            for (int i = 0; i<size; i++){
                array[i] = scanner.nextInt();
            }
        }

        System.out.println("Введенный массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        boolean found = false;

        System.out.println("\nЭлементы массива, кратные 3:");
        for (int i = 0; i < size; i++) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + " ");
                found = true;
            }
        }
        if (!found){ System.out.println("\nЭлементы не найдены"); }

    }
}
