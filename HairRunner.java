class HairRunner {
    public static void main(String[] args) {
        Hair hair1 = new Hair();
        System.out.println("Default Values:");
        System.out.println("Color: " + hair1.color);
        System.out.println("Length: " + hair1.length);
        System.out.println("Is Curly: " + hair1.isCurly);
        System.out.println("Texture: " + hair1.texture);

        Hair hair2 = new Hair();
        hair2.color = "Midnight Black";
        hair2.length = 12;
        hair2.isCurly = true;
        hair2.texture = "Silky";
        System.out.println("Updated Values:");
        System.out.println("Color: " + hair2.color);
        System.out.println("Length: " + hair2.length);
        System.out.println("Is Curly: " + hair2.isCurly);
        System.out.println("Texture: " + hair2.texture);
}
}
