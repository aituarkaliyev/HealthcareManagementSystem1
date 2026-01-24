public class Main {
    public static void main(String[] args) {
        try {
            PatientDAO.addPatient("Alice", 25, "Hot");

            System.out.println("Before update:");
            PatientDAO.getPatients();

            PatientDAO.updatePatientName(1, "Alice Updated");

            System.out.println("After update:");
            PatientDAO.getPatients();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



