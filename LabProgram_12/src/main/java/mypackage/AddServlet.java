package mypackage;

import ejb.AddEjb;
import java.io.*; 
import jakarta.servlet.*;  
import jakarta.servlet.annotation.WebServlet;  
import jakarta.servlet.http.*;  

@WebServlet(urlPatterns = {"/AddServlet"})
public class AddServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private AddEjb ejbObj = new AddEjb();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        try {
            int i = Integer.parseInt(req.getParameter("t1"));
            int j = Integer.parseInt(req.getParameter("t2"));
            int k = ejbObj.add(i, j);

            out.println("<h3>Addition: " + k + "</h3>");
        } catch (NumberFormatException e) {
            out.println("<h3>Invalid input. Please enter numbers.</h3>");
        }
    }
}