public class Car {
     int horsepower;
     double engineVolume;
     String brand;
     String model;
     int year;
     boolean isAutomatic;

    // Конструктор класу Car
    public Car(int horsepower, double engineVolume, String brand, String model, int year, boolean isAutomatic) {
        this.horsepower = horsepower;
        this.engineVolume = engineVolume;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.isAutomatic = isAutomatic;
    }
}
