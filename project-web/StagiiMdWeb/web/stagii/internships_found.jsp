<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Found Internships</title>
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
                <c:forEach items="${internshipCompanyMap}" var="internshipCompany">

                    <a href="internship_details.html?ID_INTERNSHIP=${internshipCompany.key.id}" class="internships-found-company it-companies1">
                            <img src="uploads/${internshipCompany.value.imagePath}" width="100px" alt="noImg"/>
                        <div class="company-info">
                            <p class="company-name">${internshipCompany.key.iName}</p>
                            <p class="company-detail">${internshipCompany.value.title}</p>
                        </div>
                        <div class="date-info1">
                            <div class="date-duration1">Duration</div>
                            <div class="date-start">Start Date</div>
                        </div>
                        <div class="date-info2">
                            <div class="date-duration">${internshipCompany.key.duration}</div>
                            <div class="date-start"><fmt:formatDate value="${internshipCompany.key.startDate}" pattern="d MMMMMMMMMM yyyy" /></div>
                        </div>
                    </a>
                </c:forEach>
            </div>


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
