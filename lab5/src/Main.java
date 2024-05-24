import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Завдання 1 :");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть довжину сторони квадрата: ");
        int size = scanner.nextInt();
        System.out.printf("Площа квадрата зі стороною %d = %d\n", size, calculateSquareArea(size));

        System.out.println("Завдання 2 :");

        System.out.println("Введіть число 1: ");
        int x1 = scanner.nextInt();
        System.out.println("Введіть число 2: ");
        int x2 = scanner.nextInt();
        System.out.println("Введіть число 3: ");
        int x3 = scanner.nextInt();

        System.out.printf("Найменше з чисел %d, %d, %d = %d\n", x1, x2, x3, findMinimum(x1, x2, x3));

        System.out.println("Завдання 3 :");
        int[] array = {1, 5, 34, 2, 6, 86, 23, 56};
        printArray(array);

        System.out.println("Завдання 4 :");

        int[] array2 = {10, 5, 20, 15, 25, 42, 86, 32, 13, 23};
        System.out.printf("Найбільше число з масиву = %d\n", findMaximum(array2));

    }

    public static int calculateSquareArea(int size) {
        int area = size * size;
        return area;
    }

    public static int findMinimum(int num1, int num2, int num3) {
        if (num1 <= num2 && num1 <= num3) {
            return num1;
        } else if (num2 <= num1 && num2 <= num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public static void printArray(int[] array) {
        System.out.println("Масив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int findMaximum(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

}