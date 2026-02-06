import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HospitalDAO {

    public void addHospital(Hospital hospital) {
        String sql = "INSERT INTO hospitals VALUES (?, ?, ?)";

        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, hospital.getId());
            stmt.setString(2, hospital.getName());
            stmt.setString(3, hospital.getLocation());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Hospital> getAllHospitals() {
        List<Hospital> hospitals = new ArrayList<>();
        String sql = "SELECT * FROM hospitals";

        try (Connection conn = Database.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                hospitals.add(new Hospital(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("location")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hospitals;
    }

    public Hospital getHospitalById(int id) {
        String sql = "SELECT * FROM hospitals WHERE id = ?";

        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Hospital(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("location")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateLocation(int id, String newLocation) {
        String sql = "UPDATE hospitals SET location = ? WHERE id = ?";

        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, newLocation);
            stmt.setInt(2, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteHospital(int id) {
        String sql = "DELETE FROM hospitals WHERE id = ?";

        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
