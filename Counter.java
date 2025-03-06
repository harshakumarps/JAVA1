public class Counter {
    static int count = 0; 

    static void countDisplay() {
        count++; 
        System.out.println("Method invoked "+count+" times");
    
    }

    public static void main(String[] args) {
        countDisplay();
        countDisplay();
        countDisplay();
        countDisplay();
        countDisplay();
        countDisplay();
        countDisplay();
        countDisplay();
        countDisplay();

    }
}
