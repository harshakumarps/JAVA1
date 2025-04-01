public class RefrigeratorStore {
    static String[] models = new String[20]; 
    static String[] brands = new String[20]; 
    static int[] capacities = new int[20]; 
    static boolean[] isDoubleDoorArray = new boolean[20]; 
    static boolean[] hasInverterTechnologyArray = new boolean[20]; 
    static double[] prices = new double[20]; 
    static int count = 0; 

    public static boolean isDuplicate(String model) {
        for (int i = 0; i < count; i++) {
            if (models[i] != null && models[i].equalsIgnoreCase(model)) {
                return true;
            }
        }
        return false;
    }

    public static void addRefrigerator(String model) {
        addRefrigerator(model, "Unknown");
    }

    public static void addRefrigerator(String model, String brand) {
        addRefrigerator(model, brand, 200);
    }

    public static void addRefrigerator(String model, String brand, int capacity) {
        addRefrigerator(model, brand, capacity, false);
    }

    public static void addRefrigerator(String model, String brand, int capacity, boolean isDoubleDoor) {
        addRefrigerator(model, brand, capacity, isDoubleDoor, false);
    }

    public static void addRefrigerator(String model, String brand, int capacity, boolean isDoubleDoor, boolean hasInverterTechnology) {
        addRefrigerator(model, brand, capacity, isDoubleDoor, hasInverterTechnology, 0.0);
    }

    public static void addRefrigerator(String model, String brand, int capacity, boolean isDoubleDoor, boolean hasInverterTechnology, double price) {
        addRefrigerator(model, brand, capacity, isDoubleDoor, hasInverterTechnology, price, "Silver");
    }

    public static void addRefrigerator(String model, String brand, int capacity, boolean isDoubleDoor, boolean hasInverterTechnology, double price, String color) {
        addRefrigerator(model, brand, capacity, isDoubleDoor, hasInverterTechnology, price, color, "Frost Free");
    }

    public static void addRefrigerator(String model, String brand, int capacity, boolean isDoubleDoor, boolean hasInverterTechnology, double price, String color, String coolingTechnology) {
        addRefrigerator(model, brand, capacity, isDoubleDoor, hasInverterTechnology, price, color, coolingTechnology, 5);
    }

    public static void addRefrigerator(String model, String brand, int capacity, boolean isDoubleDoor, boolean hasInverterTechnology, double price, String color, String coolingTechnology, int warrantyYears) {
        addRefrigerator(model, brand, capacity, isDoubleDoor, hasInverterTechnology, price, color, coolingTechnology, warrantyYears, true);
    }

    public static void addRefrigerator(String model, String brand, int capacity, boolean isDoubleDoor, boolean hasInverterTechnology, double price, String color, String coolingTechnology, int warrantyYears, boolean hasWaterDispenser) {
        if (count < 20 && !isDuplicate(model)) {
            models[count] = model;
            brands[count] = brand;
            capacities[count] = capacity;
            isDoubleDoorArray[count] = isDoubleDoor;  // FIXED
            hasInverterTechnologyArray[count] = hasInverterTechnology;  // FIXED
            prices[count] = price;
            count++;
            System.out.println("Refrigerator added: " + model);
        } else {
            System.out.println("Cannot add more refrigerators or duplicate model found!");
        }
    }

    public static void displayRefrigerators() {
        System.out.println("\nAvailable Refrigerators:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + brands[i] + " " + models[i] + " (" + capacities[i] + "L) - Rs " + prices[i]);
        }
    }

    public static void searchRefrigerator(String model) {
        for (int i = 0; i < count; i++) {
            if (models[i].equalsIgnoreCase(model)) {
                System.out.println("Refrigerator Found: " + brands[i] + " " + models[i] + " - Rs " + prices[i]);
                return;
            }
        }
        System.out.println("Refrigerator Not Found!");
    }

    public static void updatePrice(String model, double newPrice) {
        for (int i = 0; i < count; i++) {
            if (models[i].equalsIgnoreCase(model)) {
                prices[i] = newPrice;
                System.out.println("Updated Price of " + model + ": Rs " + newPrice);
                return;
            }
        }
        System.out.println("Refrigerator Not Found!");
    }
}
