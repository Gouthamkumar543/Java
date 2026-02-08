<%@ page import="java.util.List" %>
<%@ page import="com.ou.ejb.ListElementsBean" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Stateful Bean Simulation</title>
</head>
<body>
<h1>Stateful Bean Example (Tomcat)</h1>

<%
    ListElementsBean values = (ListElementsBean) session.getAttribute("values");
    if (values == null) {
        values = new ListElementsBean();
        session.setAttribute("values", values);
    }

    if (request.getParameter("addNum") != null) {
        int e = Integer.parseInt(request.getParameter("t1"));
        values.addElement(e);
    }

    if (request.getParameter("remNum") != null) {
        int e = Integer.parseInt(request.getParameter("t1"));
        values.removeElement(e);
    }
%>

<form name="form1" method="post">
    Enter elements to add/remove from the list one at a time<br/>
    <input type="text" name="t1"/><br/><br/>
    <input type="submit" value="Add" name="addNum"/>
    <input type="submit" value="Remove" name="remNum"/>
</form>

<br/><br/>

<%
    List<Integer> nums = values.getElements();
    for (int value : nums) {
        out.println(value + "<br/>");
    }
    out.println("<br><br>Size of list = " + nums.size());
%>
</body>
</html>