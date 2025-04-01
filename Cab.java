class Cab {
    int id;
    String name;
    String brand;
    String model;
    String engineType;
    String motorType;
    int seatingCapacity;
    String color;
    double price;
    boolean isAvailable;
    String transmissionType;
    double mileage;
    String acType;
    boolean hasAirbags;
    boolean hasMusicSystem;
    double bootSpace;
    int numberOfDoors;
    boolean hasGPS;
    String seatMaterial;
    String roofFeature;

  
    public Cab(int id, String name, String brand, String model, String engineType, String motorType, int seatingCapacity, 
               String color, double price, boolean isAvailable, String transmissionType, double mileage, 
               String acType, boolean hasAirbags, boolean hasMusicSystem, double bootSpace, int numberOfDoors, 
               boolean hasGPS, String seatMaterial, String roofFeature) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
        this.motorType = motorType;
        this.seatingCapacity = seatingCapacity;
        this.color = color;
        this.price = price;
        this.isAvailable = isAvailable;
        this.transmissionType = transmissionType;
        this.mileage = mileage;
        this.acType = acType;
        this.hasAirbags = hasAirbags;
        this.hasMusicSystem = hasMusicSystem;
        this.bootSpace = bootSpace;
        this.numberOfDoors = numberOfDoors;
        this.hasGPS = hasGPS;
        this.seatMaterial = seatMaterial;
        this.roofFeature = roofFeature;
    }

 
    public void displayCabDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Engine Type: " + engineType);
        System.out.println("Motor Type: " + motorType);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Available: " + isAvailable);
        System.out.println("Transmission Type: " + transmissionType);
        System.out.println("Mileage: " + mileage);
        System.out.println("AC Type: " + acType);
        System.out.println("Has Airbags: " + hasAirbags);
        System.out.println("Has Music System: " + hasMusicSystem);
        System.out.println("Boot Space: " + bootSpace);
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Has GPS: " + hasGPS);
        System.out.println("Seat Material: " + seatMaterial);
        System.out.println("Roof Feature: " + roofFeature);
        System.out.println();
}
}
