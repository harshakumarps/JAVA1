// Main.java
public class TelevisionStoreMain {
    public static void main(String[] args) {
        // Adding TVs using different overloaded methods
        TelevisionStore.addTelevision("Sony Bravia", "Sony", 55, true, 70000.0, "4K");
        TelevisionStore.addTelevision("LG OLED CX", "LG", 65, true, 120000.0, "4K");
        TelevisionStore.addTelevision("Samsung The Frame", "Samsung", 50, true, 85000.0, "4K");
        TelevisionStore.addTelevision("Sony X90J", "Sony", 65, true, 95000.0, "4K");

        // Display all TVs
        TelevisionStore.displayTelevisions();

        // Find a TV
        TelevisionStore.findTelevision("Sony Bravia");

        // Update price
        TelevisionStore.updatePrice("Sony Bravia", 65000.0);

        // Check if a TV is a Smart TV
        System.out.println("The Frame is a Smart TV: " + true);

        // Display only Smart TVs
        TelevisionStore.displaySmartTVs();

        // Find the largest screen TV
        TelevisionStore.findLargestScreen();

        // Find the cheapest TV
        TelevisionStore.findCheapestTV();

        // Clear inventory
        TelevisionStore.clearInventory();
    }
}
