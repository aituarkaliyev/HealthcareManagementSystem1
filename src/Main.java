public static void main(String[] args) {
    try {
        PatientDAO.addPatient("Alice", 25, "Cold");
        PatientDAO.getPatients();

        PatientDAO.updatePatientName(1, "Hot");
        PatientDAO.getPatients();

        PatientDAO.deletePatient(1);
        PatientDAO.getPatients();

    } catch (Exception e) {
        e.printStackTrace();
    }
}


