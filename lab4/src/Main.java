public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Завдання 1 :");

        int[] numbers = new int[100];

        for (int i = 0; i < 50; i++) {
            numbers[i] = 2 * (i + 1);
        }

        for (int i = 50; i < 100; i++) {
            numbers[i] = 2 * i + 1;
        }
    }

    public static void task2() {
        System.out.println("Завдання 2 :");

        int[] array = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};

        System.out.println("Перебір масиву циклом while:");
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }

        System.out.println("\nПеребір масиву циклом for:");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nПеребір масиву з непарним індексом циклом while:");
        i = 1;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i += 2;
        }

        System.out.println("\nПеребір масиву з парним індексом циклом for:");
        for (i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nМасив у зворотньому порядку:");
        for (i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void task3() {
        System.out.println("\nЗавдання 3 :");

        double[] array = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5, 8.5, 9.5, 10.5};

        double sum = 0.0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("Сума елементів масиву: " + sum);
    }

    public static void task4() {
        System.out.println("Завдання 4 :");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = -array[i];
            }
        }

        System.out.println("Масив після зміни знаку непарних елементів:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

}