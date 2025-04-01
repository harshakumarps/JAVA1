class PlanetRunner {
    public static void main(String[] args) {
        Planet p1 = new Planet(1, "Earth", 12742, 1, 5.972E24, "Oxygen-Nitrogen", true, true, 23.5, 365.25, 
                               149.6E6, 9.8, 78, 21, 1, "Rocky", "Blue-Green", true, "Solar System", "Milky Way");
        Planet p2 = new Planet(2, "Mars", 6779, 2, 6.417E23, "Carbon Dioxide", false, true, 25.0, 687, 
                               227.9E6, 3.71, 0, 95, 2, "Rocky", "Red", false, "Solar System", "Milky Way");
        Planet p3 = new Planet(3, "Jupiter", 139820, 79, 1.898E27, "Hydrogen-Helium", false, false, 3.13, 4333, 
                               778.5E6, 24.79, 0, 86, 79, "Gas Giant", "Orange-White", false, "Solar System", "Milky Way");

        p1.display();
        p2.display();
        p3.display();
}
}