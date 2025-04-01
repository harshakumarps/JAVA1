public class TruckDetails {

    public static void truckInfo(int id, String name) {
        System.out.println(id + ". Truck Model: " + name);
    }

    public static void truckInfo(String name, int price) {
        System.out.println("Truck " + name + " costs Rs." + price);
    }

    public static void truckInfo(String name, String type) {
        System.out.println("Truck " + name + " is a " + type + " type.");
    }

    public static void truckInfo(String name, int loadCapacity, String unit) {
        System.out.println(name + " has a load capacity of " + loadCapacity + " " + unit);
    }

    public static void truckInfo(String name, boolean electric) {
        System.out.println(name + " is " + (electric ? "an electric truck" : "a diesel truck"));
    }

    public static void truckInfo(String name, int price, int warrantyYears) {
        System.out.println(name + " costs Rs." + price + " with a " + warrantyYears + "-year warranty.");
    }

    public static void truckInfo(String name, String engineType, int horsepower) {
        System.out.println(name + " has a " + engineType + " engine with " + horsepower + " HP.");
    }

    public static void truckInfo(String name, String manufacturer, int price, boolean emissionCompliant) {
        System.out.println(name + " by " + manufacturer + " costs Rs." + price + " and meets emission standards: " + emissionCompliant);
    }

    public static void truckInfo(String name, int price, boolean GPS, String transmission) {
        System.out.println(name + " costs Rs." + price + ", has " + transmission + " transmission and GPS: " + GPS);
    }

    public static void truckInfo(String name, int price, String safetyFeatures, boolean ABS) {
        System.out.println(name + " costs Rs." + price + ", includes " + safetyFeatures + ", and has ABS: " + ABS);
    }

    public static void truckInfo(int id, String name, double length) {
        System.out.println(id + ". " + name + " is " + length + " meters long.");
    }

    public static void truckInfo(String name, String color, double price) {
        System.out.println(name + " in " + color + " costs Rs." + price);
    }

    public static void truckInfo(String name, int noiseLevel, boolean soundInsulation) {
        System.out.println(name + " has a noise level of " + noiseLevel + " dB and sound insulation: " + soundInsulation);
    }

    public static void truckInfo(String name, double fuelEfficiency, int fuelTankCapacity) {
        System.out.println(name + " has a fuel efficiency of " + fuelEfficiency + " km/l and a fuel tank of " + fuelTankCapacity + " liters.");
    }

    public static void truckInfo(String name, double screenSize, int price, boolean digitalDashboard) {
        System.out.println(name + " has a " + screenSize + "-inch digital screen, costs Rs." + price + ", and has a digital dashboard: " + digitalDashboard);
    }

    public static void truckInfo(String name, String controlType, boolean cruiseControl, int maxSpeed) {
        System.out.println(name + " has a " + controlType + " control system, cruise control: " + cruiseControl + ", and a max speed of " + maxSpeed + " km/h.");
    }

    public static void truckInfo(String name, boolean WiFiEnabled, int price) {
        System.out.println(name + " costs Rs." + price + " and WiFi Enabled: " + WiFiEnabled);
    }

    public static void truckInfo(String name, double weight, boolean cargoSecure, int cargoCapacity) {
        System.out.println(name + " weighs " + weight + " kg, cargo security: " + cargoSecure + ", and cargo space of " + cargoCapacity + " cubic meters.");
    }

    public static void truckInfo(String name, int price, double weight, boolean available, String emissionRating) {
        System.out.println(name + " costs Rs." + price + ", weighs " + weight + " kg, emission rating: " + emissionRating + ", and available: " + available);
    }

    public static void main(String[] args) {
        truckInfo(1, "Volvo FH16");
        truckInfo("Tata Signa", 2500000);
        truckInfo("Ashok Leyland", "Heavy Duty");
        truckInfo("Mahindra Blazo", 40, "Tons");
        truckInfo("Eicher Pro", "Diesel", 350);
        truckInfo("BharatBenz 2823R", 3200000, "ABS Braking", true);
        truckInfo("MAN CLA 49.300", 500, false, "Automatic");
        truckInfo("Scania R500", 3500000, 55.5, true, "BS6");
        truckInfo("Isuzu D-Max", true, 2200000);
        truckInfo("Mercedes-Benz Actros", "Air Suspension", false, 120);
    }
}
