import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*; 

public class Register extends HttpServlet
{
    public void doPost(HttpServletRequest rq,HttpServletResponse rs) throws ServletException,IOException
    {
        rs.setContentType("text/html");
        PrintWriter p=rs.getWriter();
        String n=rq.getParameter("User_name");
        p.println("helo baskar"+n);

    }



}