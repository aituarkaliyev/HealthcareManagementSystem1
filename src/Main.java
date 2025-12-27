public class Main {
    public static void main(String[] args) {

        Patient patient = new Patient("Aituar");
        Professional professional = new Professional("Dr. Tenma");
        Hospital hospital = new Hospital("Hospital st. Augustine");

        Healthcare healthcare = new Healthcare(
                patient,
                professional,
                hospital
        )
                ;

        System.out.println(healthcare.getPatient().getName());
        System.out.println(healthcare.getProfessional().getName());
        System.out.println(healthcare.getHospital().getName());
    }
}


