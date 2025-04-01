public class TataElectronics {

    public static void productDetails(int id, String name) {
        System.out.println(id + ". " + name);
    }

    public static void productDetails(String name, int price) {
        System.out.println(name + " costs Rs." + price);
    }

    public static void productDetails(String name, String category) {
        System.out.println(name + " belongs to " + category + " category.");
    }

    public static void productDetails(int id, String name, int price) {
        System.out.println(id + ". " + name + " is priced at Rs." + price);
    }

    public static void productDetails(String name, int price, double rating) {
        System.out.println(name + " costs Rs." + price + " and has a rating of " + rating);
    }

    public static void productDetails(String name, String category, int warranty) {
        System.out.println(name + " belongs to " + category + " and has a " + warranty + "-year warranty.");
    }

    public static void productDetails(int id, String name, int price, double weight) {
        System.out.println(id + ". " + name + " costs Rs." + price + " and weighs " + weight + "kg.");
    }

    public static void productDetails(String name, int price, String brand, boolean isAvailable) {
        System.out.println(name + " from " + brand + " costs Rs." + price + " and is available.");
    }

    public static void productDetails(String name, double rating) {
        System.out.println(name + " has a rating of " + rating);
    }

    public static void productDetails(String name, int price, String brand, int warranty) {
        System.out.println(name + " from " + brand + " costs Rs." + price + " with a " + warranty + "-year warranty.");
    }

    public static void productDetails(String name, boolean available) {
        System.out.print(name + " is ");
        if (available) {
            System.out.println("available.");
        } else {
            System.out.println("out of stock.");
        }
    }

    public static void productDetails(int id, String name, long serialNumber) {
        System.out.println(id + ". " + name + " has Serial Number: " + serialNumber);
    }

    public static void productDetails(String name, String color, int price, boolean isLimitedEdition) {
        System.out.print(name + " in " + color + " costs Rs." + price + " and is ");
        if (isLimitedEdition) {
            System.out.println("a limited edition.");
        } else {
            System.out.println("regular stock.");
        }
    }

    public static void productDetails(String name, int batteryLife, String category, String chargingType) {
        System.out.println(name + " from " + category + " has a battery life of " + batteryLife + " hours and supports " + chargingType + " charging.");
    }

    public static void productDetails(int id, String name, long serialNumber, double discount) {
        System.out.println(id + ". " + name + " has Serial Number: " + serialNumber + " and a discount of " + discount + "%.");
    }

    public static void productDetails(String name, String processorType, int price, double speedGHz) {
        System.out.println(name + " with " + processorType + " processor costs Rs." + price + " and has a speed of " + speedGHz + " GHz.");
    }

    public static void productDetails(String name, double screenSize, int price) {
        System.out.println(name + " with " + screenSize + "-inch display costs Rs." + price);
    }

    public static void productDetails(String name, String material, boolean waterproof) {
        System.out.print(name + " made of " + material + " is ");
        if (waterproof) {
            System.out.println("waterproof.");
        } else {
            System.out.println("not waterproof.");
        }
    }

    public static void productDetails(String name, int price, double weight, boolean available) {
        System.out.print(name + " costs Rs." + price + ", weighs " + weight + "kg, and is ");
        if (available) {
            System.out.println("available.");
        } else {
            System.out.println("out of stock.");
        }
    }

    public static void main(String[] args) {
        productDetails(1, "Tata Laptop");
        productDetails("Tata Mobile", 20000);
        productDetails("Tata TV", "Electronics");
        productDetails(2, "Tata Tablet", 15000);
        productDetails("Tata Earbuds", 3000, 4.5);
        productDetails("Tata Speaker", 5000, "Tata Audio", true);
        productDetails("Tata Smartwatch", 10000, 4.7);
        productDetails("Tata AC", "Home Appliances", 5);
        productDetails("Tata Refrigerator", 25000, "Tata Home", 2);
        productDetails("Tata Air Purifier", 8000, 3.9);
        productDetails("Tata Powerbank", 5000, "Tata Accessories", true);
        productDetails("Tata Camera", 35000, "Photography", 3);
        productDetails("Tata Washing Machine", 18000, "Tata Home", 1);
        productDetails("Tata Drone", 60000, "Tata Robotics", "Fast");
        productDetails("Tata Gaming Console", 45000, "Tata Gaming", 1);
        productDetails("Tata Laptop", "Intel i7", 60000, 3.5);
        productDetails("Tata Projector", "LED", 12000, 2.2);
        productDetails("Tata Printer", 9000, "Tata Office", true);
        productDetails("Tata Monitor", 20000, 5.2);
        productDetails("Tata Vacuum Cleaner", 7000, "Tata Home", false);
    }
}
