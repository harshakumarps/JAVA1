public class ArrayOperations {
    static String[] cricketTeams = {"India", "Australia", "England", "South Africa", "Srilanka"};
    static String[] clothingBrands = {"Nike", "Adidas", "Puma", "Zara", "Levi's"};
    static String[] collegeNames = {"Ait", "MIT", "Reva", "RV", "Cambridge"};

    public static void main(String[] args) {
        System.out.println("Cricket Teams:");
        for (int i = 0; i < cricketTeams.length; i++) {
            System.out.println((i + 1) + ". " + cricketTeams[i]);
        }

        System.out.println("\nClothing Brands:");
        for (int i = 0; i < clothingBrands.length; i++) {
            System.out.println((i + 1) + ". " + clothingBrands[i]);
        }

        System.out.println("\nColleges:");
        for (int i = 0; i < collegeNames.length; i++) {
            System.out.println((i + 1) + ". " + collegeNames[i]);
        }

        // Search operations
        searchCricketTeam("India");  
        searchClothingBrand("Nike");
        searchClothingBrand("Paars");
        searchCollegeName("MIT");
        searchCollegeName("Yale");
    }

    public static void searchCricketTeam(String teamName) {
        for (int i = 0; i < cricketTeams.length; i++) {
            if (cricketTeams[i].equalsIgnoreCase(teamName)) {
                System.out.println("\nCricket Team '" + teamName + "' found at index: " + i);
                return;
            }
        }
        System.out.println("\nCricket Team '" + teamName + "' not found.");
    }   

    public static void searchClothingBrand(String brandName) {
        for (int i = 0; i < clothingBrands.length; i++) {
            if (clothingBrands[i].equalsIgnoreCase(brandName)) {
                System.out.println("\nClothing Brand '" + brandName + "' found at index: " + i);
                return;
            }
        }
        System.out.println("\nClothing Brand '" + brandName + "' not found.");
    }

    public static void searchCollegeName(String collegeName) {
        for (int i = 0; i < collegeNames.length; i++) {
            if (collegeNames[i].equalsIgnoreCase(collegeName)) {
                System.out.println("\nCollege '" + collegeName + "' found at index: " + i);
                return;
            }
        }
        System.out.println("\nCollege '" + collegeName + "' not found.");
    }
}
