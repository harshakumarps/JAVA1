class PenStore {
    public static String[] penNames = new String[5];
    public static String[] brands = new String[5];
    public static String[] colors = new String[5];
    public static double[] prices = new double[5];
    public static boolean[] isRefillable = new boolean[5];
    public static int count = 0;

    // 12 Overloaded Methods for Adding Pens
    public static void addPen(String name, String brand, String color, double price, boolean refillable) {
        if (count < 5) {
            penNames[count] = name;
            brands[count] = brand;
            colors[count] = color;
            prices[count] = price;
            isRefillable[count] = refillable;
            count++;
        }
    }

    public static void addPen(String name, String brand, String color, double price) {
        addPen(name, brand, color, price, false);
    }

    public static void addPen(String name, String brand, String color) {
        addPen(name, brand, color, 10.0, false);
    }

    public static void addPen(String name, String brand) {
        addPen(name, brand, "Black", 10.0, false);
    }

    public static void addPen(String name) {
        addPen(name, "Generic", "Black", 10.0, false);
    }

    public static void addPen(String name, String brand, double price) {
        addPen(name, brand, "Black", price, false);
    }

    public static void addPen(String name, double price) {
        addPen(name, "Generic", "Black", price, false);
    }

    public static void addPen(String name, String brand, boolean refillable) {
        addPen(name, brand, "Black", 10.0, refillable);
    }

    public static void addPen(String name, boolean refillable) {
        addPen(name, "Generic", "Black", 10.0, refillable);
    }

    public static void addPen(String name, double price, boolean refillable) {
        addPen(name, "Generic", "Black", price, refillable);
    }

    public static void addPen(String name, String brand, String color, boolean refillable) {
        addPen(name, brand, color, 10.0, refillable);
    }

    public static void addPen(String name, String brand, double price, boolean refillable) {
        addPen(name, brand, "Black", price, refillable);
    }

    // Search Pen by Name
    public static void searchPen(String name) {
        for (int i = 0; i < count; i++) {
            if (penNames[i].equalsIgnoreCase(name)) {
                System.out.println("Pen Found: " + penNames[i] + " by " + brands[i] + " - INR " + prices[i]);
                return;
            }
        }
        System.out.println("Pen not found.");
    }

    // Update Pen Price
    public static void updatePrice(String name, double newPrice) {
        for (int i = 0; i < count; i++) {
            if (penNames[i].equalsIgnoreCase(name)) {
                prices[i] = newPrice;
                System.out.println("Updated Price of " + name + ": INR " + newPrice);
                return;
            }
        }
        System.out.println("Pen not found.");
    }

    // Display All Pens
    public static void displayPens() {
        System.out.println("\nAvailable Pens:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + penNames[i] + " (" + colors[i] + ") - INR " + prices[i] +
                    " | Refillable: " + isRefillable[i]);
        }
    }
}
