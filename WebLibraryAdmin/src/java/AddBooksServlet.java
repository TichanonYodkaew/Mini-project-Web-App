/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
@WebServlet(urlPatterns = {"/AddBooksServlet"})
public class AddBooksServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String Addbookname = request.getParameter("Addbookname");
            out.println( "Bookname:" + Addbookname + "</br>");
            
            String Addtype = request.getParameter("Addtype");
            out.println("Booktype:" + Addtype + "</br>");
            
            String Addpublisher = request.getParameter("Addpublisher");
            out.println("Publisher:" + Addpublisher + "</br>" );
            
            String Addprinttime = request.getParameter("Addprinttime");
            out.println("Printtime:" + Addprinttime + "</br>");
            
            //String Username = request.getParameter("Username");
            //out.println("User:"+Username);
            out.println("<a href='tmpServlet'>Edit book details</a>");
            HttpSession session = request.getSession();
            //session.setAttribute("Username",Username);
            
            Book book = new Book();
            book.setAddbookname(Addbookname);
            book.setAddtype(Addtype);
            book.setAddpublisher(Addpublisher);
            book.setAddprinttime(Addprinttime);
            session.setAttribute("book",book);
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
