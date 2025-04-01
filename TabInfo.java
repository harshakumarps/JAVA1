public class TabInfo {

    public static void tabDetails(String name, String brand) {
        System.out.println("The tablet " + name + " is manufactured by " + brand + ".");
    }

    public static void tabDetails(String name, int price) {
        System.out.println("The tablet " + name + " costs Rs. " + price + ".");
    }

    public static void tabDetails(String name, boolean stylusSupport) {
        System.out.println("The tablet " + name + " supports stylus: " + stylusSupport);
    }

    public static void tabDetails(String name, int ramSize, String processor) { // Changed order to avoid conflict
        System.out.println("The tablet " + name + " has a " + processor + " processor and " + ramSize + "GB RAM.");
    }

    public static void tabDetails(String name, double displaySize) {
        System.out.println("The tablet " + name + " has a " + displaySize + "-inch display.");
    }

    public static void tabDetails(String name, int batteryCapacity, boolean fastCharging) {
        System.out.println("The tablet " + name + " has a " + batteryCapacity + "mAh battery. Fast charging: " + fastCharging);
    }

    public static void tabDetails(String name, int storageCapacity, String operatingSystem) { // Changed order to avoid conflict
        System.out.println("The tablet " + name + " runs on " + operatingSystem + " with " + storageCapacity + "GB storage.");
    }

    public static void tabDetails(String name, String cameraDetails, boolean frontCamera) {
        System.out.println("The tablet " + name + " has a " + cameraDetails + " camera. Front camera available: " + frontCamera);
    }

    public static void tabDetails(String name, boolean simSupport, boolean expandableStorage) {
        System.out.println("The tablet " + name + " supports SIM: " + simSupport + ". Expandable storage: " + expandableStorage);
    }

    public static void main(String[] args) {
        tabDetails("iPad Pro", "Apple");
        tabDetails("Samsung Galaxy Tab S8", 59999);
        tabDetails("Microsoft Surface Go", true);
        tabDetails("Lenovo Tab P11", 6, "Snapdragon 730G");
        tabDetails("Xiaomi Pad 5", 11.0);
        tabDetails("Realme Pad X", 8340, true);
        tabDetails("Huawei MatePad", 128, "HarmonyOS");
        tabDetails("Oppo Pad", "13MP rear and 8MP front", true);
        tabDetails("Amazon Fire HD 10", false, true);
    }
}
