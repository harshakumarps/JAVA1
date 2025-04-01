class Rocket {
    int id;
    String name;
    String manufacturer;
    String model;
    String fuelType;
    int payloadCapacity;
    int speed;
    int numberOfStages;
    boolean reusable;
    boolean hasRecoverySystem;
    String engineType;
    String condition;
    int numberOfEngines;
    int crewCapacity;
    boolean hasSafetySystems;
    int launchCost;
    String missionType;
    int launchPadNumber;
    String color;
    String primaryUsage;
    boolean operational;

    public Rocket(int id, String name, String manufacturer, String model, String fuelType, int payloadCapacity, int speed, 
                  int numberOfStages, boolean reusable, boolean hasRecoverySystem, String engineType, String condition, 
                  int numberOfEngines, int crewCapacity, boolean hasSafetySystems, int launchCost, String missionType, 
                  int launchPadNumber, String color, String primaryUsage, boolean operational) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.model = model;
        this.fuelType = fuelType;
        this.payloadCapacity = payloadCapacity;
        this.speed = speed;
        this.numberOfStages = numberOfStages;
        this.reusable = reusable;
        this.hasRecoverySystem = hasRecoverySystem;
        this.engineType = engineType;
        this.condition = condition;
        this.numberOfEngines = numberOfEngines;
        this.crewCapacity = crewCapacity;
        this.hasSafetySystems = hasSafetySystems;
        this.launchCost = launchCost;
        this.missionType = missionType;
        this.launchPadNumber = launchPadNumber;
        this.color = color;
        this.primaryUsage = primaryUsage;
        this.operational = operational;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Payload Capacity: " + payloadCapacity);
        System.out.println("Speed: " + speed);
        System.out.println("Number of Stages: " + numberOfStages);
        System.out.println("Reusable: " + reusable);
        System.out.println("Has Recovery System: " + hasRecoverySystem);
        System.out.println("Engine Type: " + engineType);
        System.out.println("Condition: " + condition);
        System.out.println("Number of Engines: " + numberOfEngines);
        System.out.println("Crew Capacity: " + crewCapacity);
        System.out.println("Has Safety Systems: " + hasSafetySystems);
        System.out.println("Launch Cost: " + launchCost);
        System.out.println("Mission Type: " + missionType);
        System.out.println("Launch Pad Number: " + launchPadNumber);
        System.out.println("Color: " + color);
        System.out.println("Primary Usage: " + primaryUsage);
        System.out.println("Operational: " + operational);
        System.out.println("--------------------------");
}
}
