class Dustbin {
    int id;
    String name;
    String brand;
    String shape;
    int capacity;
    String color;
    String material;
    double price;
    boolean hasLid;
    boolean isPedalOperated;
    boolean isSensorOperated;
    String usageType;
    String openingMechanism;
    boolean hasWheels;
    int durability;
    String recyclability;
    String ecoFriendly;
    String odorControl;
    String design;
    boolean isWaterproof;

    public Dustbin(int id, String name, String brand, String shape, int capacity, String color, String material, double price, 
                   boolean hasLid, boolean isPedalOperated, boolean isSensorOperated, String usageType, String openingMechanism, 
                   boolean hasWheels, int durability, String recyclability, String ecoFriendly, String odorControl, String design, 
                   boolean isWaterproof) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.shape = shape;
        this.capacity = capacity;
        this.color = color;
        this.material = material;
        this.price = price;
        this.hasLid = hasLid;
        this.isPedalOperated = isPedalOperated;
        this.isSensorOperated = isSensorOperated;
        this.usageType = usageType;
        this.openingMechanism = openingMechanism;
        this.hasWheels = hasWheels;
        this.durability = durability;
        this.recyclability = recyclability;
        this.ecoFriendly = ecoFriendly;
        this.odorControl = odorControl;
        this.design = design;
        this.isWaterproof = isWaterproof;
    }

    public void display() {
        System.out.println("Dustbin Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Shape: " + shape);
        System.out.println("Capacity: " + capacity);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Has Lid: " + hasLid);
        System.out.println("Is Pedal Operated: " + isPedalOperated);
        System.out.println("Is Sensor Operated: " + isSensorOperated);
        System.out.println("Usage Type: " + usageType);
        System.out.println("Opening Mechanism: " + openingMechanism);
        System.out.println("Has Wheels: " + hasWheels);
        System.out.println("Durability: " + durability);
        System.out.println("Recyclability: " + recyclability);
        System.out.println("Eco-Friendly: " + ecoFriendly);
        System.out.println("Odor Control: " + odorControl);
        System.out.println("Design: " + design);
        System.out.println("Waterproof: " + isWaterproof);
        System.out.println("---------------------------");
}
}
