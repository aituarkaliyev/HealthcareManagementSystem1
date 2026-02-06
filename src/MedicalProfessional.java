public class MedicalProfessional extends Person {

    private String specialization;
    private int experienceYears;

    public MedicalProfessional(int id, String name,
                               String specialization, int experienceYears) {
        super(id, name);
        this.specialization = specialization;
        this.experienceYears = experienceYears;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    @Override
    public String getRole() {
        return "Medical Professional";
    }

    @Override
    public String toString() {
        return "MedicalProfessional{id=" + id +
                ", name='" + name +
                "', specialization='" + specialization +
                "', experienceYears=" + experienceYears + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MedicalProfessional)) return false;
        MedicalProfessional that = (MedicalProfessional) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
