public class LaptopStoreMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Laptop Store!");

        // Adding laptops
        LaptopStore.addLaptop("MacBook Air", "Apple", 16, 99999.0, "M1");
        LaptopStore.addLaptop("Inspiron", "Dell", 8, 60000.0, "Intel i5");
        LaptopStore.addLaptop("ThinkPad", "Lenovo", 16, 85000.0, "Intel i7");
        LaptopStore.addLaptop("Pavilion", "HP", 8, 70000.0, "AMD Ryzen 5");

        // Displaying all laptops
        LaptopStore.display();
        System.out.println("Total Laptops: " + LaptopStore.count);

        // Display laptops by brand
        LaptopStore.display("Apple");

        // Display laptops by RAM
        LaptopStore.display(8);

        // Searching for a laptop
        LaptopStore.searchLaptop("ThinkPad");
        LaptopStore.searchLaptop("Surface"); // Example of missing laptop

        // Checking if store is full
        if (LaptopStore.isStoreFull()) {
            System.out.println("The store is full!");
        } else {
            System.out.println("The store has space for more laptops.");
        }
    }
}
