class Mirror {
    int length;          
    int width;            
    String material;       
    String brand;          
    String shape;          
    String color;          
    int usage;           
    boolean warranty;      
    int thickness;          
    int price;              
    String frameType;       
    String surfaceFinish;   
    int reflectiveIndex;    
    int durability;         
    int transparencyLevel;  
    int weight;             
    boolean isAntiGlare;    
    boolean isShatterproof; 

    public Mirror(int length, int width, String material, String brand, String shape, String color, int usage, boolean warranty, 
                  int thickness, int price, String frameType, String surfaceFinish, int reflectiveIndex, int durability, 
                  int transparencyLevel, int weight, boolean isAntiGlare, boolean isShatterproof) {
        this.length = length;
        this.width = width;
        this.material = material;
        this.brand = brand;
        this.shape = shape;
        this.color = color;
        this.usage = usage;
        this.warranty = warranty;
        this.thickness = thickness;
        this.price = price;
        this.frameType = frameType;
        this.surfaceFinish = surfaceFinish;
        this.reflectiveIndex = reflectiveIndex;
        this.durability = durability;
        this.transparencyLevel = transparencyLevel;
        this.weight = weight;
        this.isAntiGlare = isAntiGlare;
        this.isShatterproof = isShatterproof;
    }

  
    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Material: " + material);
        System.out.println("Brand: " + brand);
        System.out.println("Shape: " + shape);
        System.out.println("Color: " + color);
        System.out.println("Usage: " + usage);
        System.out.println("Warranty: " + warranty);
        System.out.println("Thickness: " + thickness);
        System.out.println("Price: " + price);
        System.out.println("Frame Type: " + frameType);
        System.out.println("Surface Finish: " + surfaceFinish);
        System.out.println("Reflective Index: " + reflectiveIndex);
        System.out.println("Durability: " + durability);
        System.out.println("Transparency Level: " + transparencyLevel);
        System.out.println("Weight: " + weight);
        System.out.println("Is Anti-Glare: " + isAntiGlare);
        System.out.println("Is Shatterproof: " + isShatterproof);
        System.out.println();
}
}
