package com.doranco.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class TestDB {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		CoursDAO cours = new CoursDAO("http://localhost:3310/tpjspformation", "student",
				"pass");

		Connection conn = cours.getConnection();

	}

}
