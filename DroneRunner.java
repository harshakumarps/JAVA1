class DroneRunner {
    public static void main(String[] args) {
       
        Drone d1 = new Drone(501, "SkyMaster", "BrandX", "ModelA", "Quadcopter", 30, 15.5, true, "Rechargeable", 
                             "HD Camera", 1200, true, "GPS Enabled", 2.5, 2000, "Carbon Fiber", "Automatic", "Black", 
                             "Photography", true);
                             
        Drone d2 = new Drone(502, "FlyTech", "BrandY", "ModelB", "Hexacopter", 25, 10.0, false, "Battery Operated", 
                             "4K Camera", 800, false, "No GPS", 2.0, 1500, "Plastic", "Manual", "White", "Surveillance", false);
                             
        Drone d3 = new Drone(503, "AeroPro", "BrandZ", "ModelC", "Octocopter", 40, 20.0, true, "Solar Powered", 
                             "8K Camera", 2500, true, "GPS Enabled", 3.0, 3000, "Aluminum Alloy", "Automatic", "Silver", 
                             "Delivery", true);

        d1.display();
        d2.display();
        d3.display();
}
}
