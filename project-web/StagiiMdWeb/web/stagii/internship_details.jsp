<%@page import="java.util.Arrays"%>
<%@page import="com.iucosoft.stagiimdweb.entities.InternshipProgram"%>
<%@page import="java.util.List"%>
<%@page import="com.iucosoft.stagiimdweb.entities.Company"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">    

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Internship Details</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/stagii/style.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;700&family=Onest:wght@400;700&display=swap"
              rel="stylesheet">
    </head>

    <body>
        <jsp:include page="common/header_internships.jspf" />
        <div class="internships-found-companies">

            <div class="internships-info-box-details it-companies2">
                <img src="uploads/${company.imagePath}" width="100px" alt="noImg"/>
                <div class="company-info">
                    <p class="company-name">${internshipProgram.iName}</p>
                    <p class="company-detail">${company.title}</p>
                </div>
                <div class="date-info1">
                    <div class="date-duration1">Duration</div>
                    <div class="date-start">Start Date</div>
                </div>
                <div class="date-info2">
                    <div class="date-duration">${internshipProgram.duration}</div>
                    <div class="date-start"><fmt:formatDate value="${internshipProgram.startDate}" pattern="d MMMMMMMMMM yyyy" /></div>
                </div>
            </div>
        </div>
        <!--        <div class="internship-details-white-box1">
                    
                </div>-->
        <!--internshipProgram-->
        <div class="internship-details-main">
            <div class="internship-details-container1">
                <div class="internship-details-description-internship">
                    <p class="internship-details-box-text">Company overview:</p>

                    <p class="internship-details-box1">${company.about}</p>
                    <p class="internship-details-box-text">What you'll do:</p>
                    <ul>
                        <%
                            InternshipProgram internshipProgram = (InternshipProgram) request.getAttribute("internshipProgram");
                            String[] dutiesArray = internshipProgram.getDuties().split("/");
                            for (int i = 0; i < dutiesArray.length; i++) {

                        %>
                        <li> <%= dutiesArray[i]%></li>
                            <%

                                }

                            %>
                    </ul>
                    <p class="internship-details-box-text">What we are looking for:</p>

                    <ul>
                        <%                                String[] qualificationsArray = internshipProgram.getQualifications().split("/");
                            for (int i = 0; i < qualificationsArray.length; i++) {

                        %>
                        <li> <%= qualificationsArray[i]%></li>
                            <%

                                }

                            %>
                    </ul>

                    <p class="internship-details-box-text">What we offer:</p>
                    <ul>
                        <%                                String[] benefitsArray = internshipProgram.getBenefits().split("/");
                            for (int i = 0; i < benefitsArray.length; i++) {

                        %>
                        <li> <%= benefitsArray[i]%></li>
                            <%

                                }

                            %>
                    </ul>
                </div>

                <div class="internship-details-details-internship">
                    <div class="internship-details-container3">
                        <img src="images/Paid.svg" class="internship-details-paid" width="50" height="50">
                        <%                            String paid = "";
                            if (internshipProgram.isPaid()) {
                                paid = "Yes";
                            } else {
                                paid = "No";
                            }
                        %>
                        <div class="internship-details-box3"><u>Paid:</u><br><%= paid%></div>
                    </div>
                    <div class="internship-details-container4">
                        <img src="images/Schedule.svg" class="internship-details-schedule" width="50" height="50">
                        <div class="internship-details-box4"><u>Schedule:</u><br>Part-time</div>
                    </div>
                    <div class="internship-details-container5">
                        <img src="images/Location.svg" class="internship-details-location" width="50" height="50">
                        <div class="internship-details-box5"><u>Location:</u><br><%= internshipProgram.getLocation()%></div>
                    </div>
                    <div class="internship-details-container6">
                        <img src="images/Phone.svg" class="internship-details-phone" width="50" height="50">
                        <div class="internship-details-box6"><u>Phone number:</u><br>${company.phoneNumber}</div>
                    </div>
                    <div class="internship-details-container7">
                        <img src="images/Mail.svg" class="internship-details-mail" width="50" height="50">
                        <div class="internship-details-box7"><u>Email:</u><br>${company.email}</div>
                    </div>
                </div>
            </div>
        </div>
        <div class="internship-details-mail1">
            <div class="internship-details-company-mail">
                <div class="internship-details-email">Email:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ${company.email}</div>
                <div class="internship-details-invisible"></div>
            </div>
        </div>


        <div class="internship-details-other">Other internships published by this company:</div>
        <c:forEach items="${internshipCompanyMapByCompany}" var="internshipCompany">

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
        <div class="internship-details-similar">Similar internships:</div>
        <c:forEach items="${internshipCompanyMapByDomain}" var="internshipCompany">

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
        <jsp:include page="common/footer.jspf" />
    </body>

</html>