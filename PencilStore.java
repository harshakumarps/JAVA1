public class PencilStore {
    public static String[] pencilNames = new String[100];
    public static String[] brands = new String[100];
    public static String[] colors = new String[100];
    public static double[] prices = new double[100];
    public static String[] leadTypes = new String[100];
    public static boolean[] isErasable = new boolean[100];
    public static int count = 0;

    // Correctly define method accepting (String, String, double, boolean)
    public static void addPencil(String name, String brand, double price, boolean erasable) {
        addPencil(name, brand, "Gray", price, "HB", erasable);
    }

    // Base method to add pencil
    public static void addPencil(String name, String brand, String color, double price, String leadType, boolean erasable) {
        if (count < pencilNames.length) {
            pencilNames[count] = name;
            brands[count] = brand;
            colors[count] = color;
            prices[count] = price;
            leadTypes[count] = leadType;
            isErasable[count] = erasable;
            count++;
        }
    }

    public static void addPencil(String name, String brand, String color, double price, String leadType) {
        addPencil(name, brand, color, price, leadType, false);
    }

    public static void addPencil(String name, String brand, String color, double price) {
        addPencil(name, brand, color, price, "HB", false);
    }

    public static void addPencil(String name, String brand, String color) {
        addPencil(name, brand, color, 5.0, "HB", false);
    }

    public static void addPencil(String name, String brand) {
        addPencil(name, brand, "Gray", 5.0, "HB", false);
    }

    public static void addPencil(String name) {
        addPencil(name, "Generic", "Gray", 5.0, "HB", false);
    }

    public static void addPencil(String name, String brand, double price) {
        addPencil(name, brand, "Gray", price, "HB", false);
    }

    public static void addPencil(String name, double price) {
        addPencil(name, "Generic", "Gray", price, "HB", false);
    }

    public static void addPencil(String name, boolean erasable) {
        addPencil(name, "Generic", "Gray", 5.0, "HB", erasable);
    }

    public static void addPencil(String name, double price, boolean erasable) {
        addPencil(name, "Generic", "Gray", price, "HB", erasable);
    }

    public static void addPencil(String name, String brand, String color, boolean erasable) {
        addPencil(name, brand, color, 5.0, "HB", erasable);
    }

    public static void displayPencils() {
        System.out.println("\nAvailable Pencils:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + pencilNames[i] + " (" + colors[i] + ") - INR " + prices[i] +
                    " | Lead Type: " + leadTypes[i] + " | Erasable: " + isErasable[i]);
        }
    }
}
