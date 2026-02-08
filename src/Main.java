public class Main {

    public static void main(String[] args) {

        try {
            PatientDAO patientDAO = new PatientDAO();

            //create (если нету данных о пациентах, а так можно убрать)
            if (patientDAO.getAllPatients().isEmpty()) {
                patientDAO.addPatient(new Patient(1, "Ayan", 33, "Hyperactivity"));
                patientDAO.addPatient(new Patient(2, "Karim", 19, "Diabetes"));
                patientDAO.addPatient(new Patient(3, "Adelya", 18, "Cold"));
                System.out.println("Before treatment:");
                patientDAO.getAllPatients()
                        .forEach(System.out::println);
            }

            //UPDATE
            patientDAO.updateDiagnosis(3, "Recovered");


            //DELETE
            patientDAO.deletePatient(3);

            System.out.println("\nAfter treatment:");
            patientDAO.getAllPatients()
                    .forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}