package com.doranco.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.doranco.dto.Cours;

public class CoursDAO {

	private Connection conn;

	public CoursDAO(String url, String username, String password) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.conn = DriverManager.getConnection(url, username, password);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Connection getConnection() throws SQLException {
		System.out.println("Connection basse de donné : " + conn.getClientInfo(null));

		return this.conn;
	}

	public Cours findById(int id) {
		Cours cours = null;

		try {
			PreparedStatement prepareStatement = conn
					.prepareStatement("SELECT * FROM Cours WHERE cours_id=?");
			prepareStatement.setInt(1, id);

			ResultSet resultSet = prepareStatement.executeQuery();

			if (resultSet.next()) {
				cours = new Cours(resultSet.getInt(1), resultSet.getString("intitule"),
						resultSet.getInt("coef"), resultSet.getInt("duree"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return cours;
	}

}
