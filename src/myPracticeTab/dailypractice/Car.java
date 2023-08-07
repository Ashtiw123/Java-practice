package myPracticeTab.dailypractice;

// Instance Variable

public class Car {
          // Instance variables
        private String make;
        private String model;
        private int year;
        private double price;

        // Constructor to initialize the instance variables
        public Car(String make, String model, int year, double price) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.price = price;
        }

        // Getter methods to access the instance variables
        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public int getYear() {
            return year;
        }

        public double getPrice() {
            return price;
        }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota","Corolla", 2022, 25000.0);
        Car car2 = new Car("Honda", "Civic", 2023, 27000.0);

        System.out.println("Car 1 details:");
        System.out.println("Make: " + car1.getMake());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Price: $" + car1.getPrice());

        System.out.println();

        System.out.println("Car 2 details:");
        System.out.println("Make: " + car2.getMake());
        System.out.println("Model: " + car2.getModel());
        System.out.println("Year: " + car2.getYear());
        System.out.println("Price: $" + car2.getPrice());
    }


}
