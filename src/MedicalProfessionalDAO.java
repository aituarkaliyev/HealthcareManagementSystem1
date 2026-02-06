import java.sql.*;

public class MedicalProfessionalDAO {

    public void addProfessional(MedicalProfessional mp) {
        String sql = "INSERT INTO medical_professionals VALUES (?, ?, ?, ?)";

        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, mp.getId());
            stmt.setString(2, mp.getName());
            stmt.setString(3, mp.getSpecialization());
            stmt.setInt(4, mp.getExperienceYears());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
