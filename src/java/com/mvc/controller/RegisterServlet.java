package com.mvc.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.lang.*;
 
import com.mvc.bean.RegisterBean;
import com.mvc.dao.RegisterDao;
import java.io.PrintWriter;
 
public class RegisterServlet extends HttpServlet {
 
 public RegisterServlet() {
 }
 
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 //Copying all the input parameters in to local variables
 String firstName = request.getParameter("form-first-name");
 String lastName = request.getParameter("form-last-name");
 String email = request.getParameter("form-email");
 String contact = request.getParameter("contact_no");
 
  response.setContentType("text/html");

      // Actual logic goes here.
      PrintWriter out = response.getWriter();
      out.println("<h1>" + "Hello Word"+firstName+lastName+email+contact + "</h1>");
 RegisterBean registerBean = new RegisterBean();
 //Using Java Beans - An easiest way to play with group of related data
 registerBean.setFirstName(firstName);
 registerBean.setLastName(lastName);
 registerBean.setEmail(email);
 registerBean.setContact(contact);
 
 RegisterDao registerDao = new RegisterDao();
 
 //The core Logic of the Registration application is present here. We are going to insert user data in to the database.
 String userRegistered = registerDao.registerUser(registerBean);
 
 if(userRegistered.equals("SUCCESS"))   //On success, you can display a message to user on Home page
 {
 request.getRequestDispatcher("/index.jsp").forward(request, response);
 request.setAttribute("msg","You have Successfully Registered");
 }
 else   //On Failure, display a meaningful message to the User.
 {
 request.setAttribute("errMessage", userRegistered);
 //request.getRequestDispatcher("/index.html").forward(request, response);
 }
 }
}