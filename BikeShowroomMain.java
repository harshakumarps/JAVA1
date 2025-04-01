public class BikeShowroomMain {
    public static void main(String[] args) {
        BikeShowroom.addBike("Duke 390");
        BikeShowroom.addBike("Royal Enfield");
        BikeShowroom.addBike("Pulsar", "Bajaj", 220, 1.4, "Petrol");
        BikeShowroom.addBike("KTM RC", "KTM", 390, 3.2, "Petrol");
        BikeShowroom.addBike("Duke 390"); // Duplicate check

        BikeShowroom.displayBikes();
        BikeShowroom.searchBike("Pulsar");
        BikeShowroom.removeBike("Royal Enfield");

        BikeShowroom.displayBikes();
    }
}