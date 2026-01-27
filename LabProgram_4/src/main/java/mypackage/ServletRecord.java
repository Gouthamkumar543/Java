package mypackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletRecord
 */
@WebServlet(name = "ServletRecord1", urlPatterns = { "/ServletRecord1" })
public class ServletRecord extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ServletRecord() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // For GET requests, just show a simple message
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Use the form to submit answers via POST.</h2>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            out.println("<html>");
            out.println("<head><title>Servlet Question Paper</title></head>");
            out.println("<body>");
            out.println("<h2>Result:</h2>");

            // Retrieve form parameters
            String r1 = request.getParameter("r1");
            String r2 = request.getParameter("r2");
            String r3 = request.getParameter("r3");
            String r4 = request.getParameter("r4");

            // Check answers
            if ("a".equals(r1) && "java".equals(r2) && "jdbc".equals(r3) && "hql".equals(r4)) {
                out.println("<p style='color:green;'>You are Pass</p>");
            } else {
                out.println("<p style='color:red;'>Try again next time</p>");
            }

            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
}