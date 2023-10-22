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
        <div class="internship-details-white-box1">
        </div>
        <!--internshipProgram-->
        <div class="internship-details-container1">
            <div class="internship-details-description-internship">
                <p class="internship-details-box-text1">Company overview:</p>
                <p class="internship-details-box-text2">What you'll do:</p>
                <p class="internship-details-box-text3">What we are looking for:</p>
                <p class="internship-details-box-text4">What we offer:</p>
            </div>

            <div class="internship-details-details-internship">
                <div class="internship-details-container2">
                    <img src="images/Studies.svg" class="internship-details-studies" width="50" height="50">
                    <div class="internship-details-box2">Studies:</div>
                </div>
                <div class="internship-details-container3">
                    <img src="images/Paid.svg" class="internship-details-paid" width="50" height="50">
                    <div class="internship-details-box3">Paid:</div>
                </div>
                <div class="internship-details-container4">
                    <img src="images/Schedule.svg" class="internship-details-schedule" width="50" height="50">
                    <div class="internship-details-box4">Schedule:</div>
                </div>
                <div class="internship-details-container5">
                    <img src="images/Location.svg" class="internship-details-location" width="50" height="50">
                    <div class="internship-details-box5">Location:</div>
                </div>
                <div class="internship-details-container6">
                    <img src="images/Phone.svg" class="internship-details-phone" width="50" height="50">
                    <div class="internship-details-box6">Telephone:</div>
                </div>
                <div class="internship-details-container7">
                    <img src="images/Mail.svg" class="internship-details-mail" width="50" height="50">
                    <div class="internship-details-box7">Mail:</div>
                </div>
            </div>
        </div>
        <div class="internship-details-company-mail"><div class="internship-details-email">E-mail:</div> </div>

        <div class="internship-details-other">Other internships published by this company:</div>
        <a href="internship_details.html" class="internship-details-styled-link">
            <div class="internship-details-other-box1"></div>
        </a>
        <a href="internship_details.html">
            <div class="internship-details-other-box2"></div>
        </a>
        <div class="internship-details-similar">Similar internships:</div>
        <a href="internship_details.html">
            <div class="internship-details-similar-box1"></div>
        </a>
        <a href="internship_details.html">
            <div class="internship-details-similar-box2"></div>
        </a>
        <jsp:include page="common/footer.jspf" />
    </body>

</html>