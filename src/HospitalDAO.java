import java.sql.*;

public class HospitalDAO {

    public static void addHospital(String name, String address) throws SQLException {
        String sql = "INSERT INTO hospital (name, address) VALUES (?, ?)";
        Connection conn = Database.connect();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, address);
        ps.executeUpdate();
        conn.close();
    }

    public static void getHospitals() throws SQLException {
        String sql = "SELECT * FROM hospital";
        Connection conn = Database.connect();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + " | " +
                            rs.getString("name") + " | " +
                            rs.getString("address")
            );
        }
        conn.close();
    }

    public static void deleteHospital(int id) throws SQLException {
        String sql = "DELETE FROM hospital WHERE id = ?";
        Connection conn = Database.connect();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        conn.close();
    }
}
