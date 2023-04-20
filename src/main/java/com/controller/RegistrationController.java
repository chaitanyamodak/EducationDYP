package com.controller;
import com.dao.RegistrationDao;
import com.model.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=request.getParameter("email");
		String name=request.getParameter("name");
		String year=request.getParameter("year");
		String city=request.getParameter("city");
		String mobNo=request.getParameter("mobNo");
		String pass=request.getParameter("pass");
		
		
		RegistrationModel rModel=new RegistrationModel(email,name,year,city,mobNo,pass);
		RegistrationDao rDao=new RegistrationDao();
		int i = rDao.createAccount(rModel);
		
		if(i>0)
		{
			
			//response.sendRedirect("../Template/Login.html");
		
		
		PrintWriter pWriter=response.getWriter();
		pWriter.print("<h5>"+"Account created"+"</h5>");
		
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
