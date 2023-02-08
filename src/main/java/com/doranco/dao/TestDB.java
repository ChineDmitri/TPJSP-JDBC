package com.doranco.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.doranco.dto.Cours;

public class TestDB {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		CoursDAO coursDAO = new CoursDAO("jdbc:mysql://localhost:3310/tpjspformation",
				"student", "pass");

		Connection conn = coursDAO.getConnection();		
//
//		System.out.println(cours.getIntitule());

	}

}
