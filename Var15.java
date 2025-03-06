public class Var15 {
    static int age=27;
    static String firstname="shiva";
    static String lastname="ram";
    static boolean indian=true;
    static float height = 5.9f;
    static float weight = 72.5f;
    static int workexp = 7;
    static boolean employed = true;
    static String educationLevel = "Degree";
    static double salary = 55000.50;
    static String inwords = "Fiftyfive thousand and fifty paise only";
    static char grade = 'b';
    static byte projects = 5; 
    static short holidayperyear = 20; 
    static long population = 140000000L; 

    public static void main(String[] args) {
        if (age<18) {
            System.out.println("the person is not eligible to vote");
        } else {
            System.out.println(age+", the person is eligible to vote");
        }

        if (firstname.equals("shiva")) {
            System.out.println("the persons first name is " + firstname);
        } else {
            System.out.println("the persons first name is not Shiva");
        }

        if (lastname.equals("ram")) {
            System.out.println("the persons last name is " + lastname);
        } else {
            System.out.println("the persons last name is not Ram");
        }

        if (indian) {
            System.out.println("the person is an Indian");
        } else {
            System.out.println("the person is not an Indian");
        }
        if (height > 6.0) {
            System.out.println(height+", the person is tall");
        } else {
            System.out.println(height+", the person has an average height");
        }
        if (weight > 75) {
            System.out.println(weight+", the person is overweight");
        } else {
            System.out.println(weight+", the persons weight is in the normal range");
        }

        if (workexp > 5) {
            System.out.println(workexp+", the person has good work experience");
        } else {
            System.out.println(workexp+", the person has less than 5 years of work experience");
        }

        if (employed) {
            System.out.println("the person is currently employed");
        } else {
            System.out.println("the person is unemployed");
        }

        if (educationLevel.equals("Degree")) {
            System.out.println("the person has a college degree");
        } else {
            System.out.println("the person does not have a college degree");
        }
        if (salary > 50000) {
            System.out.println(salary+", the person is earning above average");
        } else {
            System.out.println(salary+", the person is earning below average");
        }
        if (inwords.equals("Fiftyfive thousand and fifty paise only")) {
            System.out.println("salary in words--" + inwords);
        } else {
            System.out.println("salary in words does not match");
        }
        if (grade == 'a') {
            System.out.println(grade+", the person has good performance");
        } else {
            System.out.println(grade+", the person needs improvement");
        }
        if (projects > 3) {
            System.out.println(Projects+", the person has completed multiple projects");
        } else {
            System.out.println(Projects+", the person has completed a few projects");
        }
        if (holidayperyear > 15) {
            System.out.println(holidayperyear+", the person has a good number of annual leaves");
        } else {
            System.out.println(holidayperyear+", the person has few annual leaves");
        }
        if (population > 100000000) {
            System.out.println("the country has a large population");
        } else {
            System.out.println("the country has a smaller population");
        }
    }
}
