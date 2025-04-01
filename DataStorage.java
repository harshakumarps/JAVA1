public class DataStorage {
    public static String[] emails = new String[10];
    public static String[] foodNames = new String[10];
    public static int emailCount = 0;
    public static int foodCount = 0;

    public static void main(String[] args) {
        addEmail("user1@example.com");
        addEmail("user2@example.com");
        addEmail("user1@example.com");

        addFood("Pizza");
        addFood("Burger");
        addFood("Pizza");

        System.out.println("\nAll Emails:");
        showAllEmails();

        System.out.println("\nAll Food Names:");
        showAllFoodNames();
    }

    public static void addEmail(String email) {
        if (emailCount >= emails.length) {
            System.out.println("Email storage is full!");
            return;
        }
        if (isDuplicate(email, emails, emailCount)) {
            System.out.println("Email already exists: " + email);
        } else {
            emails[emailCount++] = email;
            System.out.println("Email saved: " + email);
        }
    }

    public static void addFood(String food) {
        if (foodCount >= foodNames.length) {
            System.out.println("Food storage is full!");
            return;
        }
        if (isDuplicate(food, foodNames, foodCount)) {
            System.out.println("Food name already exists: " + food);
        } else {
            foodNames[foodCount++] = food;
            System.out.println("Food name saved: " + food);
        }
    }

    public static boolean isDuplicate(String item, String[] array, int count) {
        for (int i = 0; i < count; i++) {
            if (array[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    public static void showAllEmails() {
        if (emailCount == 0) {
            System.out.println("No emails saved.");
            return;
        }
        for (int i = 0; i < emailCount; i++) {
            System.out.println("- " + emails[i]);
        }
    }

    public static void showAllFoodNames() {
        if (foodCount == 0) {
            System.out.println("No food names saved.");
            return;
        }
        for (int i = 0; i < foodCount; i++) {
            System.out.println("- " + foodNames[i]);
        }
    }
}
