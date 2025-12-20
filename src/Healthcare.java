public class Healthcare {
    private String Patient;
    private String Professional;
    private String Hospital;

    public Healthcare(String Patient, String Professional, String Hospital) {
        this.Patient = Patient;
        this.Professional = Professional;
        this.Hospital = Hospital;
    }
    public void setPatient(String Patient) {
        this.Patient = Patient;
    }
    public String getPatient() {
        return Patient;
    }
    public void setProfessional(String Professional) {
        this.Professional = Professional;
    }
    public String getProfessional() {
        return Professional;
    }
    public void setHospital(String Hospital) {
        this.Hospital = Hospital;
    }
    public String getHospital() {
        return Hospital;
    }
}