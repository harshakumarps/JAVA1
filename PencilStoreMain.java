public class PencilStoreMain {
    public static void main(String[] args) {
        // Using corrected method
        PencilStore.addPencil("Apsara Platinum", "Apsara", "Black", 10.0, "HB", true);
        PencilStore.addPencil("Nataraj 621", "Nataraj", "Red", 5.0, "HB", false);
        PencilStore.addPencil("Faber-Castell Grip", "Faber-Castell", "Blue", 15.0, "2B", true);
        PencilStore.addPencil("Staedtler Mars", "Staedtler", "Black", 20.0, "2H", false);
        PencilStore.addPencil("Camel Exam", "Camel", "Gray", 6.0);
        PencilStore.addPencil("Doms X1", "Doms", "Blue");
        PencilStore.addPencil("Reynolds Erasable", "Reynolds", 8.0, true);  // Now works
        PencilStore.addPencil("Classmate Neon", 12.0);
        PencilStore.addPencil("Artline Sketch", "Artline", "Black", true);
        PencilStore.addPencil("Linc Mech", "Linc");
        PencilStore.addPencil("Camlin Click", "Camlin", 25.0, false);  // Now works
        PencilStore.addPencil("Faber-Castell Click");

        // Display Pencils
        PencilStore.displayPencils();
    }
}
