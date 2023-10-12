<%-- 
    Document   : companypage
    Created on : Oct 12, 2023, 12:05:25 PM
    Author     : munka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Company Page</title>
    </head>
    <body>
        <h1>Company Page jsp</h1>
        <p>
            Lista companiilor:
        </p>
        <table>
            <c:forEach items="${listaCompanii}" var="oneCompany">
                <tr>
                    <td>${oneCompany.id}</td>
                    <td>${oneCompany.title}</td>
                    <td>${oneCompany.domain}</td>
                    <td><a href="companyfindbynameserv?title=${oneCompany.title}">View</td>
                </tr>
            </c:forEach>
        </table>
        <p>
            <a href=""
        </p>
    </body>
</html>
