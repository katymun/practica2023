<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;500&display=swap" rel="stylesheet">
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
        <div class="it-section-title">${domain} <b>Internships</b></div>
        <section>

            <div class="it-companies">
                <c:forEach items="${internshipCompanyMap}" var="internshipCompany">

                    <a href="internship_details.html?ID_INTERNSHIP=${internshipCompany.key.id}" class="internships-found-company it-companies1">
                        <div class="avatar">                    
                            <img src="uploads/${internshipCompany.value.imagePath}" width="100px" alt="noImg"/>
                        </div>
                        <div class="company-info">
                            <p class="company-name">${internshipCompany.key.iName}</p>
                            <p class="company-detail">${internshipCompany.value.title}</p>
                        </div>
                        <div class="date-info">
                            <div class="date-duration">${internshipCompany.key.duration}</div>
                            <div class="date-start"><fmt:formatDate value="${internshipCompany.key.startDate}" pattern="dd-MM-yyyy" /></div>
                        </div>
                    </a>
                </c:forEach>
            </div>
        </section>
        <jsp:include page="common/footer.jspf" />

    </body>


</html>