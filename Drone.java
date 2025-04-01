class Drone {
    int id;
    String name;
    String brand;
    String model;
    String type;
    int flightTime;
    double maxSpeed;
    boolean isWaterproof;
    String powerType;
    String cameraQuality;
    int range;
    boolean hasObstacleAvoidance;
    String navigationType;
    double chargingTime;
    int batteryCapacity;
    String material;
    String controlType;
    String color;
    String primaryPurpose;
    boolean isOperational;

  
    public Drone(int id, String name, String brand, String model, String type, int flightTime, double maxSpeed, 
                 boolean isWaterproof, String powerType, String cameraQuality, int range, boolean hasObstacleAvoidance, 
                 String navigationType, double chargingTime, int batteryCapacity, String material, String controlType, 
                 String color, String primaryPurpose, boolean isOperational) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.flightTime = flightTime;
        this.maxSpeed = maxSpeed;
        this.isWaterproof = isWaterproof;
        this.powerType = powerType;
        this.cameraQuality = cameraQuality;
        this.range = range;
        this.hasObstacleAvoidance = hasObstacleAvoidance;
        this.navigationType = navigationType;
        this.chargingTime = chargingTime;
        this.batteryCapacity = batteryCapacity;
        this.material = material;
        this.controlType = controlType;
        this.color = color;
        this.primaryPurpose = primaryPurpose;
        this.isOperational = isOperational;
    }

  
    public void display() {
        System.out.println("Drone Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Flight Time: " + flightTime + " minutes");
        System.out.println("Max Speed: " + maxSpeed + " m/s");
        System.out.println("Is Waterproof: " + isWaterproof);
        System.out.println("Power Type: " + powerType);
        System.out.println("Camera Quality: " + cameraQuality);
        System.out.println("Range: " + range + " meters");
        System.out.println("Has Obstacle Avoidance: " + hasObstacleAvoidance);
        System.out.println("Navigation Type: " + navigationType);
        System.out.println("Charging Time: " + chargingTime + " hours");
        System.out.println("Battery Capacity: " + batteryCapacity + " mAh");
        System.out.println("Material: " + material);
        System.out.println("Control Type: " + controlType);
        System.out.println("Color: " + color);
        System.out.println("Primary Purpose: " + primaryPurpose);
        System.out.println("Operational: " + isOperational);
        System.out.println("---------------------------");
}
}
