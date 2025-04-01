class DustbinRunner {
    public static void main(String[] args) {
        Dustbin db1 = new Dustbin(501, "GreenBin", "BrandX", "Oval", 35, "Dark Green", "Biodegradable Plastic", 599.99, 
                                  true, false, true, "Outdoor", "Touchless Lid", false, 6, "Recyclable", "Eco-Friendly", 
                                  "Odor Control", "Compact", false);
        Dustbin db2 = new Dustbin(502, "TechBin", "BrandY", "Cylindrical", 60, "Black", "Aluminum", 1499.99, true, true, 
                                  false, "Indoor", "Voice-Controlled", true, 4, "Non-Recyclable", "Not Eco-Friendly", 
                                  "Odor Filtration", "Large", true);
        Dustbin db3 = new Dustbin(503, "MiniBin", "BrandZ", "Hexagonal", 15, "White", "Plastic", 199.99, false, false, 
                                  true, "Indoor", "Swing Lid", false, 8, "Recyclable", "Eco-Friendly", "No Odor Control", 
                                  "Portable", true);

        db1.display();
        db2.display();
        db3.display();
    }
}
