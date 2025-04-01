public class AutoRickshawDetails {

    public static void autoInfo(int id, String name) {
        System.out.println(id + ". Auto Model: " + name);
    }

    public static void autoInfo(String name, int price) {
        System.out.println("Auto " + name + " costs Rs." + price);
    }

    public static void autoInfo(String name, String fuelType) {
        System.out.println("Auto " + name + " runs on " + fuelType + ".");
    }

    public static void autoInfo(String name, int seatingCapacity, String unit) {
        System.out.println(name + " has a seating capacity of " + seatingCapacity + " " + unit);
    }

    public static void autoInfo(String name, boolean electric) {
        System.out.println(name + " is " + (electric ? "an electric auto" : "a petrol/CNG auto"));
    }

    public static void autoInfo(String name, int price, int warrantyYears) {
        System.out.println(name + " costs Rs." + price + " with a " + warrantyYears + "-year warranty.");
    }

    public static void autoInfo(String name, String engineType, int horsepower) {
        System.out.println(name + " has a " + engineType + " engine with " + horsepower + " HP.");
    }

    public static void autoInfo(String name, String manufacturer, int price, boolean emissionCompliant) {
        System.out.println(name + " by " + manufacturer + " costs Rs." + price + " and meets emission standards: " + emissionCompliant);
    }

    public static void autoInfo(String name, int price, boolean GPS, String transmission) {
        System.out.println(name + " costs Rs." + price + ", has " + transmission + " transmission and GPS: " + GPS);
    }

    public static void autoInfo(String name, int price, String safetyFeatures, boolean ABS) {
        System.out.println(name + " costs Rs." + price + ", includes " + safetyFeatures + ", and has ABS: " + ABS);
    }

    public static void autoInfo(int id, String name, double length) {
        System.out.println(id + ". " + name + " is " + length + " meters long.");
    }

    public static void autoInfo(String name, String color, double price) {
        System.out.println(name + " in " + color + " costs Rs." + price);
    }

    public static void autoInfo(String name, int noiseLevel, boolean soundInsulation) {
        System.out.println(name + " has a noise level of " + noiseLevel + " dB and sound insulation: " + soundInsulation);
    }

    public static void autoInfo(String name, double fuelEfficiency, int fuelTankCapacity) {
        System.out.println(name + " has a fuel efficiency of " + fuelEfficiency + " km/l and a fuel tank of " + fuelTankCapacity + " liters.");
    }

    public static void autoInfo(String name, double screenSize, int price, boolean digitalDashboard) {
        System.out.println(name + " has a " + screenSize + "-inch digital screen, costs Rs." + price + ", and has a digital dashboard: " + digitalDashboard);
    }

    public static void autoInfo(String name, String controlType, boolean cruiseControl, int maxSpeed) {
        System.out.println(name + " has a " + controlType + " control system, cruise control: " + cruiseControl + ", and a max speed of " + maxSpeed + " km/h.");
    }

    public static void autoInfo(String name, boolean WiFiEnabled, int price) {
        System.out.println(name + " costs Rs." + price + " and WiFi Enabled: " + WiFiEnabled);
    }

    public static void autoInfo(String name, double weight, boolean luggageStorage, int luggageCapacity) {
        System.out.println(name + " weighs " + weight + " kg, luggage storage: " + luggageStorage + ", and luggage capacity of " + luggageCapacity + " cubic meters.");
    }

    public static void autoInfo(String name, int price, double weight, boolean available, String emissionRating) {
        System.out.println(name + " costs Rs." + price + ", weighs " + weight + " kg, emission rating: " + emissionRating + ", and available: " + available);
    }

    public static void main(String[] args) {
        autoInfo(1, "Bajaj RE");
        autoInfo("Piaggio Ape", 200000);
        autoInfo("Mahindra Treo", "Electric");
        autoInfo("TVS King", 3, "Passengers");
        autoInfo("Atul Elite", "CNG", 9);
        autoInfo("Lohia Humsafar", 180000, "ABS Braking", true);
        autoInfo("Kinetic Safar", 220000, true, "Automatic");
        autoInfo("Baxy Express", 250000, 450, true, "BS6");
        autoInfo("TukTuk Classic", true, 160000);
        autoInfo("JSA Star", "Hydraulic Suspension", false, 65);
    }
}
