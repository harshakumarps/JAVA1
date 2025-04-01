public class DusterRunner {
    public static void main(String[] args) {
        Duster d1 = new Duster(101, "Camlin", "Foam", "Medium", "Blue", true, true, "Whiteboard Cleaning", 50);
        Duster d2 = new Duster(102, "Classmate", "Wood", "Large", "Brown", false, true, "Blackboard Cleaning", 100);
        Duster d3 = new Duster(103, "Faber-Castell", "Microfiber", "Small", "Black", true, true, "Multipurpose Cleaning", 80);

        // Displaying Duster Details
        System.out.println("Duster Details:");
        d1.display();
        d2.display();
        d3.display();
}
}