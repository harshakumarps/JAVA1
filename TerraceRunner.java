class TerraceRunner {
    public static void main(String[] args) {
        Terrace terrace1 = new Terrace();
        System.out.println("Default Values:");
        System.out.println("Area: " + terrace1.area);
        System.out.println("Type: " + terrace1.type);
        System.out.println("Has Roof: " + terrace1.hasRoof);
        System.out.println("Height: " + terrace1.height);

        Terrace terrace2 = new Terrace();
        terrace2.area = 60;
        terrace2.type = "Rooftop Garden";
        terrace2.hasRoof = true;
        terrace2.height = 12;
        System.out.println("Updated Values:");
        System.out.println("Area: " + terrace2.area);
        System.out.println("Type: " + terrace2.type);
        System.out.println("Has Roof: " + terrace2.hasRoof);
        System.out.println("Height: " + terrace2.height);
}
}
