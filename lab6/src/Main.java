public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.move();
        person1.talk();

        Person person2 = new Person("John Doe", 30);
        person2.move();
        person2.talk();

        Phone phone1 = new Phone("123456789", "Samsung Galaxy", 0.2);
        Phone phone2 = new Phone("987654321", "iPhone");
        Phone phone3 = new Phone();

        System.out.println("Phone 1: " + phone1.getNumber() + ", " + phone1.model + ", " + phone1.weight + " kg");
        System.out.println("Phone 2: " + phone2.getNumber() + ", " + phone2.model);
        System.out.println("Phone 3: " + phone3.getNumber());

        phone1.receiveCall("Alice");
        phone2.receiveCall("Bob");
        phone3.receiveCall("Charlie");

        phone1.sendMessage("111", "222", "333");

        Sedan sedan = new Sedan("Toyota Camry", "Red", 180);
        Truck truck = new Truck("Volvo FH", "Blue", 120);

        sedan.gas();
        sedan.brake();

        truck.gas();
        truck.brake();

        Triangle triangle = new Triangle(3, 4);
        System.out.println("Sin: " + triangle.calculateSin());
        System.out.println("Cos: " + triangle.calculateCos());
        System.out.println("Tan: " + triangle.calculateTan());
    }
}

class Sedan extends Car {
    public Sedan(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    void brake() {
        System.out.println("Sedan is braking!");
    }
}

class Truck extends Car {
    public Truck(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    void brake() {
        System.out.println("Truck is braking!");
    }
}


class Shape {

    protected double volume;

    public double getVolume() {
        return volume;
    }
}

class SolidOfRevolution extends Shape {

    protected double radius;

    public SolidOfRevolution(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

class Cylinder extends SolidOfRevolution {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        this.volume = Math.PI * radius * radius * height;
    }
}

class Pyramid extends SolidOfRevolution {

    private double s; // Ширина основи
    private double h; // Висота

    public Pyramid(double radius, double s, double h) {
        super(radius);
        this.s = s;
        this.h = h;
        this.volume = (1.0 / 3) * Math.PI * radius * radius * h;
    }
}
