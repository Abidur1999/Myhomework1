package JDBCDEMO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo {
    public static void main(String[] args) {
        try {
            // 1. create a connection
            Connection connection = DriverManager.getConnection(
                    "jdbc://mysql://localhost:3306/Netflix?serverTimezone=UTC",
                    "root",
                    "abcd1234"
            );
            // 2. create statement
            Statement statement = connection.createStatement();
            // 3. Execute the SQL Query
            String query = "insert into movie (id, title, release_year,genre,mpaa_rating)/n" +
                    "values (4,'Bader Meye Josna',1980,'Drama','PG')";
            // 4. Process result set (if necessary)
        } catch (Exception e) {
            e.printStackTrace();


        }
    }
}





