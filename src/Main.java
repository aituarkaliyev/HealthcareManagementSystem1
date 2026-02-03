import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient(1, "Meirambek", 17, "Hot"));
        patients.add(new Patient(2, "Aldiyar", 18, "Cold"));
        patients.add(new Patient(3, "Amir Baiseitov", 50, "Covid"));

        System.out.println("Patients older than 30:");
        patients.stream()
                .filter(p -> p.getAge() > 30)
                .forEach(System.out::println);

        System.out.println("\nSearch patient with id = 2:");
        patients.stream()
                .filter(p -> p.getId() == 2)
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("\nPatients sorted by name:");
        patients.stream()
                .sorted(Comparator.comparing(Patient::getName))
                .forEach(System.out::println);
    }
}




