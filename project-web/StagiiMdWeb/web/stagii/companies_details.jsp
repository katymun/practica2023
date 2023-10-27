<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Company Details</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/stagii/style.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;700&family=Onest:wght@400;700&display=swap"
              rel="stylesheet">
    </head>

    <body>
        <jsp:include page="common/header_companies.jspf" />
        <section>
            <div class="companies-details-companies1">
                <p class="company-description">
                    ${company.about}
                </p>
                <div class="con">
                    <div class="company-phone"><u>Telephone:</u> ${company.phoneNumber}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <u>Email:</u> ${company.email}</div>
                </div>
            </div>
                <br>
            <div class="companies-details-internships">Internships:</div>

            <c:forEach items="${internshipsList}" var="internship">

                <a href="internship_details.html?ID_INTERNSHIP=${internship.id}" class="internships-found-company it-companies1">
                    <img src="uploads/${company.imagePath}" width="100px" alt="noImg"/>
                    <div class="company-info">
                        <p class="company-name">${internship.iName}</p>
                        <p class="company-detail">${company.title}</p>
                    </div>
                    <div class="date-info1">
                        <div class="date-duration1">Duration</div>
                        <div class="date-start">Start Date</div>
                    </div>
                    <div class="date-info2">
                        <div class="date-duration">${internship.duration}</div>
                        <div class="date-start"><fmt:formatDate value="${internship.startDate}" pattern="d MMMMMMMMMM yyyy" /></div>
                    </div>
                </a>
            </c:forEach>

        </section>
        <jsp:include page="common/footer.jspf" />

    </body>

</html>