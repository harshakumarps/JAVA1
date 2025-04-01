class Satellite {
    int id;
    String name;
    String organization;
    String orbitType;
    String function;
    int launchYear;
    int weight;
    double speed;
    boolean isPowered;
    String energySource;
    int operationalLife;
    boolean communicatesWithGround;
    String primaryPurpose;
    boolean isOperational;
    String material;
    String color;
    int altitude;
    String missionType;
    boolean hasBackupSystems;
    int numberOfAntennas;

    public Satellite(int id, String name, String organization, String orbitType, String function, int launchYear, int weight, 
                     double speed, boolean isPowered, String energySource, int operationalLife, boolean communicatesWithGround, 
                     String primaryPurpose, boolean isOperational, String material, String color, int altitude, 
                     String missionType, boolean hasBackupSystems, int numberOfAntennas) {
        this.id = id;
        this.name = name;
        this.organization = organization;
        this.orbitType = orbitType;
        this.function = function;
        this.launchYear = launchYear;
        this.weight = weight;
        this.speed = speed;
        this.isPowered = isPowered;
        this.energySource = energySource;
        this.operationalLife = operationalLife;
        this.communicatesWithGround = communicatesWithGround;
        this.primaryPurpose = primaryPurpose;
        this.isOperational = isOperational;
        this.material = material;
        this.color = color;
        this.altitude = altitude;
        this.missionType = missionType;
        this.hasBackupSystems = hasBackupSystems;
        this.numberOfAntennas = numberOfAntennas;
    }

    public void display() {
        System.out.println("Satellite Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Organization: " + organization);
        System.out.println("Orbit Type: " + orbitType);
        System.out.println("Function: " + function);
        System.out.println("Launch Year: " + launchYear);
        System.out.println("Weight: " + weight);
        System.out.println("Speed: " + speed);
        System.out.println("Powered: " + isPowered);
        System.out.println("Energy Source: " + energySource);
        System.out.println("Operational Life: " + operationalLife);
        System.out.println("Communicates with Ground Station: " + communicatesWithGround);
        System.out.println("Primary Purpose: " + primaryPurpose);
        System.out.println("Is Operational: " + isOperational);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Altitude: " + altitude);
        System.out.println("Mission Type: " + missionType);
        System.out.println("Has Backup Systems: " + hasBackupSystems);
        System.out.println("Number of Antennas: " + numberOfAntennas);
        System.out.println("-----------------------------");
}
}
