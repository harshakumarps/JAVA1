class RocketRunner {
    public static void main(String[] args) {
        Rocket r1 = new Rocket(301, "Falcon 9", "SpaceX", "FT", "RP-1/LOX", 22000, 600, 2, true, true, "Merlin Engines", 
                               "Reused", 9, 1, true, 55000000, "Low Earth Orbit", 4, "White", "GPS Satellites", true);
        Rocket r2 = new Rocket(302, "SLS", "NASA", "Block 1", "LH2/LOX", 95000, 1100, 3, false, false, "RS-25 Engines", 
                               "New", 4, 2, false, 2000000000, "Moon Mission", 4, "Orange", "Orion Crew", true);
        Rocket r3 = new Rocket(303, "Ariane 5", "ESA", "ECA", "Hydrazine", 21000, 1100, 1, false, false, "Vulcain Engines", 
                               "New", 2, 1, true, 180000000, "Geostationary Transfer Orbit", 2, "Black", "Telecom Satellites", true);

        System.out.println("Rocket 1:");
        r1.display();

        System.out.println("Rocket 2:");
        r2.display();

        System.out.println("Rocket 3:");
        r3.display();
}
}
