public class BookStoreMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Book Store!");

        // Adding books using overloaded methods
        BookStore.addBook("The Alchemist");
        BookStore.addBook("1984", "George Orwell");
        BookStore.addBook("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        BookStore.addBook("Harry Potter", "J.K. Rowling", 1997, 1000);
        BookStore.addBook("To Kill a Mockingbird", "Harper Lee", 1960, 800, "Classic");
        BookStore.addBook("The Hobbit", "J.R.R. Tolkien", 1937, 1200, "Fantasy", false);
        BookStore.addBook("Sapiens", "Yuval Noah Harari", 2011, 1500, "History", true);
        BookStore.addBook("Atomic Habits", "James Clear", 2018, 1300, "Self-Help", true);
        BookStore.addBook("Dune", "Frank Herbert", 1965, 900, "Science Fiction", false);
        BookStore.addBook("The Art of War", "Sun Tzu", -500, 500, "Philosophy", false);

        // Display all books
        BookStore.display();

        // Search functionalities
        BookStore.searchByYear(1960);
        BookStore.displayEbooks();

        // Utility functions
        BookStore.totalBooks();
        BookStore.removeLastBook();
        BookStore.display();
    }
}
