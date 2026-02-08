package ejb;

import java.io.*;
import jakarta.servlet.*;   // ✅ use jakarta.* for Tomcat 11
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet(name = "MyServlet", urlPatterns = {"/MyServlet"})
public class MyServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ReservationBean myBean = new ReservationBean();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("t1");
        String startDate = request.getParameter("t2");
        String endDate = request.getParameter("t3");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        boolean ans = myBean.canReserve(name, startDate, endDate);
        if (!ans) {
            out.println("<html><body bgcolor='#005580' text='white'><center>");
            out.println("<h3>Room could not be reserved on the requested start date.</h3>");
            out.println("</center></body></html>");
        } else {
            out.println("<html><body bgcolor='#008000' text='white'><center>");
            out.println("<h3>Room has been reserved.</h3>");
            out.println("</center></body></html>");
        }
        out.close();
    }
}