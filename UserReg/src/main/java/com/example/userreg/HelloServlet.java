package com.example.userreg;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
   // private String message;

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    public void destroy() {
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();

        String userName = request.getParameter("username");
        String password = request.getParameter("password");

        User user = new User(userName,password);

       if(LoginDao.validate(userName,password)){
           RequestDispatcher requestDispatcher= request.getRequestDispatcher("/Welcome.jsp");
           requestDispatcher.include(request,response);

            request.setAttribute("user",user);
            getServletContext()
                    .getRequestDispatcher("/Welcome.jsp")
                    .forward(request,response);
       } else{
           out.println("Wrong Username or password !!");
           RequestDispatcher requestDispatcher= request.getRequestDispatcher("/index.jsp");
           requestDispatcher.include(request,response);
       }

    }
}