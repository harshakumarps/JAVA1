public class ProductDetail {
    static String[] productDetails = {null, null, null, null}; 
    static int index = 0;

    public static void addProduct(String productName) {
        if (index < productDetails.length) {
            productDetails[index] = productName;
            index++;
            // System.out.println("Product added successfully.");
        } else {
            System.out.println("The product list is full.");
        }
    }

    public static void displayProducts() {
        for (int i = 0; i < index; i++) { 
            if (productDetails[i] != null) { 
                System.out.println(productDetails[i]);
            }
        }
    }

    public static void searchProduct(String productName) {
        for (int i = 0; i < index; i++) {  
            if (productDetails[i].equalsIgnoreCase(productName)) {  
                System.out.println("Product '" + productName + "' found at index: " + i);
                return;
            }
        }
        System.out.println("Product '" + productName + "' not found.");
    }

    public static void main(String args[]) {
        ProductDetail.addProduct("Asus");  
        ProductDetail.addProduct("Apple");
        ProductDetail.addProduct("HP");
        ProductDetail.addProduct("Lenovo");

        System.out.println("Displaying all products:");
        ProductDetail.displayProducts();

        // Searching for products
        System.out.println("\nSearch results:");
        ProductDetail.searchProduct("Apple");  
        ProductDetail.searchProduct("Dell");   
    }
}
