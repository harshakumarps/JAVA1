class IronBoxRunner {
    public static void main(String[] args) {
        IronBox ironBox1 = new IronBox();
        System.out.println("Default Values:");
        System.out.println("Power: " + ironBox1.power);
        System.out.println("Brand: " + ironBox1.brand);
        System.out.println("Has Steam: " + ironBox1.hasSteam);
        System.out.println("Weight: " + ironBox1.weight);

        IronBox ironBox2 = new IronBox();
        ironBox2.power = 1200;
        ironBox2.brand = "Philips";
        ironBox2.hasSteam = true;
        ironBox2.weight = 1.5;
        System.out.println("Updated Values:");
        System.out.println("Power: " + ironBox2.power);
        System.out.println("Brand: " + ironBox2.brand);
        System.out.println("Has Steam: " + ironBox2.hasSteam);
        System.out.println("Weight: " + ironBox2.weight);
}
}
