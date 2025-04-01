class CraneRunner {
    public static void main(String[] args) {
        Crane crane1 = new Crane();
        System.out.println("Default Values:");
        System.out.println("Capacity: " + crane1.capacity);
        System.out.println("Type: " + crane1.type);
        System.out.println("Is Mobile: " + crane1.isMobile);
        System.out.println("Height: " + crane1.height);

        Crane crane2 = new Crane();
        crane2.capacity = 50;
        crane2.type = "Mobile Construction";
        crane2.isMobile = true;
        crane2.height = 30;
        System.out.println("Updated Values:");
        System.out.println("Capacity: " + crane2.capacity);
        System.out.println("Type: " + crane2.type);
        System.out.println("Is Mobile: " + crane2.isMobile);
        System.out.println("Height: " + crane2.height);
}
}
