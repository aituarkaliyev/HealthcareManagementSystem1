public class Hospital {
    private String name;
    private String address;
    private int capacity;

    public Hospital(String name, String address, int capacity) {
        this.name = name;
        this.address = address;
        this.capacity = capacity;
    }

    public String getName() { return name; }
    public String getAddress() { return address; }
    public int getCapacity() { return capacity; }

    public String isLargeHospital() {
        if (capacity >= 200) {
            return "This is a large hospital.";
        } else {
            return "This is a small hospital.";
        }
    }
}
