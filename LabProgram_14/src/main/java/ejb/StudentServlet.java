package ejb;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet(name = "StudentServlet", urlPatterns = {"/StudentServlet"})
public class StudentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private StudentBean studentBean = new StudentBean();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String course = request.getParameter("course");
        String email = request.getParameter("email");

        boolean result = studentBean.registerStudent(name, course, email);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (result) {
            out.println("<html><body bgcolor='#008000' text='white'><center>");
            out.println("<h3>Student Registered Successfully!</h3>");
            out.println("</center></body></html>");
        } else {
            out.println("<html><body bgcolor='#FF0000' text='white'><center>");
            out.println("<h3>Registration Failed!</h3>");
            out.println("</center></body></html>");
        }
        out.close();
    }
}