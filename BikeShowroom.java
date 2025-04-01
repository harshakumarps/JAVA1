class BikeShowroom {
    static String[] bikes = new String[20]; // Array to store bike models
    static int count = 0; // Counter for bike models

    // 1. Check for duplicates
    public static boolean isDuplicate(String bikeName) {
        for (int i = 0; i < count; i++) {
            if (bikes[i] != null && bikes[i].equalsIgnoreCase(bikeName)) {
                return true;
            }
        }
        return false;
    }

    // 2-6. Overloaded methods to add bikes
    public static void addBike(String name) {
     addBike(name, "Unknown");
      }
    public static void addBike(String name, String brand) 
    { addBike(name, brand, 0); 
}
    public static void addBike(String name, String brand, int cc) { 
        addBike(name, brand, cc, 0.0);
         }
    public static void addBike(String name, String brand, int cc, double price) 
    { addBike(name, brand, cc, price, "Petrol"); 
}
    public static void addBike(String name, String brand, int cc, double price, String fuelType) {
        if (isDuplicate(name)) {
            System.out.println("Duplicate bike \"" + name + "\" found! Not adding.");
            return;
        }

        if (count < bikes.length) {
            bikes[count++] = name;
            System.out.println("Added Bike: " + name);
        } else {
            System.out.println("Bike list is full! Cannot add: " + name);
        }
    }

    // 7. Display all bikes
    public static void displayBikes() {
        System.out.println("\nList of available bikes:");
        for (int i = 0; i < count; i++) {
            if (bikes[i] != null) {
                System.out.println("- " + bikes[i]);
            }
        }
    }

    // 8. Search for a bike
    public static boolean searchBike(String name) {
        for (int i = 0; i < count; i++) {
            if (bikes[i] != null && bikes[i].equalsIgnoreCase(name)) {
                System.out.println("Bike Found: " + name);
                return true;
            }
        }
        System.out.println("Bike Not Found: " + name);
        return false;
    }

    // 9. Remove a bike
    public static boolean removeBike(String name) {
        for (int i = 0; i < count; i++) {
            if (bikes[i] != null && bikes[i].equalsIgnoreCase(name)) {
                for (int j = i; j < count - 1; j++) {
                    bikes[j] = bikes[j + 1];
                }
                bikes[count - 1] = null;
                count--;
                System.out.println("Removed Bike: " + name);
                return true;
            }
        }
        return false;
    }

    // 10-15. Additional helper methods
    public static void updateBike(int index, String newName) {
     if (index >= 0 && index < count) bikes[index] = newName;
      }
    public static int getTotalBikes()
     { return count;
      }
    public static boolean isShowroomFull() 
    { return count >= bikes.length;
     }
    public static void clearShowroom() {
     for (int i = 0; i < count; i++){
      bikes[i] = null; count = 0;
      }
      }
    public static void sortBikes() { /* Custom sorting logic if needed */ }
    public static void showroomDetails() { 
        System.out.println("Showroom has " + count + " bikes available.");
         }

    // 16-20. Miscellaneous methods
    public static boolean isEmpty() 
    { return count == 0; 
}
    public static String getBike(int index)
     { return (index >= 0 && index < count) ? bikes[index] : "Invalid";
      }
    public static void showroomOpen() { 
        System.out.println("Showroom is open from 9 AM to 9 PM."); 
    }
    public static void showroomClose() {
     System.out.println("Showroom is now closed.");
      }
    public static void testRide(String bikeName) {
     System.out.println("Test ride available for: " + bikeName); 
 }
}