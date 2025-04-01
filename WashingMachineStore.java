public class WashingMachineStore {
    static String[] models = new String[20];
    static String[] brands = new String[20];
    static int[] capacities = new int[20];
    static boolean[] isFrontLoadArray = new boolean[20];
    static boolean[] hasInverterMotorArray = new boolean[20];
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

    public static void addWashingMachine(String model) {
        addWashingMachine(model, "Unknown");
    }

    public static void addWashingMachine(String model, String brand) {
        addWashingMachine(model, brand, 7);
    }

    public static void addWashingMachine(String model, String brand, int capacity) {
        addWashingMachine(model, brand, capacity, false);
    }

    public static void addWashingMachine(String model, String brand, int capacity, boolean isFrontLoad) {
        addWashingMachine(model, brand, capacity, isFrontLoad, false);
    }

    public static void addWashingMachine(String model, String brand, int capacity, boolean isFrontLoad, boolean hasInverterMotor) {
        addWashingMachine(model, brand, capacity, isFrontLoad, hasInverterMotor, 0.0);
    }

    public static void addWashingMachine(String model, String brand, int capacity, boolean isFrontLoad, boolean hasInverterMotor, double price) {
        addWashingMachine(model, brand, capacity, isFrontLoad, hasInverterMotor, price, "White");
    }

    public static void addWashingMachine(String model, String brand, int capacity, boolean isFrontLoad, boolean hasInverterMotor, double price, String color) {
        addWashingMachine(model, brand, capacity, isFrontLoad, hasInverterMotor, price, color, "EcoBubble");
    }

    public static void addWashingMachine(String model, String brand, int capacity, boolean isFrontLoad, boolean hasInverterMotor, double price, String color, String washingTechnology) {
        addWashingMachine(model, brand, capacity, isFrontLoad, hasInverterMotor, price, color, washingTechnology, 5);
    }

    public static void addWashingMachine(String model, String brand, int capacity, boolean isFrontLoad, boolean hasInverterMotor, double price, String color, String washingTechnology, int warrantyYears) {
        addWashingMachine(model, brand, capacity, isFrontLoad, hasInverterMotor, price, color, washingTechnology, warrantyYears, true);
    }

    public static void addWashingMachine(String model, String brand, int capacity, boolean isFrontLoad, boolean hasInverterMotor, double price, String color, String washingTechnology, int warrantyYears, boolean hasDryerFunction) {
        if (count < 20 && !isDuplicate(model)) {
            models[count] = model;
            brands[count] = brand;
            capacities[count] = capacity;
            isFrontLoadArray[count] = isFrontLoad;
            hasInverterMotorArray[count] = hasInverterMotor;
            prices[count] = price;
            count++;
            System.out.println("Washing Machine added: " + model);
        } else {
            System.out.println("Cannot add more washing machines or duplicate model found!");
        }
    }

    public static void displayWashingMachines() {
        System.out.println("\nAvailable Washing Machines:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + brands[i] + " " + models[i] + " (" + capacities[i] + "kg) - Rs " + prices[i]);
        }
    }

    public static void searchWashingMachine(String model) {
        for (int i = 0; i < count; i++) {
            if (models[i].equalsIgnoreCase(model)) {
                System.out.println("Washing Machine Found: " + brands[i] + " " + models[i] + " - Rs " + prices[i]);
                return;
            }
        }
        System.out.println("Washing Machine Not Found!");
    }

    public static void updatePrice(String model, double newPrice) {
        for (int i = 0; i < count; i++) {
            if (models[i].equalsIgnoreCase(model)) {
                prices[i] = newPrice;
                System.out.println("Updated Price of " + model + ": Rs " + newPrice);
                return;
            }
        }
        System.out.println("Washing Machine Not Found!");
    }
}
