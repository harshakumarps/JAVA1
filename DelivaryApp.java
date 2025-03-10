public class DelivaryApp {
    static String[] apps = {null, null, null, null};
    static int count = 0;

    public static boolean duplicate(String appName) {
        for (int i = 0; i < count; i++) {
            if (apps[i] != null && apps[i].equalsIgnoreCase(appName)) {
                return true;
            }
        }
        return false;
    }

    public static void addApp(String appName) {
        if (duplicate(appName)) {
            System.out.println("Duplicate app \"" + appName + "\" found! Not adding.");
            return;
        }

        if (count < apps.length) {
            apps[count] = appName;
            count++;
            System.out.println("Added: " + appName);
        } else {
            System.out.println("App list is full! Cannot add: " + appName);
        }
    }

    public static void displayApps() {
        System.out.println("\nList of available apps:");
        for (String app : apps) {
            if (app != null) {
                System.out.println("- " + app);
            }
        }
    }

    public static void main(String[] args) {
        addApp("Zomato");
        addApp("zomato");
        addApp("zomaTO");
        addApp("Swiggy");
        addApp("UberEats");

        displayApps();
    }
}
