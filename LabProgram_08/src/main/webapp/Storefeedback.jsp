<%@ page import="org.hibernate.*,org.hibernate.cfg.*" %>
<%@ page import="mypackage.Store" %>

<%
    String name = request.getParameter("t1");
    String message = request.getParameter("t2");

    Configuration cfg = new Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory sf = cfg.buildSessionFactory();   // FIXED: create SessionFactory
    Session hibSession = sf.openSession();
    Transaction tx = null;

    try {
        tx = hibSession.beginTransaction();
        Store s1 = new Store();
        s1.setName(name);
        s1.setMessage(message);
        hibSession.save(s1);
        tx.commit();
        out.println("<h3>Feedback Added Successfully!</h3>");
    } catch (Exception e) {
        if (tx != null) tx.rollback();
        out.println("<h3 style='color:red;'>Error saving feedback: " + e.getMessage() + "</h3>");
    } finally {
        hibSession.close();
        sf.close();
    }
%>