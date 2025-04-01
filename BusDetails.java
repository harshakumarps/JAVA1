public class BusDetails {

    public static void busInfo(int id, String name) {
        System.out.println(id + ". Bus Model: " + name);
    }

    public static void busInfo(String name, int price) {
        System.out.println("Bus " + name + " costs Rs." + price);
    }

    public static void busInfo(String name, String type) {
        System.out.println("Bus " + name + " is a " + type + " type.");
    }

    public static void busInfo(String name, int seatingCapacity, String unit) {
        System.out.println(name + " has a seating capacity of " + seatingCapacity + " " + unit);
    }

    public static void busInfo(String name, boolean electric) {
        System.out.println(name + " is " + (electric ? "an electric bus" : "a diesel bus"));
    }

    public static void busInfo(String name, int price, int warrantyYears) {
        System.out.println(name + " costs Rs." + price + " with a " + warrantyYears + "-year warranty.");
    }

    public static void busInfo(String name, String engineType, int horsepower) {
        System.out.println(name + " has a " + engineType + " engine with " + horsepower + " HP.");
    }

    public static void busInfo(String name, String manufacturer, int price, boolean emissionCompliant) {
        System.out.println(name + " by " + manufacturer + " costs Rs." + price + " and meets emission standards: " + emissionCompliant);
    }

    public static void busInfo(String name, int price, boolean GPS, String transmission) {
        System.out.println(name + " costs Rs." + price + ", has " + transmission + " transmission and GPS: " + GPS);
    }

    public static void busInfo(String name, int price, String safetyFeatures, boolean ABS) {
        System.out.println(name + " costs Rs." + price + ", includes " + safetyFeatures + ", and has ABS: " + ABS);
    }

    public static void busInfo(int id, String name, double length) {
        System.out.println(id + ". " + name + " is " + length + " meters long.");
    }

    public static void busInfo(String name, String color, double price) {
        System.out.println(name + " in " + color + " costs Rs." + price);
    }

    public static void busInfo(String name, int noiseLevel, boolean soundInsulation) {
        System.out.println(name + " has a noise level of " + noiseLevel + " dB and sound insulation: " + soundInsulation);
    }

    public static void busInfo(String name, double fuelEfficiency, int fuelTankCapacity) {
        System.out.println(name + " has a fuel efficiency of " + fuelEfficiency + " km/l and a fuel tank of " + fuelTankCapacity + " liters.");
    }

    public static void busInfo(String name, double screenSize, int price, boolean digitalDashboard) {
        System.out.println(name + " has a " + screenSize + "-inch digital screen, costs Rs." + price + ", and has a digital dashboard: " + digitalDashboard);
    }

    public static void busInfo(String name, String controlType, boolean cruiseControl, int maxSpeed) {
        System.out.println(name + " has a " + controlType + " control system, cruise control: " + cruiseControl + ", and a max speed of " + maxSpeed + " km/h.");
    }

    public static void busInfo(String name, boolean WiFiEnabled, int price) {
        System.out.println(name + " costs Rs." + price + " and WiFi Enabled: " + WiFiEnabled);
    }

    public static void busInfo(String name, double weight, boolean luggageStorage, int luggageCapacity) {
        System.out.println(name + " weighs " + weight + " kg, luggage storage: " + luggageStorage + ", and luggage capacity of " + luggageCapacity + " cubic meters.");
    }

    public static void busInfo(String name, int price, double weight, boolean available, String emissionRating) {
        System.out.println(name + " costs Rs." + price + ", weighs " + weight + " kg, emission rating: " + emissionRating + ", and available: " + available);
    }

    public static void main(String[] args) {
        busInfo(1, "Volvo 9400");
        busInfo("Ashok Leyland", 3500000);
        busInfo("Tata Starbus", "Electric");
        busInfo("Mercedes-Benz", 45, "Seats");
        busInfo("Eicher Skyline", "Diesel", 180);
        busInfo("Scania Interlink", 3800000, "ABS Braking", true);
        busInfo("BharatBenz 1624", 700, false, "Automatic");
        busInfo("Isuzu LT134", 4800000, 65.5, true, "BS6");
        busInfo("King Long XMQ", true, 2600000);
        busInfo("MAN Lion’s Coach", "Air Suspension", true, 100);
    }
}
