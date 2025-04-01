// TelevisionStore.java
public class TelevisionStore {
    static String[] tvNames = new String[20];
    static String[] brands = new String[20];
    static int[] screenSizes = new int[20];
    static boolean[] isSmartTV = new boolean[20];
    static double[] prices = new double[20];
    static String[] resolutions = new String[20];
    static int count = 0;

    // ✅ Check for duplicate TV
    public static boolean isDuplicate(String name) {
        for (int i = 0; i < count; i++) {
            if (tvNames[i] != null && tvNames[i].equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    // ✅ 12 Overloaded addTelevision methods
    public static void addTelevision(String name, String brand, int size, boolean smartTV, double price, String resolution) {
        if (isDuplicate(name)) return;
        tvNames[count] = name;
         brands[count] = brand;
          screenSizes[count] = size; 
        isSmartTV[count] = smartTV;
         prices[count] = price; 
         resolutions[count] = resolution; count++;
    }

    public static void addTelevision(String name, String brand, int size, boolean smartTV) {
        addTelevision(name, brand, size, smartTV, 50000.0, "1080p");
    }

    public static void addTelevision(String name, String brand, int size) {
        addTelevision(name, brand, size, false, 45000.0, "720p");
    }

    public static void addTelevision(String name, String brand) {
        addTelevision(name, brand, 42, false, 40000.0, "1080p");
    }

    public static void addTelevision(String name) {
        addTelevision(name, "Generic", 32, false, 30000.0, "720p");
    }

    public static void addTelevision(String name, double price) {
        addTelevision(name, "Generic", 40, false, price, "4K");
    }

    public static void addTelevision(String name, String brand, boolean smartTV) {
        addTelevision(name, brand, 50, smartTV, 75000.0, "4K");
    }

    public static void addTelevision(String name, int size, boolean smartTV) {
        addTelevision(name, "Generic", size, smartTV, 60000.0, "1080p");
    }

    public static void addTelevision(String name, int size, double price) {
        addTelevision(name, "Generic", size, false, price, "4K");
    }

    public static void addTelevision(String name, double price, boolean smartTV) {
        addTelevision(name, "Generic", 55, smartTV, price, "4K");
    }

    public static void addTelevision(String name, String brand, int size, String resolution) {
        addTelevision(name, brand, size, false, 50000.0, resolution);
    }

    public static void addTelevision(String name, String brand, double price) {
        addTelevision(name, brand, 50, true, price, "4K");
    }

    // ✅ 8 General Methods
    public static void displayTelevisions() {
        if (count == 0) {
            System.out.println("No TVs available.");
            return;
        }
        System.out.println("\nAvailable Televisions:");
        for (int i = 0; i < count; i++) {
            System.out.println(i + 1 + ". " + tvNames[i] + " (" + screenSizes[i] + " inches, " + resolutions[i] + ") - Rs" + prices[i]);
        }
    }

    public static void findTelevision(String name) {
        for (int i = 0; i < count; i++) {
            if (tvNames[i].equalsIgnoreCase(name)) {
                System.out.println("TV Found: " + tvNames[i] + " - Rs" + prices[i]);
                return;
            }
        }
        System.out.println("TV not found.");
    }

    public static void updatePrice(String name, double newPrice) {
        for (int i = 0; i < count; i++) {
            if (tvNames[i].equalsIgnoreCase(name)) {
                prices[i] = newPrice;
                System.out.println("Updated Price of " + name + ": Rs" + prices[i]);
                return;
            }
        }
        System.out.println("TV not found.");
    }

    public static void displaySmartTVs() {
        System.out.println("\nSmart Televisions:");
        for (int i = 0; i < count; i++) {
            if (isSmartTV[i]) {
                System.out.println((i + 1) + ". " + tvNames[i] + " (" + screenSizes[i] + " inches, " + resolutions[i] + ") - Rs" + prices[i]);
            }
        }
    }

    public static void displayByBrand(String brand) {
        System.out.println("\nTVs from brand: " + brand);
        for (int i = 0; i < count; i++) {
            if (brands[i].equalsIgnoreCase(brand)) {
                System.out.println(tvNames[i] + " - Rs" + prices[i]);
            }
        }
    }

    public static void findLargestScreen() {
        if (count == 0) return;
        int maxSizeIndex = 0;
        for (int i = 1; i < count; i++) {
            if (screenSizes[i] > screenSizes[maxSizeIndex]) maxSizeIndex = i;
        }
        System.out.println("Largest Screen TV: " + tvNames[maxSizeIndex] + " - " + screenSizes[maxSizeIndex] + " inches.");
    }

    public static void findCheapestTV() {
        if (count == 0) return;
        int minPriceIndex = 0;
        for (int i = 1; i < count; i++) {
            if (prices[i] < prices[minPriceIndex]) minPriceIndex = i;
        }
        System.out.println("Cheapest TV: " + tvNames[minPriceIndex] + " - Rs" + prices[minPriceIndex]);
    }

    public static void clearInventory() {
        count = 0;
        System.out.println("TV inventory cleared.");
    }
}
