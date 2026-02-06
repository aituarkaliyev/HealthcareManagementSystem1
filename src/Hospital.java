import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Hospital {

    private int id;
    private String name;
    private String location;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }


    private List<Patient> patients = new ArrayList<>();
    private List<MedicalProfessional> professionals = new ArrayList<>();

    public Hospital(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addProfessional(MedicalProfessional professional) {
        professionals.add(professional);
    }

    public List<Patient> getPatientsOlderThan(int age) {
        List<Patient> result = new ArrayList<>();
        for (Patient p : patients) {
            if (p.getAge() > age) {
                result.add(p);
            }
        }
        return result;
    }

    public Patient findPatientById(int id) {
        for (Patient p : patients) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void sortPatientsByAge() {
        patients.sort(Comparator.comparingInt(Patient::getAge));
    }

    @Override
    public String toString() {
        return "Hospital{id=" + id +
                ", name='" + name +
                "', location='" + location +
                "', patients=" + patients.size() +
                ", professionals=" + professionals.size() + "}";
    }
}
