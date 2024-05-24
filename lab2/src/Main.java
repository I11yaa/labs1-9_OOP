import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4_1();
        task4_2();
    }

    public static void task1() {
        System.out.println("Завдання 1 :");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть коефіцієнти a, b та c квадратного рівняння ax^2 + bx + c = 0");
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();

        double d = b * b - 4 * a * c;

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Розв'язки: x1 = " + x1 + ", x2 = " + x2);
        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("Розв'язок: x = " + x);
        } else {
            System.out.println("Рівняння не має дійсних коренів");
        }

        scanner.close();
    }

    public static void task2() {
        System.out.println("\nЗавдання 2 :");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть координати точки (x, y):");
        System.out.print("x: ");
        double x = scanner.nextDouble();
        System.out.print("y: ");
        double y = scanner.nextDouble();

        int quadrant;

        if (x > 0 && y > 0) {
            quadrant = 1;
        } else if (x < 0 && y > 0) {
            quadrant = 2;
        } else if (x < 0 && y < 0) {
            quadrant = 3;
        } else if (x > 0 && y < 0) {
            quadrant = 4;
        } else {
            quadrant = 0;
        }

        if (quadrant != 0) {
            System.out.println("Точка знаходиться в " + quadrant + " квадранті.");
        } else {
            System.out.println("Точка лежить на одній з координатних вісей.");
        }

        scanner.close();
    }

    public static void task3() {
        System.out.println("\nЗавдання 3 :");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть число:");
        int number = scanner.nextInt();

        if (number >= 10 && number <= 99) {
            System.out.print("Число " + number + " двозначне і ");
        } else {
            System.out.print("Число " + number + " не двозначне і ");
        }
        if (number % 2 == 0) {
            System.out.print("парне.");
        } else {
            System.out.print("непарне");

        }

        scanner.close();
    }

    public static void task4_1() {
        System.out.println("\nЗавдання 4.1 :");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть x:");
        int x = scanner.nextInt();

        if (x < 0) {
            System.out.printf("Результат: %f", Math.pow(x, 2) + 3);
        } else if (x <= 5) {
            System.out.printf("Результат: %f", 6 * Math.sqrt(x));
        } else {
            System.out.printf("Результат: %d", -x + 9);
        }

        scanner.close();
    }

    public static void task4_2() {
        System.out.println("\nЗавдання 4.1 :");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть номер дня тижня:");
        int dayNumber = scanner.nextInt();

        String dayType;

        switch (dayNumber) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "робочим.";
                break;
            case 6:
            case 7:
                dayType = "вихідним.";
                break;
            default:
                dayType = "некоректним номером дня.";
                break;
        }

        System.out.println("День " + dayNumber + " є " + dayType);

        scanner.close();
    }
}