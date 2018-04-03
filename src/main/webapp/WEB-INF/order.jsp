

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order legohouse</title>
    </head>
    <body>
        <h1>Order your legohouse here:</h1>
        <form method="GET" action="LegoServlet">
            Height:
            <input type="number" name="amountH" required="" placeholder="Brickheight"/>
            <br></br>
            Length:
            <input type="number" name="amountL" required="" placeholder="Bricklength"/>
            <br></br>
            Width:
            <input type="number" name="amountW" required="" placeholder="Brickwidth"/>
            <br></br>
            <input type="submit" name="btn" value="Order"/>
        </form>
    </body>
</html>
