class BedRunner {
    public static void main(String[] args) {
        Bed bed1 = new Bed();
        System.out.println("Default Values:");
        System.out.println("Size: " + bed1.size);
        System.out.println("Material: " + bed1.material);
        System.out.println("Number of Legs: " + bed1.legs);
        System.out.println("Has Headboard: " + bed1.hasHeadboard);

        Bed bed2 = new Bed();
        bed2.size = "King";
        bed2.material = "Mahogany";
        bed2.legs = 6;
        bed2.hasHeadboard = true;
        System.out.println("Updated Values:");
        System.out.println("Size: " + bed2.size);
        System.out.println("Material: " + bed2.material);
        System.out.println("Number of Legs: " + bed2.legs);
        System.out.println("Has Headboard: " + bed2.hasHeadboard);
}
}
