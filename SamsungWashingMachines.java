public class SamsungWashingMachines {

    public static void productDetails(int id, String name) {
        System.out.println(id + ". " + name);
    }

    public static void productDetails(String name, int price) {
        System.out.println(name + " costs Rs." + price);
    }

    public static void productDetails(String name, String category) {
        System.out.println(name + " belongs to the " + category + " category.");
    }

    public static void productDetails(String name, int capacity, String type) {
        System.out.println(name + " has a capacity of " + capacity + " kg and is a " + type + " washing machine.");
    }

    public static void productDetails(String name, boolean automatic) {
        System.out.println(name + " is " + (automatic ? "fully automatic" : "semi-automatic"));
    }

    public static void productDetails(String name, int price, int warrantyYears) {
        System.out.println(name + " costs Rs." + price + " and comes with a " + warrantyYears + "-year warranty.");
    }

    public static void productDetails(String name, String drumType, int spinSpeed) {
        System.out.println(name + " has a " + drumType + " drum and a spin speed of " + spinSpeed + " RPM.");
    }

    public static void productDetails(String name, String brand, int price, boolean energyEfficient) {
        System.out.println(name + " from " + brand + " costs Rs." + price + " and is " + (energyEfficient ? "energy efficient" : "not energy efficient"));
    }

    public static void productDetails(String name, int price, boolean inverterTechnology, String loadType) {
        System.out.println(name + " costs Rs." + price + ", is a " + loadType + " washing machine, and has " + (inverterTechnology ? "inverter technology" : "conventional motor"));
    }

    public static void productDetails(String name, int price, String smartFeatures, boolean AIEnabled) {
        System.out.println(name + " costs Rs." + price + ", has " + smartFeatures + ", and " + (AIEnabled ? "supports AI features" : "does not support AI features"));
    }

    public static void productDetails(int id, String name, double discount) {
        System.out.println(id + ". " + name + " has a discount of " + discount + "%.");
    }

    public static void productDetails(String name, String color, double price) {
        System.out.println(name + " in " + color + " color costs Rs." + price);
    }

    public static void productDetails(String name, int noiseLevel, boolean vibrationReduction) {
        System.out.println(name + " has a noise level of " + noiseLevel + " dB and " + (vibrationReduction ? "includes vibration reduction" : "does not include vibration reduction"));
    }

    public static void productDetails(String name, double price, int steamWashMode) {
        System.out.println(name + " costs Rs." + price + " and has " + steamWashMode + " steam wash modes.");
    }

    public static void productDetails(String name, double screenSize, int price, boolean digitalDisplay) {
        System.out.println(name + " has a " + screenSize + "-inch screen, costs Rs." + price + ", and " + (digitalDisplay ? "includes a digital display" : "does not include a digital display"));
    }

    public static void productDetails(String name, String controlType, boolean smartControl, int powerUsage) {
        System.out.println(name + " has a " + controlType + " control panel, " + (smartControl ? "supports smart control" : "does not support smart control") + ", and consumes " + powerUsage + " watts.");
    }

    public static void productDetails(String name, boolean WiFiEnabled, int price) {
        System.out.println(name + " costs Rs." + price + " and supports WiFi connectivity ");
    }

    public static void productDetails(String name, double weight, boolean childLock, int drumSize) {
        System.out.println(name + " weighs " + weight + " kg, " + (childLock ? "has a child lock" : "does not have a child lock") + ", and has a drum size of " + drumSize + " liters.");
    }

    public static void productDetails(String name, int price, double weight, boolean available, String energyRating) {
        System.out.println(name + " costs Rs." + price + ", weighs " + weight + " kg, has an " + energyRating + " energy rating, and is available");
    }

    public static void main(String[] args) {
        productDetails(1, "Samsung Front Load Washing Machine");
        productDetails("Samsung Top Load", 25000);
        productDetails("Samsung EcoBubble", "Washing Machine");
        productDetails("Samsung 7kg Model", 7, "Front Load");
        productDetails("Samsung QuickDrive", "Diamond Drum", 1400);
        productDetails("Samsung Smart Washer", 30000, "AI Features", true);
        productDetails("Samsung BubbleWash", 8, "Top Load");
        productDetails("Samsung Hygiene Steam", 32000, true, "Front Load");
        productDetails("Samsung Compact Washer", 28000, 55.5, true, "5-Star");
        productDetails("Samsung WiFi Washer", true, 35000);
    }
}
