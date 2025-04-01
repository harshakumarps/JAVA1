class Planet {
    int id;
    String name;
    int diameter;
    int numberOfMoons;
    double mass;
    String atmosphereComposition;
    boolean hasLife;
    boolean hasWater;
    double axialTilt;
    double orbitalPeriod;
    double distanceFromSun;
    double gravity;
    int nitrogenPercentage;
    int oxygenPercentage;
    int numberOfRings;
    String type;
    String color;
    boolean supportsHabitation;
    String starSystem;
    String galaxy;

    public Planet(int id, String name, int diameter, int numberOfMoons, double mass, String atmosphereComposition, 
                  boolean hasLife, boolean hasWater, double axialTilt, double orbitalPeriod, double distanceFromSun, 
                  double gravity, int nitrogenPercentage, int oxygenPercentage, int numberOfRings, String type, 
                  String color, boolean supportsHabitation, String starSystem, String galaxy) {
        this.id = id;
        this.name = name;
        this.diameter = diameter;
        this.numberOfMoons = numberOfMoons;
        this.mass = mass;
        this.atmosphereComposition = atmosphereComposition;
        this.hasLife = hasLife;
        this.hasWater = hasWater;
        this.axialTilt = axialTilt;
        this.orbitalPeriod = orbitalPeriod;
        this.distanceFromSun = distanceFromSun;
        this.gravity = gravity;
        this.nitrogenPercentage = nitrogenPercentage;
        this.oxygenPercentage = oxygenPercentage;
        this.numberOfRings = numberOfRings;
        this.type = type;
        this.color = color;
        this.supportsHabitation = supportsHabitation;
        this.starSystem = starSystem;
        this.galaxy = galaxy;
    }

    public void display() {
        System.out.println("Planet ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Diameter: " + diameter + " km");
        System.out.println("Number of Moons: " + numberOfMoons);
        System.out.println("Mass: " + mass + " kg");
        System.out.println("Atmosphere Composition: " + atmosphereComposition);
        System.out.println("Has Life: " + hasLife);
        System.out.println("Has Water: " + hasWater);
        System.out.println("Axial Tilt: " + axialTilt + "°");
        System.out.println("Orbital Period: " + orbitalPeriod + " days");
        System.out.println("Distance from Sun: " + distanceFromSun + " km");
        System.out.println("Gravity: " + gravity + " m/s²");
        System.out.println("Nitrogen Percentage: " + nitrogenPercentage + "%");
        System.out.println("Oxygen Percentage: " + oxygenPercentage + "%");
        System.out.println("Number of Rings: " + numberOfRings);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Supports Habitation: " + supportsHabitation);
        System.out.println("Star System: " + starSystem);
        System.out.println("Galaxy: " + galaxy);
        System.out.println("-----------------------------------");
}
}
