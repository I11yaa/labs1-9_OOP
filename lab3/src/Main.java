import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5_for();
        task5_while();

    }

    public static void task1() {
        System.out.println("Завдання 1 :");

        for (int i = 0; i < 50; i++) {
            System.out.println("Ітре всіх зітре!");
        }

        int i = 0;
        while (i < 50) {
            System.out.println("Ітре всіх зітре!");
            i++;
        }
    }

    public static void task2() {
        System.out.println("Завдання 2 :");
        for (int hours = 0; hours < 3; hours++) {
            for (int minutes = 0; minutes < 60; minutes++) {
                System.out.printf("%d h %d min\n", hours, minutes);
            }
        }
    }

    public static void task3() {
        System.out.println("Завдання 3 :");
        int hours = 0;
        while (hours < 3) {
            int minutes = 0;
            while (minutes < 60) {
                System.out.printf("%d h %d min\n", hours, minutes);
                minutes++;
            }
            hours++;
        }
    }

    public static void task4() {
        System.out.println("Завдання 4 :");

        for (int hours = 0; hours < 3; hours++) {
            for (int minutes = 0; minutes < 60; minutes++) {
                for (int seconds = 0; seconds < 60; seconds++) {
                    System.out.printf("%d h %d min %d sec\n", hours, minutes, seconds);
                }
            }
        }
    }

    public static void task5_for() {
        System.out.println("Завдання 5 (for):");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть ліву границю діапазону:");
        int leftBound = scanner.nextInt();

        System.out.println("Введіть праву границю діапазону:");
        int rightBound = scanner.nextInt();

        int i = 0;

        System.out.println("Табулювання функції f(x) = Math.sqrt(x) / (x + 1) у заданому діапазоні:");

        for (double x = leftBound; x <= rightBound; x++) {
            double result = Math.sqrt(x) / (x + 1);
            System.out.println("f(" + x + ") = " + result);
            if (result >= leftBound && result <= rightBound) {
                i++;
            }
        }

        if (i == 0) {
            System.out.println("Немає значень функції, що знаходяться в заданому діапазоні.");
        } else {
            System.out.println("Кількість значень функції, що знаходяться в заданому діапазоні: " + i);
        }

        scanner.close();
    }

    public static void task5_while() {
        System.out.println("Завдання 5 (while):");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть ліву границю діапазону:");
        int leftBound = scanner.nextInt();

        System.out.println("Введіть праву границю діапазону:");
        int rightBound = scanner.nextInt();

        int i = 0;
        double x = leftBound;

        System.out.println("Табулювання функції f(x) = Math.sqrt(x) / (x + 1) у заданому діапазоні:");

        while (x <= rightBound) {
            double result = Math.sqrt(x) / (x + 1);
            System.out.println("f(" + x + ") = " + result);
            if (result >= leftBound && result <= rightBound) {
                i++;
            }
            x++;
        }

        if (i == 0) {
            System.out.println("Немає значень функції, що знаходяться в заданому діапазоні.");
        } else {
            System.out.println("Кількість значень функції, що знаходяться в заданому діапазоні: " + i);
        }

        scanner.close();
    }
}