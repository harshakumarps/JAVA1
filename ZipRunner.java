public class ZipRunner {
    public static void main(String[] args) {
        Zip zip1 = new Zip(101, "ProjectFiles", 120.5, "ZIP", true, true, 50, "Alice", "2025-03-27", ".zip");
        Zip zip2 = new Zip(102, "Backup", 300.0, "RAR", false, false, 120, "Bob", "2025-02-15", ".rar");
        Zip zip3 = new Zip(103, "Documents", 50.8, "7z", true, true, 30, "Charlie", "2025-01-10", ".7z");

        System.out.println("Zip File Details:");
        zip1.display();
        zip2.display();
        zip3.display();
}
}