import java.sql.*;

public class PatientDAO {

    public static void addPatient(String name, int age, String diagnosis) throws SQLException {
        String sql = "INSERT INTO patient (name, age, diagnosis) VALUES (?, ?, ?)";
        Connection conn = Database.connect();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        ps.setInt(2, age);
        ps.setString(3, diagnosis);
        ps.executeUpdate();
        conn.close();
    }

    public static void getPatients() throws SQLException {
        String sql = "SELECT * FROM patient";
        Connection conn = Database.connect();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + " | " +
                            rs.getString("name") + " | " +
                            rs.getInt("age") + " | " +
                            rs.getString("diagnosis")
            );
        }
        conn.close();
    }

    public static void updatePatientName(int id, String newName) throws SQLException {
        String sql = "UPDATE patient SET name = ? WHERE id = ?";
        Connection conn = Database.connect();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, newName);
        ps.setInt(2, id);
        ps.executeUpdate();
        conn.close();
    }

    public static void deletePatient(int id) throws SQLException {
        String sql = "DELETE FROM patient WHERE id = ?";
        Connection conn = Database.connect();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        conn.close();
    }
}

