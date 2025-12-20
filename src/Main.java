public class Main {
    public static void main(String[] args) {

        Healthcare healthcare = new Healthcare(
                "Aituar",
                "Dr. Tenma",
                "Hospital st. Augustine"
        );

        healthcare.setPatient("Aituar");

        System.out.println(healthcare.getPatient());
        System.out.println(healthcare.getProfessional());
        System.out.println(healthcare.getHospital());
    }
}

