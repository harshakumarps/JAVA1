class JamoonRunner {
    public static void main(String[] args) {
        Jamoon jamoon1 = new Jamoon();
        System.out.println("Default Values:");
        System.out.println("Taste: " + jamoon1.taste);
        System.out.println("Color: " + jamoon1.color);
        System.out.println("Weight: " + jamoon1.weight);
        System.out.println("Is Sweet: " + jamoon1.isSweet);

        Jamoon jamoon2 = new Jamoon();
        jamoon2.taste = "Rich";
        jamoon2.color = "Dark brown";
        jamoon2.weight = 50.5;
        jamoon2.isSweet = true;
        System.out.println("Updated Values:");
        System.out.println("Taste: " + jamoon2.taste);
        System.out.println("Color: " + jamoon2.color);
        System.out.println("Weight: " + jamoon2.weight);
        System.out.println("Is Sweet: " + jamoon2.isSweet);
}
}
