package playground.database;


import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/weather";
        String username = "root";
        String password = "mysql";

        // 1. load JDBC driver
        Class.forName("com.mysql.jdbc.Driver");

        // 2. get database connection fro DriverManager
        Connection connection = DriverManager.getConnection(url, username, password);

        // 3. Create a Statement from connection
        Statement statement = connection.createStatement();

        // 4. Execute the Statement and get a ResultSet
        ResultSet resultSet = statement.executeQuery("select * from temperature_log");

        // 5. Loop through the result set
        while (resultSet.next()) {
            double temperature = resultSet.getDouble(2);
            Timestamp recordTime = resultSet.getTimestamp(3);
            int locationId = resultSet.getInt(4);
            System.out.printf("%.2f %s %d\n", temperature, recordTime, locationId);
        }
    }


}
