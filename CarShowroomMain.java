public class CarShowroomMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Car Showroom!");
        
        // Adding Indian brand cars with full details
        CarShowroom.addCar("Nexon", "Tata", 120, 14.79, "Petrol");
        CarShowroom.addCar("Thar", "Mahindra", 150, 16.79, "Diesel");
        CarShowroom.addCar("Swift", "Maruti Suzuki", 90, 8.99, "Petrol");
        CarShowroom.addCar("Qute", "Bajaj", 30, 3.6, "CNG");
        CarShowroom.addCar("Ambassador", "Hindustan Motors", 75, 15.5, "Diesel");
        
        // Displaying all cars
        CarShowroom.display();
        System.out.println("Total Cars: " + CarShowroom.getTotalCars());
        
        // Display cars by brand
        CarShowroom.display("Tata");
        
        // Display cars by horsepower
        CarShowroom.display(90);
        
        // Display cars by price
        CarShowroom.display(8.99);
        
        // Display cars by brand and horsepower
        CarShowroom.display("Mahindra", 150);
        
        // Searching for a car
        CarShowroom.searchCar("Thar");
        CarShowroom.searchCar("Verna"); // Example of a missing car
        
        // Checking if showroom is full
        if (CarShowroom.isShowroomFull()) {
            System.out.println("The showroom is full!");
        } else {
            System.out.println("The showroom has space for more cars.");
        }
    }
}