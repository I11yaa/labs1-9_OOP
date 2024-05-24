public class Main {
    public static void main(String[] args) {
        System.out.print("Завдання 1 :\n");
        int a = 195;
        int b = 1;
        int c = 5;
        float d = 0.2f;
        int e = 3;
        int f = 1;
        int g = 7;
        float h = 3.4f;
        int i = 6;
        int j = 1;

        System.out.printf("Додавання : %f\n", a + b + c + d + e + f + g + h + i + j);
        System.out.printf("Віднімання : %f\n", a - b - c - d - e - f - g - h - i - j);
        System.out.printf("Множення : %f\n", a * b * c * d * e * f * g * h * i * j);
        System.out.printf("Ділення : %f\n", a / b / c / d / e / f / g / h / i / j);

        System.out.print("\nЗавдання 2 :\n");
        String word1 = "Я";
        String word2 = "вивчаю";
        String word3 = "мову";
        String word4 = "програмування";
        String word5 = "Java.";
        System.out.println(word1 + " " + word2 + " " + word3 + " " + word4 + " " + word5);

        System.out.print("\nЗавдання 3 :\n");
        User user1 = new User(1, 25, "Іван", "Петров", 70.5, 175.0);
        User user2 = new User(2, 30, "Олена", "Сидоренко", 60.2, 165.1);
        User user3 = new User(3, 22, "Максим", "Коваленко", 80.0, 180.7);
        User user4 = new User(4, 28, "Анна", "Іванова", 55.8, 160.0);
        User user5 = new User(5, 35, "Віктор", "Смирнов", 75.3, 185.0);
        User user6 = new User(6, 40, "Марія", "Ковальчук", 65.0, 170.6);
        User user7 = new User(7, 20, "Петро", "Семенов", 90.2, 190.0);
        User user8 = new User(8, 27, "Катерина", "Попова", 58.6, 163.5);
        User user9 = new User(9, 32, "Олексій", "Лисенко", 72.1, 177.2);
        User user10 = new User(10, 26, "Юлія", "Мельник", 63.7, 168.0);

        System.out.printf("Додавання віку: %d\n", user1.age + user2.age + user3.age +
                user4.age + user5.age + user6.age + user7.age +
                user8.age + user9.age + user10.age);

        System.out.printf("Додавання ваги: %.1f\n", user1.weight + user2.weight + user3.weight + user4.weight +
                user5.weight + user6.weight + user7.weight + user8.weight +
                user9.weight + user10.weight);

        System.out.printf("Додавання зросту: %.1f\n", user1.height + user2.height + user3.height + user4.height +
                user5.height + user6.height + user7.height + user8.height +
                user9.height + user10.height);

        System.out.print("\nЗавдання 4 :\n");

        Car car1 = new Car(150, 1.6, "Toyota", "Corolla", 2015, true);
        Car car2 = new Car(200, 2.0, "BMW", "3 Series", 2018, true);
        Car car3 = new Car(180, 1.8, "Honda", "Civic", 2017, false);
        Car car4 = new Car(170, 1.5, "Ford", "Focus", 2016, true);
        Car car5 = new Car(250, 3.0, "Mercedes-Benz", "E-Class", 2020, true);
        Car car6 = new Car(190, 2.0, "Audi", "A4", 2019, false);
        Car car7 = new Car(160, 1.6, "Hyundai", "Elantra", 2016, true);
        Car car8 = new Car(220, 2.5, "Nissan", "Altima", 2017, true);
        Car car9 = new Car(240, 2.0, "Volkswagen", "Jetta", 2018, false);
        Car car10 = new Car(210, 2.2, "Subaru", "Impreza", 2015, false);

        System.out.printf("Додавання об'ємів двигунів: %f\n", car1.engineVolume + car2.engineVolume +
                car3.engineVolume + car4.engineVolume + car5.engineVolume + car6.engineVolume +
                car7.engineVolume + car8.engineVolume + car9.engineVolume + car10.engineVolume);

        System.out.printf("Додавання отужностей: %d\n", car1.horsepower + car2.horsepower +
                car3.horsepower + car4.horsepower + car5.horsepower + car6.horsepower +
                car7.horsepower + car8.horsepower + car9.horsepower + car10.horsepower);

        System.out.print("\nЗавдання 5 :\n");

        int number = 412;
        int reversedNumber = 0;

        reversedNumber = reversedNumber + number % 10 * 100;
        number = number / 10;

        reversedNumber = reversedNumber + number % 10 * 10;
        number = number / 10;

        reversedNumber = reversedNumber + number;

        System.out.print("Реверсоване число: %d" + reversedNumber);
    }
}