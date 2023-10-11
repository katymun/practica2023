<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Pagina de testare</h1>
        <ul>
            <c:forEach var="unOras" items="${orase}">
                <li>${unOras}</li>
            </c:forEach>
        </ul>
        <h2>Urmeaza lista de aplicanti:</h2>
        <ul>
            <c:forEach var="unApplicant" items="${applicantList}">
                
                <li>
                    <p>Name: ${unApplicant.aName}, surname: ${unApplicant.aSurname}<br>
                status: ${unApplicant.status}</p></li>
            </c:forEach>
        </ul>
        
        <p>
            Valoare atributului main din context este ${mainAttribute}
        </p>
        
        <p>
            Valoare atributului main din context trimis prin servlet e ${mainAttributeServ}         </p>

    </body>
</html>
