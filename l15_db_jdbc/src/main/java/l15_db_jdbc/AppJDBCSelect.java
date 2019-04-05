package l15_db_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AppJDBCSelect {

	public static void main(String[] args) {

		try (Connection connection = DriverManager.getConnection("jdbc:postgresql://cloud:5432/appdb", "postgres",
				"postgre")) {

			System.out.println("Connected");

			Statement statement = connection.createStatement();

			System.out.printf("%-30.30s  %-30.30s%n", "Name", "Surname");

			ResultSet resultSet = statement.executeQuery("SELECT * FROM public.person");

			while (resultSet.next()) {
				System.out.printf("%-30.30s  %-30.30s%n", resultSet.getString("name"), resultSet.getString("surname"));
			}

		} catch (SQLException e) {
			System.out.println("Connection failure.");
			e.printStackTrace();
		}
	}

}
