public class MobileStoreMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Mobile Store!");

        // Adding mobiles using overloaded methods
        MobileStore.addMobile("iPhone 14");
        MobileStore.addMobile("Galaxy S22", "Samsung");
        MobileStore.addMobile("OnePlus 10", "OnePlus", 128);
        MobileStore.addMobile("Pixel 7", "Google", 128, 65000.0);
        MobileStore.addMobile("Xiaomi 12", "Xiaomi", 256, 45000.0, "Snapdragon 8 Gen 1");
        MobileStore.addMobile("iPhone 13", "Apple", 128, 75000.0, "A15 Bionic", "Blue");
        MobileStore.addMobile("Realme GT", "Realme", 128, 30000.0, "Dimensity 1200", "Black", 5000);
        MobileStore.addMobile("Oppo Reno 7", "Oppo", 128, 28000.0, "Snapdragon 778G", "Gold", 4500, 64);
        MobileStore.addMobile("Vivo X80", "Vivo", 256, 54000.0, "Snapdragon 8 Gen 1", "Orange", 4500, 50, "Android");
        MobileStore.addMobile("Samsung Z Fold 4", "Samsung", 512, 140000.0, "Snapdragon 8+ Gen 1", "Silver", 4400, 108, "Android", true);

        // Display all mobiles
        MobileStore.display();

        // Search functionalities
        MobileStore.searchByBattery(4500);

        // Utility functions
        MobileStore.totalMobiles();
        MobileStore.removeLastMobile();
        MobileStore.display();
    }
}
