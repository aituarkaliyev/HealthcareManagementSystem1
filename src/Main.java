public class Main {
    public static void main(String[] args) {
        try {
            PatientDAO patientDAO = new PatientDAO();

            // CREATE если пациентов больше не осталось
            if (patientDAO.getAllPatients().isEmpty()) {
                patientDAO.addPatient(new Patient(1, "Ayan", 33, "Hyperactivity"));
                patientDAO.addPatient(new Patient(2, "Karim", 19, "Diabetes"));
                patientDAO.addPatient(new Patient(3, "Adelya", 18, "Cold"));

            }
            System.out.println("Before treatment:");
            patientDAO.getAllPatients()
                    .forEach(System.out::println);

            // UPDATE и DELETE процессы и результаты лечения
            boolean updated = patientDAO.updateDiagnosis(3, "Recovered");
            System.out.println("In process of treatment");
            patientDAO.getAllPatients()
                    .forEach(System.out::println);

            if (updated) {
                patientDAO.deletePatient(3);
                System.out.println("Patient got recovered! Yaaay,yo-hoo!");
            } else {
                System.out.println("In process of treatment: Diagnosis unchanged.");
            }

            System.out.println("\nAfter treatment:");
            if (patientDAO.getAllPatients().isEmpty())
            {
                System.out.println("No patients");
            } else {
                patientDAO.getAllPatients()
                        .forEach(System.out::println);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}