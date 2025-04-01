public class LaptopStore {
    static String[] names = new String[20]; // Laptop names
    static String[] brands = new String[20]; // Brands
    static int[] rams = new int[20]; // RAM in GB
    static double[] prices = new double[20]; // Prices
    static String[] processors = new String[20]; // Processor types
    static int count = 0; // Counter for laptops

    // 1. Check for duplicates
    public static boolean isDuplicate(String name) {
        for (int i = 0; i < count; i++) {
            if (names[i] != null && names[i].equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    // 2-11. Overloaded methods to add laptops
    public static void addLaptop(String name) { addLaptop(name, "Unknown"); }
    public static void addLaptop(String name, String brand) { addLaptop(name, brand, 8); }
    public static void addLaptop(String name, String brand, int ram) { addLaptop(name, brand, ram, 50000.0); }
    public static void addLaptop(String name, String brand, int ram, double price) { addLaptop(name, brand, ram, price, "Intel i5"); }
    public static void addLaptop(String name, String brand, int ram, double price, String processor) {
        if (isDuplicate(name)) {
            System.out.println("Duplicate laptop \"" + name + "\" found! Not adding.");
            return;
        }
        if (count < names.length) {
            names[count] = name;
            brands[count] = brand;
            rams[count] = ram;
            prices[count] = price;
            processors[count] = processor;
            count++;
            System.out.println("Added Laptop: " + name);
        } else {
            System.out.println("Laptop inventory is full! Cannot add: " + name);
        }
    }

    // 12-17. Display methods
    public static void display() {
        System.out.println("\nAll Laptops:");
        for (int i = 0; i < count; i++) {
            System.out.println("- " + names[i] + " (" + brands[i] + ", " + rams[i] + "GB RAM, $" + prices[i] + ", " + processors[i] + ")");
        }
    }

    public static void display(String brand) {
        System.out.println("\nLaptops of Brand: " + brand);
        for (int i = 0; i < count; i++) {
            if (brands[i].equalsIgnoreCase(brand)) {
                System.out.println("- " + names[i] + " (" + brands[i] + ", " + rams[i] + "GB RAM, $" + prices[i] + ", " + processors[i] + ")");
            }
        }
    }

    public static void display(int ram) {
        System.out.println("\nLaptops with " + ram + "GB RAM:");
        for (int i = 0; i < count; i++) {
            if (rams[i] == ram) {
                System.out.println("- " + names[i] + " (" + brands[i] + ", " + rams[i] + "GB RAM, $" + prices[i] + ", " + processors[i] + ")");
            }
        }
    }

    // 18-19. Search and Inventory check
    public static boolean searchLaptop(String name) {
        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                System.out.println("Laptop Found: " + names[i] + " (" + brands[i] + ", " + rams[i] + "GB RAM, $" + prices[i] + ", " + processors[i] + ")");
                return true;
            }
        }
        System.out.println("Laptop Not Found: " + name);
        return false;
    }

    public static boolean isStoreFull() {
        return count >= names.length;
    }
}
