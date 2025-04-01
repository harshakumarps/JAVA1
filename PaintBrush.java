class PaintBrush {
    int id;
    String brand;
    String type; 
    String material; 
    int size;
    boolean isWaterResistant;
    boolean isForAcrylic;
    boolean isForOilPaint;
    boolean isForWatercolor;
    String handleMaterial; 
    String color;
    int price;

    public PaintBrush(int id, String brand, String type, String material, int size, boolean isWaterResistant,
                      boolean isForAcrylic, boolean isForOilPaint, boolean isForWatercolor,
                      String handleMaterial, String color, int price) {
        this.id = id;
        this.brand = brand;
        this.type = type;
        this.material = material;
        this.size = size;
        this.isWaterResistant = isWaterResistant;
        this.isForAcrylic = isForAcrylic;
        this.isForOilPaint = isForOilPaint;
        this.isForWatercolor = isForWatercolor;
        this.handleMaterial = handleMaterial;
        this.color = color;
        this.price = price;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Size: " + size);
        System.out.println("Water Resistant: " + (isWaterResistant ? "Yes" : "No"));
        System.out.println("Suitable for Acrylic Paint: " + (isForAcrylic ? "Yes" : "No"));
        System.out.println("Suitable for Oil Paint: " + (isForOilPaint ? "Yes" : "No"));
        System.out.println("Suitable for Watercolor: " + (isForWatercolor ? "Yes" : "No"));
        System.out.println("Handle Material: " + handleMaterial);
        System.out.println("Color: " + color);
        System.out.println("Price: ₹" + price);
        System.out.println("------------------------------------");
}
}
