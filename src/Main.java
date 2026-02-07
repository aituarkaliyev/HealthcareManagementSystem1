public class Main {

    public static void main(String[] args) {

        Patient patient1 = new Patient(1, "Aituar", 30, "Flu");
        Patient patient2 = new Patient(2, "Arsen", 45, "Diabetes");
        Patient patient3 = new Patient(3, "Asema", 25, "Cold");

        MedicalProfessional doctor1 =
                new MedicalProfessional(1, "Dr. Ayau", "Therapist", 10);
        MedicalProfessional doctor2 =
                new MedicalProfessional(2, "Dr. Alexa", "Surgeon", 15);

        Hospital hospital =
                new Hospital(1, "City Hospital", "Almaty");

        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addPatient(patient3);

        hospital.addProfessional(doctor1);
        hospital.addProfessional(doctor2);

        System.out.println(hospital);
        System.out.println();

        Person person1 = patient1;
        Person person2 = doctor1;

        System.out.println("Roles:");
        System.out.println(person1.getName() + " -> " + person1.getRole());
        System.out.println(person2.getName() + " -> " + person2.getRole());
        System.out.println();

        System.out.println("Patients older than 30:");
        for (Patient p : hospital.getPatientsOlderThan(30)) {
            System.out.println(p);
        }
        System.out.println();

        System.out.println("Search patient with id = 2:");
        Patient found = hospital.findPatientById(2);
        System.out.println(found);
        System.out.println();

        System.out.println("Patients sorted by age:");
        hospital.sortPatientsByAge();
        for (Patient p : hospital.getPatientsOlderThan(0)) {
            System.out.println(p);
        }
        System.out.println();

        Patient patientCopy = new Patient(1, "Aituar", 18, "Overweight");

        System.out.println("patient1 equals patientCopy:");
        System.out.println(patient1.equals(patientCopy));
        PatientDAO patientDAO = new PatientDAO();

        patientDAO.addPatient(patient1);
        patientDAO.addPatient(patient2);

        System.out.println("Patients from database:");
        for (Patient p : patientDAO.getAllPatients()) {
            System.out.println(p);
        }

        patientDAO.updateDiagnosis(1, "Recovered");

        patientDAO.deletePatient(3);

    }
}
