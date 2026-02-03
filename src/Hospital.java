import java.util.Objects;

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
        return capacity >= 200
                ? "This is a large hospital."
                : "This is a small hospital.";
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hospital)) return false;
        Hospital hospital = (Hospital) o;
        return Objects.equals(name, hospital.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

