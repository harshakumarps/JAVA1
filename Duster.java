class Duster {
    int id;
    String brand;
    String material;
    String size;
    String color;
    boolean isWashable;
    boolean isReusable;
    String purpose;
    int price;

    public Duster(int id, String brand, String material, String size, String color, boolean isWashable, 
                  boolean isReusable, String purpose, int price) {
        this.id = id;
        this.brand = brand;
        this.material = material;
        this.size = size;
        this.color = color;
        this.isWashable = isWashable;
        this.isReusable = isReusable;
        this.purpose = purpose;
        this.price = price;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Is Washable: " + isWashable);
        System.out.println("Is Reusable: " + isReusable);
        System.out.println("Purpose: " + purpose);
        System.out.println("Price: $" + price);
        System.out.println("---------------------------");
    }
}


