package l15_db_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonToDB {

	private String SQL = "INSERT INTO person(name, surname) VALUES(?,?)";

	private Connection conn;

	public PersonToDB(String connectionString, String user, String pass) {
		try {
			conn = DriverManager.getConnection(connectionString, user, pass);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void personInsert(Person person) {

		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, person.getName());
			pstmt.setString(2, person.getSurname());

			// conn.commit();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
