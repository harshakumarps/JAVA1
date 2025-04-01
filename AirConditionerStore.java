public class AirConditionerStore {
    static String[] models = new String[20];
    static String[] brands = new String[20];
    static double[] capacities = new double[20]; // Changed from int to double
    static boolean[] isInverterArray = new boolean[20];
    static boolean[] hasWiFiArray = new boolean[20];
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

    public static void addAirConditioner(String model) {
        addAirConditioner(model, "Unknown");
    }

    public static void addAirConditioner(String model, String brand) {
        addAirConditioner(model, brand, 1.0);
    }

    public static void addAirConditioner(String model, String brand, double capacity) {
        addAirConditioner(model, brand, capacity, false);
    }

    public static void addAirConditioner(String model, String brand, double capacity, boolean isInverter) {
        addAirConditioner(model, brand, capacity, isInverter, false);
    }

    public static void addAirConditioner(String model, String brand, double capacity, boolean isInverter, boolean hasWiFi) {
        addAirConditioner(model, brand, capacity, isInverter, hasWiFi, 0.0);
    }

    public static void addAirConditioner(String model, String brand, double capacity, boolean isInverter, boolean hasWiFi, double price) {
        addAirConditioner(model, brand, capacity, isInverter, hasWiFi, price, "White");
    }

    public static void addAirConditioner(String model, String brand, double capacity, boolean isInverter, boolean hasWiFi, double price, String color) {
        addAirConditioner(model, brand, capacity, isInverter, hasWiFi, price, color, "Copper Coil");
    }

    public static void addAirConditioner(String model, String brand, double capacity, boolean isInverter, boolean hasWiFi, double price, String color, String coilType) {
        addAirConditioner(model, brand, capacity, isInverter, hasWiFi, price, color, coilType, 5);
    }

    public static void addAirConditioner(String model, String brand, double capacity, boolean isInverter, boolean hasWiFi, double price, String color, String coilType, int warrantyYears) {
        addAirConditioner(model, brand, capacity, isInverter, hasWiFi, price, color, coilType, warrantyYears, true);
    }

    public static void addAirConditioner(String model, String brand, double capacity, boolean isInverter, boolean hasWiFi, double price, String color, String coilType, int warrantyYears, boolean hasDehumidifier) {
        if (count < 20 && !isDuplicate(model)) {
            models[count] = model;
            brands[count] = brand;
            capacities[count] = capacity;
            isInverterArray[count] = isInverter;
            hasWiFiArray[count] = hasWiFi;
            prices[count] = price;
            count++;
            System.out.println("Air Conditioner added: " + model);
        } else {
            System.out.println("Cannot add more air conditioners or duplicate model found!");
        }
    }

    public static void displayAirConditioners() {
        System.out.println("\nAvailable Air Conditioners:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + brands[i] + " " + models[i] + " (" + capacities[i] + " Ton) - Rs " + prices[i]);
        }
    }

    public static void searchAirConditioner(String model) {
        for (int i = 0; i < count; i++) {
            if (models[i].equalsIgnoreCase(model)) {
                System.out.println("Air Conditioner Found: " + brands[i] + " " + models[i] + " - Rs " + prices[i]);
                return;
            }
        }
        System.out.println("Air Conditioner Not Found!");
    }

    public static void updatePrice(String model, double newPrice) {
        for (int i = 0; i < count; i++) {
            if (models[i].equalsIgnoreCase(model)) {
                prices[i] = newPrice;
                System.out.println("Updated Price of " + model + ": Rs " + newPrice);
                return;
            }
        }
        System.out.println("Air Conditioner Not Found!");
    }
}
