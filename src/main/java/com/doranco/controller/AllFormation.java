package com.doranco.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doranco.dao.CoursDAO;
import com.doranco.dto.Cours;

@WebServlet("/AllFormation")
public class AllFormation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	CoursDAO coursDAO = new CoursDAO("jdbc:mysql://localhost:3310/tpjspformation",
			"student", "pass");

	public AllFormation() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		/*
		 * try { Connection conn = coursDAO.getConnection(); } catch (SQLException e) {
		 * // TODO Auto-generated catch block e.printStackTrace(); }
		 */

		Cours cours = coursDAO.findById(1);
		System.out.println("cours : " + cours.toString());

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
