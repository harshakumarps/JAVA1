public class RefrigeratorStoreMain {
    public static void main(String[] args) {
        // Adding refrigerators using different overloaded methods
        RefrigeratorStore.addRefrigerator("Whirlpool Neo DF305", "Whirlpool", 265, true, true, 25000, "Silver", "Frost Free", 2, false);
        RefrigeratorStore.addRefrigerator("Samsung RT42", "Samsung", 400, true, true, 55000, "Black", "Frost Free", 5, true);
        RefrigeratorStore.addRefrigerator("LG GL-I292RPZL", "LG", 260, false, true, 32000, "Steel", "Direct Cool", 3, false);
        RefrigeratorStore.addRefrigerator("Godrej EON 255", "Godrej", 255, true, false, 28000, "White", "Direct Cool", 2, false);

        // Displaying all refrigerators
        RefrigeratorStore.displayRefrigerators();

        // Searching for a refrigerator
        RefrigeratorStore.searchRefrigerator("Samsung RT42");

        // Updating price of a refrigerator
        RefrigeratorStore.updatePrice("LG GL-I292RPZL", 31000);
        
        // Display updated list
        RefrigeratorStore.displayRefrigerators();
    }
}
