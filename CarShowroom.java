public class CarShowroom {
    static String[] cars = new String[20]; // Array to store car names
    static String[] brands = new String[20]; // Array to store car brands
    static int[] horsepowers = new int[20]; // Array to store car horsepowers
    static double[] prices = new double[20]; // Array to store car prices
    static String[] fuelTypes = new String[20]; // Array to store car fuel types
    static int count = 0; // Counter to track number of cars

    // 1. Check for duplicates
    public static boolean isDuplicate(String carName) {
        for (int i = 0; i < count; i++) {
            if (cars[i] != null && cars[i].equalsIgnoreCase(carName)) {
                return true;
            }
        }
        return false;
    }

    // 2-11. Overloaded methods to add cars
    public static void addCar(String name) { 
        addCar(name, "Unknown"); 
    }
    
    public static void addCar(String name, String brand) { 
        addCar(name, brand, 0); 
    }
    
    public static void addCar(String name, String brand, int horsepower) { 
        addCar(name, brand, horsepower, 0.0); 
    }
    
    public static void addCar(String name, String brand, int horsepower, double price) { 
        addCar(name, brand, horsepower, price, "Petrol"); 
    }
    
    public static void addCar(String name, String brand, int horsepower, double price, String fuelType) { 
        addCar(name, brand, horsepower, price, fuelType, "Sedan"); 
    }
    
    public static void addCar(String name, String brand, int horsepower, double price, String fuelType, String type) { 
        addCar(name, brand, horsepower, price, fuelType, type, "White"); 
    }
    
    public static void addCar(String name, String brand, int horsepower, double price, String fuelType, String type, String color) { 
        addCar(name, brand, horsepower, price, fuelType, type, color, 5); 
    }
    
    public static void addCar(String name, String brand, int horsepower, double price, String fuelType, String type, String color, int seats) { 
        addCar(name, brand, horsepower, price, fuelType, type, color, seats, "New"); 
    }
    
    public static void addCar(String name, String brand, int horsepower, double price, String fuelType, String type, String color, int seats, String condition) { 
        addCar(name, brand, horsepower, price, fuelType, type, color, seats, condition, 2023); 
    }
    
    public static void addCar(String name, String brand, int horsepower, double price, String fuelType, String type, String color, int seats, String condition, int year) {
        if (isDuplicate(name)) {
            System.out.println("Duplicate car \"" + name + "\" found! Not adding.");
            return;
        }
        if (count < cars.length) {
            cars[count] = name;
            brands[count] = brand;
            horsepowers[count] = horsepower;
            prices[count] = price;
            fuelTypes[count] = fuelType;
            count++;
            System.out.println("Added Car: " + name);
        } else {
            System.out.println("Car list is full! Cannot add: " + name);
        }
    }

    // Display methods
    public static void display() {
        System.out.println("\nAll Cars in Showroom:");
        for (int i = 0; i < count; i++) {
            if (cars[i] != null) {
                System.out.println("- " + cars[i] + " (" + brands[i] + ", " + horsepowers[i] + " HP, $" + prices[i] + " Lakh, " + fuelTypes[i] + ")");
            }
        }
    }

    public static void display(String brand) {
        System.out.println("\nCars of Brand: " + brand);
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (cars[i] != null && brands[i].equalsIgnoreCase(brand)) {
                System.out.println("- " + cars[i] + " (" + brands[i] + ", " + horsepowers[i] + " HP, $" + prices[i] + " Lakh, " + fuelTypes[i] + ")");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No cars found for brand: " + brand);
        }
    }

    public static void display(int horsepower) {
        System.out.println("\nCars with " + horsepower + " HP:");
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (cars[i] != null && horsepowers[i] == horsepower) {
                System.out.println("- " + cars[i] + " (" + brands[i] + ", " + horsepowers[i] + " HP, $" + prices[i] + " Lakh, " + fuelTypes[i] + ")");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No cars found with " + horsepower + " HP");
        }
    }

    public static void display(double price) {
        System.out.println("\nCars priced at $" + price + " Lakh:");
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (cars[i] != null && prices[i] == price) {
                System.out.println("- " + cars[i] + " (" + brands[i] + ", " + horsepowers[i] + " HP, $" + prices[i] + " Lakh, " + fuelTypes[i] + ")");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No cars found priced at $" + price + " Lakh");
        }
    }

    public static void display(String brand, int horsepower) {
        System.out.println("\nCars of " + brand + " with " + horsepower + " HP:");
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (cars[i] != null && brands[i].equalsIgnoreCase(brand) && horsepowers[i] == horsepower) {
                System.out.println("- " + cars[i] + " (" + brands[i] + ", " + horsepowers[i] + " HP, $" + prices[i] + " Lakh, " + fuelTypes[i] + ")");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No cars found of brand " + brand + " with " + horsepower + " HP");
        }
    }

    public static void display(String brand, double price) {
        System.out.println("\nCars of " + brand + " priced at $" + price + " Lakh:");
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (cars[i] != null && brands[i].equalsIgnoreCase(brand) && prices[i] == price) {
                System.out.println("- " + cars[i] + " (" + brands[i] + ", " + horsepowers[i] + " HP, $" + prices[i] + " Lakh, " + fuelTypes[i] + ")");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No cars found of brand " + brand + " priced at $" + price + " Lakh");
        }
    }

    // Searching cars
    public static boolean searchCar(String name) {
        for (int i = 0; i < count; i++) {
            if (cars[i] != null && cars[i].equalsIgnoreCase(name)) {
                System.out.println("Car Found: " + name + " (" + brands[i] + ", " + horsepowers[i] + " HP, $" + prices[i] + " Lakh, " + fuelTypes[i] + ")");
                return true;
            }
        }
        System.out.println("Car Not Found: " + name);
        return false;
    }

    public static int getTotalCars() {
        return count;
    }

    public static boolean isShowroomFull() {
        return count >= cars.length;
    }
}