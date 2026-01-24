public class Main {
    public static void main(String[] args) {
        try {
            PatientDAO.addPatient("Alice", 25, "Cold");
            PatientDAO.getPatients();

            Professional doctor = new Professional(1, "Dr. Brown", "Therapist");
            System.out.println(doctor.getName() + " - " + doctor.getSpecialization());

            Hospital h = new Hospital("City Hospital", "Astana", 300);
            System.out.println(h.getName());
            System.out.println(h.isLargeHospital());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
