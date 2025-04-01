class Tab {
    int id;
    String name;
    String brand;
    String model;
    String processor;
    int ramSize;
    int storageSize;
    String displayType;
    double screenSize;
    String color;
    double price;
    boolean hasSimSupport;
    String operatingSystem;
    int batteryCapacity;
    boolean hasStylus;
    boolean hasExpandableStorage;
    int cameraResolution;
    boolean hasFingerprintSensor;
    String speakerType;
    String connectivityOptions;

    public Tab(int id, String name, String brand, String model, String processor, int ramSize, int storageSize, 
               String displayType, double screenSize, String color, double price, boolean hasSimSupport, 
               String operatingSystem, int batteryCapacity, boolean hasStylus, boolean hasExpandableStorage, 
               int cameraResolution, boolean hasFingerprintSensor, String speakerType, String connectivityOptions) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
        this.displayType = displayType;
        this.screenSize = screenSize;
        this.color = color;
        this.price = price;
        this.hasSimSupport = hasSimSupport;
        this.operatingSystem = operatingSystem;
        this.batteryCapacity = batteryCapacity;
        this.hasStylus = hasStylus;
        this.hasExpandableStorage = hasExpandableStorage;
        this.cameraResolution = cameraResolution;
        this.hasFingerprintSensor = hasFingerprintSensor;
        this.speakerType = speakerType;
        this.connectivityOptions = connectivityOptions;
    }

    public void displayTabDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Processor: " + processor);
        System.out.println("RAM Size: " + ramSize + "GB");
        System.out.println("Storage Size: " + storageSize + "GB");
        System.out.println("Display Type: " + displayType);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
        System.out.println("SIM Support: " + hasSimSupport);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Battery Capacity: " + batteryCapacity + "mAh");
        System.out.println("Has Stylus: " + hasStylus);
        System.out.println("Expandable Storage: " + hasExpandableStorage);
        System.out.println("Camera Resolution: " + cameraResolution + "MP");
        System.out.println("Fingerprint Sensor: " + hasFingerprintSensor);
        System.out.println("Speaker Type: " + speakerType);
        System.out.println("Connectivity Options: " + connectivityOptions);
        System.out.println();
    }
}
