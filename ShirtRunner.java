class ShirtRunner {
    public static void main(String[] args) {
        Shirt shirt1 = new Shirt();
        System.out.println("Default Values:");
        System.out.println("Color: " + shirt1.color);
        System.out.println("Size: " + shirt1.size);
        System.out.println("Fabric: " + shirt1.fabric);
        System.out.println("Has Collar: " + shirt1.hasCollar);

        Shirt shirt2 = new Shirt();
        shirt2.color = "Blue";
        shirt2.size = "Large";
        shirt2.fabric = "Silk";
        shirt2.hasCollar = false;
        System.out.println("Updated Values:");
        System.out.println("Color: " + shirt2.color);
        System.out.println("Size: " + shirt2.size);
        System.out.println("Fabric: " + shirt2.fabric);
        System.out.println("Has Collar: " + shirt2.hasCollar);
}
}
