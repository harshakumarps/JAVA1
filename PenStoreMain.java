public class PenStoreMain {
    public static void main(String[] args) {
        // Adding Pens using Overloaded Methods
        PenStore.addPen("Parker Jotter", "Parker", "Blue", 250.0, true);
        PenStore.addPen("Cello Butterflow", "Cello", "Black", 20.0, false);
        PenStore.addPen("Reynolds 045", "Reynolds", "Red", 15.0, false);
        PenStore.addPen("Flair WritoMeter", "Flair", "Green", 30.0, true);
        PenStore.addPen("Pilot V7", "Pilot", "Blue", 60.0, true);
        PenStore.addPen("Camlin Kokuyo", "Camlin", 35.0);
        PenStore.addPen("Uniball Eye", "Uniball", "Black", true);
        PenStore.addPen("Montex Mega Top", 25.0);
        PenStore.addPen("Linc Ocean Gel", "Linc", "Blue");
        PenStore.addPen("Luxor Gel", "Luxor");
        PenStore.addPen("Classmate Octane", "Classmate", 50.0, false);
        PenStore.addPen("Pierre Cardin Trinity");

        // Display Pens
        PenStore.displayPens();

        // Search for a Pen
        PenStore.searchPen("Parker Jotter");

        // Update Price of a Pen
        PenStore.updatePrice("Reynolds 045", 18.0);

        // Display Pens Again
        PenStore.displayPens();
    }
}
