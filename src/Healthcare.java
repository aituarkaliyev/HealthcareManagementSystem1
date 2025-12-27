public class Healthcare {
    private Patient patient;
    private Professional professional;
    private Hospital hospital;

    public Healthcare(Patient patient, Professional professional, Hospital hospital) {
        this.patient = patient;
        this.professional = professional;
        this.hospital = hospital;
    }

    public Patient getPatient() {
        return patient;
    }

    public Professional getProfessional() {
        return professional;
    }

    public Hospital getHospital() {
        return hospital;
    }
}
