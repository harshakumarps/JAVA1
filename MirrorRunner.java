public class MirrorRunner {
    public static void main(String[] args) {
        
        Mirror m1 = new Mirror(150, 100, "Glass", "BrandX", "Oval", "Silver", 1, true, 10, 2000, 
                               "Wooden", "Glossy", 95, 85, 90, 8, true, false);
        Mirror m2 = new Mirror(120, 40, "Copper", "HiFi", "Square", "Silk", 2, true, 20, 4100, 
                               "Hedrz", "Hard", 59, 58, 47, 34, false, false);
        Mirror m3 = new Mirror(130, 50, "Steel", "Provin", "Combin", "Posture", 2, true, 20, 4100, 
                               "Dull", "Longitude", 56, 88, 97, 30, false, true);
        
        System.out.println("Mirror 1:");
        m1.display();

        System.out.println("Mirror 2:");
        m2.display();

        System.out.println("Mirror 3:");
        m3.display();
}
}