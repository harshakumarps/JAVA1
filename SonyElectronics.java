public class SonyElectronics {

    public static void productDetails(int id, String name) {
        System.out.println(id + ". " + name);
    }

    public static void productDetails(String name, int price) {
        System.out.println(name + " costs Rs." + price);
    }

    public static void productDetails(String name, String category) {
        System.out.println(name + " belongs to the " + category + " category.");
    }

    public static void productDetails(String name, int price, String brand, boolean isAvailable) {
        System.out.println(name + " from " + brand + " costs Rs." + price + " and is available");
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

    public static void productDetails(String name, boolean waterproof) {
        System.out.println(name + " is " + (waterproof ? "waterproof" : "not waterproof"));
    }

    public static void productDetails(String name, int price, double weight, boolean available) {
        System.out.println(name + " costs Rs." + price + ", weighs " + weight + "kg, and is " + (available ? "available" : "out of stock"));
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
        productDetails(1, "Sony Xperia 5 V");
        productDetails("Sony Bravia XR OLED TV", 220000);
        productDetails("Sony Alpha 7 IV", "Mirrorless Camera");
        productDetails("Sony PlayStation 5", 55000, "Sony", true);
        productDetails("Sony WF-1000XM5", 30, "Wireless Earbuds", "Fast Charging");
        productDetails("Sony VAIO Laptop", 15.6, 90000);
        productDetails("Sony Xperia Pro-I", "Snapdragon 888", 129999, 2.9);
        productDetails("Sony SRS-XB43", "Extra Bass Speaker", 3);
        productDetails("Sony WH-1000XM4", "Noise Cancellation", 2);
        productDetails("Sony Cyber-shot RX100 VII", 300000, 0.3, true);
        productDetails("Sony Bravia LED TV", 55, "Black", 180000);
        productDetails("Sony Soundbar HT-A7000", "Dolby Atmos", 5);
    }
}
