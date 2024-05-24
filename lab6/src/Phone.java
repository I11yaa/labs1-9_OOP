class Phone {
    String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String callerName) {
        System.out.println("Incoming call from " + callerName);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        System.out.println("Sending message to:");
        for (String num : numbers) {
            System.out.println(num);
        }
    }
}

abstract class Car {
    String model;
    String color;
    int maxSpeed;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    void gas() {
        System.out.println("Accelerating!");
    }

    abstract void brake();
}