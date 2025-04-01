class CabRunner {
    public static void main(String[] args) {
        Cab c1 = new Cab(201, "CabA", "BrandX", "ModelX", "Electric", "Single Motor", 4, "Black", 2500000, true, "Automatic", 
                         5.5, "AC", true, true, 350, 2, true, "Leather", "Sunroof");

        Cab c2 = new Cab(202, "CabB", "BrandY", "ModelY", "Hybrid", "Dual Motor", 5, "White", 1500000, false, "Manual", 
                         6.0, "Non-AC", false, true, 300, 1, false, "Fabric", "No Sunroof");

        Cab c3 = new Cab(203, "CabC", "BrandZ", "ModelZ", "Diesel", "Quad Motor", 7, "Gray", 1000000, true, "Automatic", 
                         4.8, "AC", true, false, 400, 3, true, "Velvet", "Sunroof");

        System.out.println("Cab 1");
        c1.displayCabDetails();

        System.out.println("Cab 2");
        c2.displayCabDetails();

        System.out.println("Cab 3");
        c3.displayCabDetails();
}
}
