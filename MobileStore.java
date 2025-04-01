public class MobileStore {
    static String[] names = new String[20]; 
    static String[] brands = new String[20]; 
    static int[] storages = new int[20]; 
    static double[] prices = new double[20]; 
    static String[] processors = new String[20]; 
    static String[] colors = new String[20]; 
    static int[] batteryCapacities = new int[20];
    static int[] cameras = new int[20]; 
    static String[] operatingSystems = new String[20]; 
    static int count = 0;

    // Check for duplicate
    public static boolean isDuplicate(String name) {
        for (int i = 0; i < count; i++) {
            if (names[i] != null && names[i].equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    // 1-10. Overloaded methods to add mobiles
    public static void addMobile(String name) { addMobile(name, "Unknown"); }
    public static void addMobile(String name, String brand) { addMobile(name, brand, 64); }
    public static void addMobile(String name, String brand, int storage) { addMobile(name, brand, storage, 20000.0); }
    public static void addMobile(String name, String brand, int storage, double price) { addMobile(name, brand, storage, price, "Snapdragon 888"); }
    public static void addMobile(String name, String brand, int storage, double price, String processor) { addMobile(name, brand, storage, price, processor, "Black"); }
    public static void addMobile(String name, String brand, int storage, double price, String processor, String color) { addMobile(name, brand, storage, price, processor, color, 4000); }
    public static void addMobile(String name, String brand, int storage, double price, String processor, String color, int batteryCapacity) { addMobile(name, brand, storage, price, processor, color, batteryCapacity, 48); }
    public static void addMobile(String name, String brand, int storage, double price, String processor, String color, int batteryCapacity, int camera) { addMobile(name, brand, storage, price, processor, color, batteryCapacity, camera, "Android"); }
    public static void addMobile(String name, String brand, int storage, double price, String processor, String color, int batteryCapacity, int camera, String operatingSystem) { 
        addMobile(name, brand, storage, price, processor, color, batteryCapacity, camera, operatingSystem, true);
    }
    public static void addMobile(String name, String brand, int storage, double price, String processor, String color, int batteryCapacity, int camera, String operatingSystem, boolean is5G) {
        if (isDuplicate(name)) {
            System.out.println("Duplicate mobile \"" + name + "\" found! Not adding.");
            return;
        }
        if (count < names.length) {
            names[count] = name;
            brands[count] = brand;
            storages[count] = storage;
            prices[count] = price;
            processors[count] = processor;
            colors[count] = color;
            batteryCapacities[count] = batteryCapacity;
            cameras[count] = camera;
            operatingSystems[count] = operatingSystem;
            count++;
            System.out.println("Added Mobile: " + name);
        } else {
            System.out.println("Mobile inventory is full! Cannot add: " + name);
        }
    }

    // 11-15. Display methods
    public static void display() {
        System.out.println("\nAll Mobiles:");
        for (int i = 0; i < count; i++) {
            System.out.println("- " + names[i] + " (" + brands[i] + ", " + storages[i] + "GB, $" + prices[i] + ", " + processors[i] + ", " + colors[i] + ")");
        }
    }

    public static void display(String brand) {
        System.out.println("\nMobiles of Brand: " + brand);
        for (int i = 0; i < count; i++) {
            if (brands[i].equalsIgnoreCase(brand)) {
                System.out.println("- " + names[i] + " (" + brands[i] + ", " + storages[i] + "GB, $" + prices[i] + ", " + processors[i] + ")");
            }
        }
    }

    public static void display(int storage) {
        System.out.println("\nMobiles with " + storage + "GB Storage:");
        for (int i = 0; i < count; i++) {
            if (storages[i] == storage) {
                System.out.println("- " + names[i] + " (" + brands[i] + ", " + storages[i] + "GB, $" + prices[i] + ", " + processors[i] + ")");
            }
        }
    }

    public static void displayByPriceRange(double minPrice, double maxPrice) {
        System.out.println("\nMobiles between $" + minPrice + " and $" + maxPrice + ":");
        for (int i = 0; i < count; i++) {
            if (prices[i] >= minPrice && prices[i] <= maxPrice) {
                System.out.println("- " + names[i] + " ($" + prices[i] + ")");
            }
        }
    }

    public static void displayByProcessor(String processor) {
        System.out.println("\nMobiles with " + processor + ":");
        for (int i = 0; i < count; i++) {
            if (processors[i].equalsIgnoreCase(processor)) {
                System.out.println("- " + names[i] + " (" + brands[i] + ")");
            }
        }
    }

    // 16-20. Utility methods
    public static boolean isStoreFull() {
        return count >= names.length;
    }

    public static void totalMobiles() {
        System.out.println("Total Mobiles in Store: " + count);
    }

    public static void clearInventory() {
        count = 0;
        System.out.println("Inventory cleared!");
    }

    public static void removeLastMobile() {
        if (count > 0) {
            System.out.println("Removing last mobile: " + names[count - 1]);
            count--;
        } else {
            System.out.println("No mobiles to remove.");
        }
    }

    public static boolean searchByBattery(int battery) {
        for (int i = 0; i < count; i++) {
            if (batteryCapacities[i] == battery) {
                System.out.println("Mobile with " + battery + "mAh battery Found: " + names[i]);
                return true;
            }
        }
        System.out.println("No mobile found with " + battery + "mAh battery");
        return false;
    }
}
