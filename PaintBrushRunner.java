public class PaintBrushRunner {
    public static void main(String[] args) {
        PaintBrush pb1 = new PaintBrush(201, "BrandX", "Flat", "Synthetic", 10, true, true, false, true, "Wood", "Black", 500);
        PaintBrush pb2 = new PaintBrush(202, "BrandY", "Round", "Natural", 8, false, false, true, true, "Plastic", "Blue", 300);
        PaintBrush pb3 = new PaintBrush(203, "BrandZ", "Filbert", "Synthetic", 12, true, true, true, false, "Metal", "Red", 700);

        pb1.display();
        pb2.display();
        pb3.display();
}
}