public class Patient extends Person {

    private int age;
    private String diagnosis;

    public Patient(int id, String name, int age, String diagnosis) {
        super(id, name);
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public int getAge() {
        return age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    @Override
    public String getRole() {
        return "Patient";
    }

    @Override
    public String toString() {
        return "Patient=" + id + ", name:" + name +
                ", age: " + age + ", name of diagnosis=" + diagnosis + "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient patient = (Patient) o;
        return id == patient.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
