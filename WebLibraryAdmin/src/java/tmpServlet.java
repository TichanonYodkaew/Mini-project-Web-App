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
@WebServlet(urlPatterns = {"/tmpServlet"})
public class tmpServlet extends HttpServlet {

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
        HttpSession session = request.getSession();
        //String Username = (String)session.getAttribute("Username");
        Book book = (Book)session.getAttribute("book");
        PrintWriter out = response.getWriter();
        //out.println("Username:"+Username);
        out.println("<h2>Edit book name</h2>");
        out.println("<form action=\"AddBooksServlet\">");
        out.println("<label>Name:</label>\n" +
"            <input type=\"text\" name=\"Addbookname\"value='" + book.getAddbookname()+ "'><br/>");
        out.println("<p>Type:</p>");
        out.println("<input type=\"radio\" id=\"comic\" name=\"Addtype\" value=\"COMMIC\">>\n" +
"            <label for=\"comic\"> Comic</label><br/>");
        out.println(" <input type=\"radio\" id=\"nonfiction\" name=\"Addtype\" value=\"NONFICTION\">>\n" +
"            <label for=\"nonfiction\"> Non - Fiction</label><br/>");
        out.println("<input type=\"radio\" id=\"fiction\" name=\"Addtype\" value=\"FICTION\">>\n" +
"            <label for=\"fiction\"> Fiction</label><br/>");
        out.println("<input type=\"radio\" id=\"referencebook\" name=\"Addtype\" value=\"REFERENCEBOOK\">>\n" +
"            <label for=\"referencebook\"> Reference Book</label><br/>");
        out.println("<br></br>");
        out.println("<label>Publisher:</label>\n" +
"            <input type=\"text\" name=\"Addpublisher\"><br/>");
        out.println("<p>print time:</p>");
        out.println(" <input type=\"radio\" id=\"1\" name=\"Addprinttime\" value=\"1\" >\n" +
"            <label for=\"1\">1</label><br/>");
        out.println("<input type=\"radio\" id=\"2\" name=\"Addprinttime\" value=\"2\" >\n" +
"            <label for=\"2\">2</label><br/>");
        out.println("<input type=\"radio\" id=\"3\" name=\"Addprinttime\" value=\"3\" >\n" +
"            <label for=\"3\">3</label><br/>");
        out.println("<input type=\"radio\" id=\"4\" name=\"Addprinttime\" value=\"4\" >\n" +
"            <label for=\"4\">4</label><br/>");
        out.println("<input type=\"hidden\" name=\"Username\" value=\"Tuu\"></br>");
        out.println("<input type=\"submit\" value=\"Addbook\">");
        out.println("</form>");
      
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
