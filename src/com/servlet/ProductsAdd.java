package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.utility.HibernateUtility;
import com.model.*;

/**
 * Servlet implementation class ProductsAdd
 */
@WebServlet("/ProductsAdd")
public class ProductsAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Session session = HibernateUtility.getSession();
		Transaction tx = session.beginTransaction();
		
		//String pid = request.getParameter("pId");
		String pname = request.getParameter("pName");
		String pcategory = request.getParameter("pCategory");
		String pquantity = request.getParameter("pQuantity");

		Details det = new Details(pname,pcategory,pquantity);
		
		session.save(det);
		tx.commit();
			
		response.sendRedirect("Welcome.html");
	
		
	}
		
		
	}


