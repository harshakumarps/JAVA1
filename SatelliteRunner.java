class SatelliteRunner {
    public static void main(String[] args) {
        Satellite s1 = new Satellite(601, "Hubble", "NASA", "Low Earth Orbit", "Optical Telescope", 1990, 13200, 
                                     27.3, true, "Solar Panels", 25, true, "Scientific Research", true, "Aluminum Alloy", 
                                     "Blue", 8000, "Galaxy Exploration", true, 2);
        Satellite s2 = new Satellite(602, "GPS IIF", "USAF", "Medium Earth Orbit", "Navigation", 2014, 1540, 4.8, false, 
                                     "Battery Powered", 15, true, "Positioning System", false, "Titanium", "Silver", 
                                     20000, "Navigation Services", false, 0);
        Satellite s3 = new Satellite(603, "James Webb", "NASA", "Halo Orbit", "Infrared Telescope", 2021, 6500, 0.0, 
                                     true, "Solar Panels", 50, true, "Astronomical Observations", true, 
                                     "Beryllium", "Gold", 100000, "Space Exploration", true, 3);

        s1.display();
        s2.display();
        s3.display();
}
}