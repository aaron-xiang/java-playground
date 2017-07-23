package playground.database;

import java.sql.*;

/**
 * Created by aaron on 6/17/17.
 */
public class JDBCDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost/weather";
        String username = "root";
        String password = "mysql";

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);

        String sql = "insert into temperature_log(temperature, location_id) values(?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setDouble(1, 75.6);
        statement.setInt(2, 3);
        int n = statement.executeUpdate();
        System.out.println("n = " + n);
    }
}
