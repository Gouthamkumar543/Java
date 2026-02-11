<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
</head>
<body>
	<h1>Goutham</h1>
    <h2>Room Reservation Details</h2>
    <form action="MyServlet" method="GET">
        Name: <input type="text" name="t1"/><br/><br/>
        Start Date: <input type="date" name="t2"/><br/><br/>
        End Date: <input type="date" name="t3"/><br/><br/>
        <input type="submit" value="Submit"/>
        <input type="reset" value="Reset"/>
    </form>
</body>
</html>