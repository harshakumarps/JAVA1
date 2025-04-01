class AnchorRunner {
    public static void main(String[] args) {
        Anchor anchor1 = new Anchor();
        System.out.println("Default Values:");
        System.out.println("Weight: " + anchor1.weight);
        System.out.println("Material: " + anchor1.material);
        System.out.println("Is Rust Proof: " + anchor1.isRustProof);
        System.out.println("Type: " + anchor1.type);

        Anchor anchor2 = Anchor anchor1;
        anchor2.weight = 25.5;
        anchor2.material = "Stainless Steel";
        anchor2.isRustProof = true;
        anchor2.type = "Marine";
        System.out.println("Updated Values:");
        System.out.println("Weight: " + anchor2.weight);
        System.out.println("Material: " + anchor2.material);
        System.out.println("Is Rust Proof: " + anchor2.isRustProof);
        System.out.println("Type: " + anchor2.type);
        }
}
