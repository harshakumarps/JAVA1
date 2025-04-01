public class SamsungElectronics {

    public static void productDetails(int id, String name) {
        System.out.println(id + ". " + name);
    }

    public static void productDetails(String name, int price) {
        System.out.println(name + " costs Rs." + price);
    }

    public static void productDetails(String name, String category) {
        System.out.println(name + " belongs to " + category + " category.");
    }

    public static void productDetails(String name, int price, String brand, String availability) {
        System.out.println(name + " from " + brand + " costs Rs." + price + " and is " + availability);
    }

    public static void productDetails(String name, int batteryLife, String category, String chargingType) {
        System.out.println(name + " from " + category + " has a battery life of " + batteryLife + " hours and supports " + chargingType + " charging.");
    }

    public static void productDetails(String name, double screenSize, int price) {
        System.out.println(name + " with a " + screenSize + "-inch display costs Rs." + price);
    }

    public static void productDetails(String name, String processorType, int price, double speedGHz) {
        System.out.println(name + " with " + processorType + " processor costs Rs." + price + " and has a speed of " + speedGHz + " GHz.");
    }

    public static void productDetails(String name, String waterproofStatus) {
        System.out.println(name + " is " + waterproofStatus);
    }

    public static void productDetails(String name, int price, double weight, String availableStatus) {
        System.out.println(name + " costs Rs." + price + ", weighs " + weight + "kg, and is " + availableStatus);
    }

    public static void productDetails(String name, int storage, String color, double price) {
        System.out.println(name + " with " + storage + "GB storage in " + color + " costs Rs." + price);
    }

    public static void productDetails(String name, String feature, int warranty) {
        System.out.println(name + " has " + feature + " and comes with a " + warranty + "-year warranty.");
    }

    public static void productDetails(String name, String model, long serialNumber) {
        System.out.println(name + " (" + model + ") has Serial Number: " + serialNumber);
    }

    public static void main(String[] args) {
        productDetails(1, "Samsung Galaxy S24 Ultra");
        productDetails("Samsung Galaxy Z Fold 5", 159999);
        productDetails("Samsung QLED TV", "Home Entertainment");
        productDetails("Samsung Galaxy Watch 6", 45000, "Samsung", "available");
        productDetails("Samsung Tablet S9", 20, "Tablets", "Fast Charging");
        productDetails("Samsung Smart Monitor M8", 32.0, 60000);
        productDetails("Samsung Galaxy Book 3", "Intel i9", 120000, 4.2);
        productDetails("Samsung Soundbar", "Dolby Atmos", 3);
        productDetails("Samsung Refrigerator", "Convertible Mode", 10);
        productDetails("Samsung Galaxy Buds 2 Pro", "Black", 18000);
        productDetails("Samsung Odyssey G9", "Gaming Monitor", 3);
        productDetails("Samsung Air Purifier", 25000, 5.5, "available");
        productDetails("Samsung Washing Machine", "EcoBubble Technology", 5);
        productDetails("Samsung Galaxy Watch 5", 64, "Silver", 35000);
        productDetails("Samsung Vacuum Cleaner", "CycloneForce", 2);
    }
}
