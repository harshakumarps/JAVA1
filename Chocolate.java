class Chocolate {
    int id;
    String name;
    String brand;
    String type;
    String shape;
    int weight;
    String color;
    boolean hasNuts;
    String flavor;
    int calories;
    int sugarPercentage;
    boolean isVegan;
    boolean glutenFree;
    int numberOfPieces;
    int cocoaPercentage;
    boolean fairTradeCertified;
    String packagingEcoFriendly;
    String packagingFinish;
    String packagingMaterial;
    boolean limitedEdition;

    public Chocolate(int id, String name, String brand, String type, String shape, int weight, String color, 
                     boolean hasNuts, String flavor, int calories, int sugarPercentage, boolean isVegan, boolean glutenFree, 
                     int numberOfPieces, int cocoaPercentage, boolean fairTradeCertified, String packagingEcoFriendly, 
                     String packagingFinish, String packagingMaterial, boolean limitedEdition) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.shape = shape;
        this.weight = weight;
        this.color = color;
        this.hasNuts = hasNuts;
        this.flavor = flavor;
        this.calories = calories;
        this.sugarPercentage = sugarPercentage;
        this.isVegan = isVegan;
        this.glutenFree = glutenFree;
        this.numberOfPieces = numberOfPieces;
        this.cocoaPercentage = cocoaPercentage;
        this.fairTradeCertified = fairTradeCertified;
        this.packagingEcoFriendly = packagingEcoFriendly;
        this.packagingFinish = packagingFinish;
        this.packagingMaterial = packagingMaterial;
        this.limitedEdition = limitedEdition;
    }

    public void display() {
        System.out.println("Chocolate Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Shape: " + shape);
        System.out.println("Weight: " + weight + "g");
        System.out.println("Color: " + color);
        System.out.println("Has Nuts: " + hasNuts);
        System.out.println("Flavor: " + flavor);
        System.out.println("Calories: " + calories);
        System.out.println("Sugar Percentage: " + sugarPercentage + "%");
        System.out.println("Is Vegan: " + isVegan);
        System.out.println("Gluten-Free: " + glutenFree);
        System.out.println("Number of Pieces: " + numberOfPieces);
        System.out.println("Cocoa Percentage: " + cocoaPercentage + "%");
        System.out.println("Fair Trade Certified: " + fairTradeCertified);
        System.out.println("Packaging Eco-Friendliness: " + packagingEcoFriendly);
        System.out.println("Packaging Finish: " + packagingFinish);
        System.out.println("Packaging Material: " + packagingMaterial);
        System.out.println("Limited Edition: " + limitedEdition);
        System.out.println();
}
}
