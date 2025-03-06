public class Contact {
    static long[] number = {0, 0, 0, 0};  // Array to store contact numbers
    static int index = 0;

    public static void contactNumber(long contact) {
        if (index < number.length) {
            number[index] = contact;
            index++;
            System.out.println("Contact added successfully.");
        } else {
            System.out.println("The contact list is full.");
        }
    }

    public static void display() {
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }

    public static void main(String args[]) {
        Contact.contactNumber(8660730618L);
        Contact.contactNumber(8496086909L);
        Contact.contactNumber(8496086909L);
        Contact.contactNumber(8496086909L);

        System.out.println("Displaying all contacts:");
        Contact.display();
    }
}
