import java.sql.*;

public class MedicalProfessionalDAO {

    public static void addProfessional(String name, String specialization) throws SQLException {
        String sql = "INSERT INTO medical_professional (name, specialization) VALUES (?, ?)";
        Connection conn = Database.connect();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, specialization);
        ps.executeUpdate();
        conn.close();
    }

    public static void getProfessionals() throws SQLException {
        String sql = "SELECT * FROM medical_professional";
        Connection conn = Database.connect();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + " | " +
                            rs.getString("name") + " | " +
                            rs.getString("specialization")
            );
        }
        conn.close();
    }

    public static void deleteProfessional(int id) throws SQLException {
        String sql = "DELETE FROM medical_professional WHERE id = ?";
        Connection conn = Database.connect();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        conn.close();
    }
}
