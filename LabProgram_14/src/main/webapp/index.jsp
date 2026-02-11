<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Registration</title>
</head>
<body>
	<h2>Goutham</h2>
    <h2>Register Student</h2>
    <form action="StudentServlet" method="post">
        Name: <input type="text" name="name"/><br/><br/>
        Course: <input type="text" name="course"/><br/><br/>
        Email: <input type="email" name="email"/><br/><br/>
        <input type="submit" value="Register"/>
        <input type="reset" value="Reset"/>
    </form>
</body>
</html>