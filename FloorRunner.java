class FloorRunner {
    public static void main(String[] args) {
        Floor floor1 = new Floor();
        System.out.println("Default Values:");
        System.out.println("Length: " + floor1.length);
        System.out.println("Width: " + floor1.width);
        System.out.println("Material: " + floor1.material);
        System.out.println("Is Polished: " + floor1.isPolished);

        Floor floor2 = new Floor();
        floor2.length = 15;
        floor2.width = 25;
        floor2.material = "Marble";
        floor2.isPolished = true;
       
        System.out.println("Updated Values:");
        System.out.println("Length: " + floor2.length);
        System.out.println("Width: " + floor2.width);
        System.out.println("Material: " + floor2.material);
        System.out.println("Is Polished: " + floor2.isPolished);
}
}
