<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/stagii/style.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;700&family=Onest:wght@400;700&display=swap"
              rel="stylesheet">
    </head>

    <body>
        <jsp:include page="common/header_internships.jspf" />
        <div class="internships-found-section-title">Found <b>Internships</b></div>
        <section>
            <div class="internships-found-companies">
                <c:forEach items="${internshipListTopFive}" var="internship">
                    <div class="internships-found-companies1"></div>
                    <a href="internship_details.html?ID_INTERNSHIP=${internship.id}" class="internships-found-company">
                        ${internship.iName}
                    </a>
                </div>
            </c:forEach>

<!--
            <div class="internships-found-companies2">
                <a href="internship_details.html" class="internships-found-company">
                    <div class="content">Company 
                </a>
            </div>
            <div class="internships-found-companies3">
                <a href="internship_details.html" class="internships-found-company">
                    <div class="content">Company 
                </a>
            </div>
            <div class="internships-found-companies4">
                <a href="internship_details.html" class="it-company">
                    <div class="content">Company 
                </a>
            </div>
            <div class="internships-found-companies5">
                <a href="internship_details.html" class="internships-found-company">
                    <div class="content">Company 

                </a>
            </div>
            <div class="internships-found-companies5">
                <a href="internship_details.html" class="internships-found-company">
                    <div class="content">Company 

                </a>
            </div>
            <div class="internships-found-companies7">
                <a href="internship_details.html" class="internships-found-company">
                    <div class="content">Company 

                </a>
            </div>
            <div class="internships-found-companies8">
                <a href="internship_details.html" class="internships-found-company">
                    <div class="content">Company 

                </a>
            </div>
            <div class="internships-found-companies9">
                <a href="internship_details.html" class="internships-found-company">
                    <div class="content">Company 

                </a>
            </div>
            <div class="internships-found-companies10">
                <a href="internship_details.html" class="internships-found-company">
                    <div class="content">Company 

                </a>
            </div>-->
        </section>
        <jsp:include page="common/footer.jspf" />

    </body>

</html>
