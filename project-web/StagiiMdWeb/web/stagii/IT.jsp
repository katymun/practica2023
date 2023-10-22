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
        <!--internshipList-->
        <div class="it-section-title">IT <b>Internships</b></div>
        <section>

            <div class="it-companies">
                <c:forEach items="${internshipList}" var="internship">

                    <a href="internship_details.html?ID_INTERNSHIP=${internship.id}" class="internships-found-company it-companies1">
                        <div class="avatar"></div>
                        <div class="company-info">
                            <p class="company-name">Numele Internshipului</p>
                            <p class="company-detail">Numele companiei</p>
                        </div>
                        <div class="date-info">
                            <input type="text" placeholder="Duration">
                            <input type="text" placeholder="Start date">
                        </div>
                    </a>



                </c:forEach>
            </div>

            <!--            <div class="it-companies">
                            <a href="internship_details.html" class="it-company">
                                <div class="it-companies1">
                                    <div class="content">Company
                                </div>
                            </a>
                            <div class="it-companies2">
                                <a href="internship_details.html" class="it-company">
                                    <div class="content">Company
                            </div>
                            </a>
                        </div>-->
            <!--            <div class="it-companies3">
                            <a href="internship_details.html" class="it-company">
                                <div class="content">Company
                        </div>
                          </a>
                         </div>-->
            <!--            <div class="it-companies4">
                            <a href="internship_details.html" class="it-company">
                                <div class="content">Company 
                            </a>
                        </div>
                        <div class="it-companies5">
                            <a href="internship_details.html" class="it-company">
                                <div class="content">Company 
                            </a>
                        </div>-->
        </section>
        <jsp:include page="common/footer.jspf" />

    </body>


</html>