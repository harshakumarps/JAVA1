public class HospitalInfo {

    public static void hospitalDetails(String name, String location) {
        System.out.println(name + " is located in " + location);
    }

    public static void hospitalDetailsWithBeds(String name, int numberOfBeds) {
        System.out.println(name + " has " + numberOfBeds + " beds.");
    }

    public static void hospitalDetailsMultiSpecialty(String name, boolean multiSpecialty) {
        System.out.print(name + " is ");
        if (multiSpecialty) {
            System.out.println("a multi-specialty hospital.");
        } else {
            System.out.println("a general hospital.");
        }
    }

    public static void hospitalDetailsDepartment(String name, String department, int doctorsCount) {
        System.out.println(name + " has " + doctorsCount + " doctors in the " + department + " department.");
    }

    public static void hospitalDetailsWithRating(String name, double rating) {
        System.out.println(name + " has a rating of " + rating + " stars.");
    }

    public static void hospitalHeadDoctor(String name, String headDoctor, int experience) {
        System.out.println("The head doctor of " + name + " is " + headDoctor + " with " + experience + " years of experience.");
    }

    public static void hospitalSpecialization(String name, String specialization, boolean emergencyAvailable) {
        System.out.print(name + " specializes in " + specialization + " and ");
        if (emergencyAvailable) {
            System.out.println("has emergency services.");
        } else {
            System.out.println("does not have emergency services.");
        }
    }

    public static void hospitalStaffCount(String name, int numberOfNurses, int numberOfSurgeons) {
        System.out.println(name + " has " + numberOfNurses + " nurses and " + numberOfSurgeons + " surgeons.");
    }

    public static void hospitalInsurance(String name, String insuranceProvider, boolean cashless) {
        System.out.print(name + " accepts insurance from " + insuranceProvider + " and offers ");
        if (cashless) {
            System.out.println("cashless treatment.");
        } else {
            System.out.println("non-cashless treatment.");
        }
    }

    public static void hospitalICUInfo(String name, int icuBeds, boolean ventilatorAvailable) {
        System.out.print(name + " has " + icuBeds + " ICU beds and ");
        if (ventilatorAvailable) {
            System.out.println("ventilators available.");
        } else {
            System.out.println("no ventilators available.");
        }
    }

    public static void hospitalAccreditation(String name, String accreditation, int establishedYear) {
        System.out.println(name + " is accredited by " + accreditation + " and was established in " + establishedYear + ".");
    }

    public static void hospitalOperationTheatre(String name, String operationTheatreType, int totalOTs) {
        System.out.println(name + " has " + totalOTs + " operation theatres of type " + operationTheatreType + ".");
    }

    public static void hospitalAmbulanceServices(String name, int ambulanceCount, boolean freeAmbulanceService) {
        System.out.print(name + " has " + ambulanceCount + " ambulances and ");
        if (freeAmbulanceService) {
            System.out.println("provides free ambulance services.");
        } else {
            System.out.println("does not provide free ambulance services.");
        }
    }

    public static void hospitalMaternityWard(String name, String maternityWard, int bedsAvailable) {
        System.out.println(name + " has a " + maternityWard + " with " + bedsAvailable + " beds available.");
    }

    public static void hospitalBloodBank(String name, String bloodBankName, boolean rareBloodAvailable) {
        System.out.print("The blood bank " + bloodBankName + " at " + name + " ");
        if (rareBloodAvailable) {
            System.out.println("has rare blood groups available.");
        } else {
            System.out.println("does not have rare blood groups available.");
        }
    }

    public static void hospitalAveragePatients(String name, int averagePatientsPerDay) {
        System.out.println(name + " treats around " + averagePatientsPerDay + " patients per day.");
    }

    public static void hospitalRoboticSurgery(String name, boolean roboticSurgeryAvailable) {
        System.out.print(name);
        if (roboticSurgeryAvailable) {
            System.out.println(" offers robotic surgery.");
        } else {
            System.out.println(" does not offer robotic surgery.");
        }
    }

    public static void hospitalFamousDoctor(String name, String famousDoctor, String specialization) {
        System.out.println(name + " has a well-known doctor, " + famousDoctor + ", specializing in " + specialization + ".");
    }

    public static void main(String[] args) {
        hospitalDetails("Apollo Hospital", "Bangalore");
        hospitalDetailsWithBeds("Fortis Hospital", 500);
        hospitalDetailsDepartment("Narayana Health", "Cardiology", 20);
        hospitalHeadDoctor("AIIMS", "Dr. Ramesh", 30);
        hospitalDetailsMultiSpecialty("Manipal Hospital", true);
        hospitalSpecialization("Rainbow Hospital", "Pediatrics", false);
    }
}
