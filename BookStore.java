public class BookStore {
    static String[] bookTitles = new String[20];
    static String[] authors = new String[20];
    static int[] publicationYears = new int[20];
    static double[] prices = new double[20];
    static String[] genres = new String[20];
    static boolean[] isEbook = new boolean[20];
    static int count = 0;

    // Check for duplicate books
    public static boolean isDuplicate(String title) {
        for (int i = 0; i < count; i++) {
            if (bookTitles[i] != null && bookTitles[i].equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    // 1-10. Overloaded methods to add books
    public static void addBook(String title) { addBook(title, "Unknown"); }
    public static void addBook(String title, String author) { addBook(title, author, 2000); }
    public static void addBook(String title, String author, int year) { addBook(title, author, year, 500.0); }
    public static void addBook(String title, String author, int year, double price) { addBook(title, author, year, price, "General"); }
    public static void addBook(String title, String author, int year, double price, String genre) { addBook(title, author, year, price, genre, false); }
    public static void addBook(String title, String author, int year, double price, String genre, boolean ebook) {
        if (isDuplicate(title)) {
            System.out.println("Duplicate book \"" + title + "\" found! Not adding.");
            return;
        }
        if (count < bookTitles.length) {
            bookTitles[count] = title;
            authors[count] = author;
            publicationYears[count] = year;
            prices[count] = price;
            genres[count] = genre;
            isEbook[count] = ebook;
            count++;
            System.out.println("Added Book: " + title);
        } else {
            System.out.println("Bookstore inventory is full! Cannot add: " + title);
        }
    }

    // 11-15. Display methods
    public static void display() {
        System.out.println("\nAll Books:");
        for (int i = 0; i < count; i++) {
            System.out.println("- " + bookTitles[i] + " by " + authors[i] + " (" + publicationYears[i] + ", $" + prices[i] + ")");
        }
    }

    public static void displayByAuthor(String author) {
        System.out.println("\nBooks by: " + author);
        for (int i = 0; i < count; i++) {
            if (authors[i].equalsIgnoreCase(author)) {
                System.out.println("- " + bookTitles[i] + " (" + publicationYears[i] + ")");
            }
        }
    }

    public static void displayByPriceRange(double minPrice, double maxPrice) {
        System.out.println("\nBooks between $" + minPrice + " and $" + maxPrice + ":");
        for (int i = 0; i < count; i++) {
            if (prices[i] >= minPrice && prices[i] <= maxPrice) {
                System.out.println("- " + bookTitles[i] + " ($" + prices[i] + ")");
            }
        }
    }

    public static void displayEbooks() {
        System.out.println("\nE-Books:");
        for (int i = 0; i < count; i++) {
            if (isEbook[i]) {
                System.out.println("- " + bookTitles[i] + " by " + authors[i]);
            }
        }
    }

    public static void displayByGenre(String genre) {
        System.out.println("\nBooks in Genre: " + genre);
        for (int i = 0; i < count; i++) {
            if (genres[i].equalsIgnoreCase(genre)) {
                System.out.println("- " + bookTitles[i] + " by " + authors[i]);
            }
        }
    }

    // 16-20. Utility methods
    public static void totalBooks() {
        System.out.println("Total Books in Store: " + count);
    }

    public static void removeLastBook() {
        if (count > 0) {
            System.out.println("Removing last book: " + bookTitles[count - 1]);
            count--;
        } else {
            System.out.println("No books to remove.");
        }
    }

    public static void clearInventory() {
        count = 0;
        System.out.println("Bookstore inventory cleared!");
    }

    public static boolean searchByYear(int year) {
        for (int i = 0; i < count; i++) {
            if (publicationYears[i] == year) {
                System.out.println("Book published in " + year + " found: " + bookTitles[i]);
                return true;
            }
        }
        System.out.println("No book found from " + year);
        return false;
    }

    public static void displayByYearRange(int minYear, int maxYear) {
        System.out.println("\nBooks published between " + minYear + " and " + maxYear + ":");
        for (int i = 0; i < count; i++) {
            if (publicationYears[i] >= minYear && publicationYears[i] <= maxYear) {
                System.out.println("- " + bookTitles[i] + " by " + authors[i]);
            }
        }
    }
}
