<%-- 
    Document   : imageUpload
    Created on : 20 Sep, 2018, 8:45:45 AM
    Author     : The Evil Road
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Upload An Image</h1>
        
        <form action="ImageUpload" method="post" enctype="multipart/form-data">
            <input type="file" name="myfile"/>
            <br>
            <input type="submit" value="Upload"/>
            
        </form>
    </body>
</html>
