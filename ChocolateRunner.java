class ChocolateRunner {
    public static void main(String[] args) {
        Chocolate ch1 = new Chocolate(201, "SilkyChoco", "BrandX", "Milk Chocolate", "Oval", 120, "Light Brown", false, 
                                      "Caramel", 180, 7, true, false, 2, 85, true, "Eco-Friendly", "Matte", 
                                      "Paper Wrapper", false);
        Chocolate ch2 = new Chocolate(202, "BitterChoco", "BrandY", "Dark Chocolate", "Rectangle", 180, "Dark Brown", true, 
                                      "Walnut", 220, 12, false, true, 1, 95, true, "Eco-Friendly", "Glossy", 
                                      "Foil Wrapper", true);
        Chocolate ch3 = new Chocolate(203, "CreamyChoco", "BrandZ", "White Chocolate", "Star", 140, "Creamy White", false, 
                                      "Strawberry", 270, 6, true, false, 0, 70, false, "Non-Eco-Friendly", "Glossy", 
                                      "Plastic Wrapper", true);

        ch1.display();
        ch2.display();
        ch3.display();
    }
}
