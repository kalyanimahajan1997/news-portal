 
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import beans.Reporter;
import daos.ReporterDao;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;
import javax.servlet.ServletContext;
 import utility.FileUploader;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class ReporterController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String op = request.getParameter("op");
        System.out.println("op:"+op);
         
        if(op!=null && op.equalsIgnoreCase("check_userid"))
        {
            String userid = request.getParameter("userid");
            ReporterDao rd = new ReporterDao();
            if(userid==null || userid.equals(""))
            {
                out.println("<font size='4'>Plase provide Userid</font>");
                return;
            }
            if(rd.isUserIdExist(userid))
                out.println("<font color='red' size='4'>Sorry This Userid already Exist!</font>");
            else
               out.println("<font color='blue' size='4'>Congrats! this userid is available!!</font>");
            
        }
        
         if(op!=null && op.equalsIgnoreCase("check_email"))
         {
             String email = request.getParameter("email");
             ReporterDao rd = new ReporterDao();
             if(email==null || email.equals("") )
             {
                 out.println("<font size='4'>Plase provide Userid</font>");
                return;
             }
             if(rd.isEmailExist(email))
                 out.println("<font color='red' size='4'>Sorry This email already Exist!</font>");
            else
               out.println("<font color='blue' size='4'>Congrats! this email is available!!</font>");
         }
       
          if(op!=null && op.equalsIgnoreCase("check_contact"))
         {
             String contact = request.getParameter("contact");
             ReporterDao rd = new ReporterDao();
             if(contact==null || contact.equals("") )
             {
                 out.println("<font size='4'>Plase provide contact no.</font>");
                return;
             }
             if(rd.isContactExist(contact))
                 out.println("<font color='red' size='4'>Sorry This contact already Exist!</font>");
            else
               out.println("<font color='blue' size='4'>Congrats! this contact is available!!</font>");
         }
          
     }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out= response.getWriter();
        response.setContentType("text/html");
        String op =request.getParameter("op");
        System.out.println("op:"+op);
        if (op!=null && op.equalsIgnoreCase("add")){
            HttpSession session = request.getSession();
            Reporter reporter = (Reporter)session.getAttribute("reporter");
            ReporterDao rd = new ReporterDao();
            
            String ImagePath = "";
            ImagePath  = FileUploader.getUploadedPath(getServletContext(), "media/reporter", request);
            reporter.setImage(ImagePath);
            
            if(rd.add(reporter)){
                session.removeAttribute("reporter");
                out.println("Reproter Added Successfully !");
                response.sendRedirect("admin/dashboard.jsp");
            }
        }
        
        
        if (op!=null && op.equalsIgnoreCase("update")){
            HttpSession session = request.getSession();
            Reporter reporter = (Reporter)session.getAttribute("reporter");
            ReporterDao rd = new ReporterDao();
            
            String imagePath = "";
            imagePath  = FileUploader.getUploadedPath(getServletContext(), "media/reporter", request);
            if(imagePath.equals("media/reporter/"))
                reporter.setImage(reporter.getImage());
            else
                reporter.setImage(imagePath);
            
            if(rd.update(reporter)){
                session.removeAttribute("reporter");
                out.println("Reproter Added Successfully !");
                response.sendRedirect("admin/dashboard.jsp");
            }
        }
    }

     
}
