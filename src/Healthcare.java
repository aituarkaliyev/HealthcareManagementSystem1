public class Healthcare {

    private Patient patient;
    private MedicalProfessional professional;
    private Hospital hospital;

    public Healthcare(Patient patient,
                      MedicalProfessional professional,
                      Hospital hospital) {
        this.patient = patient;
        this.professional = professional;
        this.hospital = hospital;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public MedicalProfessional getProfessional() {
        return professional;
    }

    public void setProfessional(MedicalProfessional professional) {
        this.professional = professional;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public void displayInfo() {
        System.out.println("Healthcare Record:");
        System.out.println(patient);
        System.out.println(professional);
        System.out.println(hospital);

    }
}
