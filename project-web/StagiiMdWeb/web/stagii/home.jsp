<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" href="${pageContext.request.contextPath}/stagii/style.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;700&family=Onest:wght@400;700&display=swap"
              rel="stylesheet">
    </head>
    <body>
        <!--<script src="stagii/header_home.js"></script>-->
        <jsp:include page="common/header_home.jspf" flush="true" />
        <%--<%@include file="common/header_home.jspf" %>--%>
        <div class="homepage-hero-section">
            <div class="homepage-left">
                <h1>
                    <!--<img src="images/details.svg" class="homepage-details">-->
                    <div class="homepage-text">
                        <img src="images/accent-internships.svg" class="homepage-accent">
                        <div class="homepage-find-internships">Find <b>internships</b></div>

                    </div>
                </h1>


                <!-- Text input-->
                <div class="homepage-button">
                    <div class="homepage-form-group">
                        <label class="homepage-col control-label" for=""></label>
                        <div class="homepage-col">
                            <form action="internshipsfoundserv">
                                <input id="" name="SEARCH_INTERNSHIPS" type="text" placeholder="Search for an internship" class="homepage-input homepage-custom-input" >
                                <div class="homepage-container">
                                    <img src="images/Search logo.svg" class="homepage-search">
                                    <a href="#" class="homepage-search">
                                        <button class="homepage-search-button">Search</button>
                                    </a>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="homepage-examples">
                    <br>
                    <ul><div class="homepage-text-example">Examples:</div><li><div class="homepage-examples-front">Front-end</div></li>
                        <li><div class="homepage-examples-back">Back end</div></li>
                        <li><div class="homepage-examples-design">Design</div></li>
                    </ul>
                    </br>
                </div>
            </div>
            <img src="images/image front page.svg" alt="" class="homepage-right-image" />
        </div>
    </div>
    <div class="homepage-internships-text">
        <img src="images/accent2.svg" class="homepage-accent2">
        <div class="homepage-text-category"> Find an <b>internship </b><br>by category</br> </div>
    </div>
</div>

<!-- End of header section-->


<div class="homepage-white-boxes">
    <a href="internshipsbydomainserv?domain=IT" class="homepage-white-box-link">
        <div class="homepage-white-box">
            <img src="images/IT sign.svg"  class="homepage-box-image1">
            <p class="homepage-box-text1">IT</p>
        </div>
    </a>
    <a href="internshipsbydomainserv?domain=Design" class="homepage-white-box-link">
        <div class="homepage-white-box">
            <img src="images/Design sign.svg"  class="homepage-box-image2">
            <p class="homepage-box-text">Design</p>
        </div>
    </a>
    <a href="internshipsbydomainserv?domain=Marketing" class="homepage-white-box-link">
        <div class="homepage-white-box">
            <img src="images/Marketing sign.svg"  class="homepage-box-image3">
            <p class="homepage-box-text">Marketing</p>
        </div>
    </a>
    <a href="internshipsbydomainserv?domain=Management" class="homepage-white-box-link">
        <div class="homepage-white-box">
            <img src="images/Management sign.svg"  class="homepage-box-image4">
            <p class="homepage-box-text2">Management</p>
        </div>
    </a>
    <a href="internships.html" class="homepage-white-box-link">
        <div class="homepage-white-box">
            <p class="homepage-box-text3">Discover <br> more</br></p>
        </div>
    </a>
</div>

<!--End of testimonials section-->
<section class="homepage-internships-section">
    <br>
    <div class="homepage-more-internships">Featured internships:</div>
    </br>
    <div class="homepage-companies1">
        <c:forEach items="${internshipCompanyTopFiveMap}" var="internshipCompany">
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

    <!--    <div class="homepage-companies1">
            <a href="internship_details.html?ID_INTERNSHIP=${internship.id}" class="internships-found-company it-companies1">
                <div class="avatar"></div>
                <div class="company-info">
                    <p class="company-name">Numele Internshipului</p>
                    <p class="company-detail">Numele companiei</p>
                </div>
                <div class="date-info">
                    <div class="date-duration">Duration</div>
                    <div class="date-start">Start date</div>
                </div>
            </a>
        </div>
        <div class="homepage-companies1">
            <a href="internship_details.html?ID_INTERNSHIP=${internship.id}" class="internships-found-company it-companies1">
                <div class="avatar"></div>
                <div class="company-info">
                    <p class="company-name">Numele Internshipului</p>
                    <p class="company-detail">Numele companiei</p>
                </div>
                <div class="date-info">
                    <div class="date-duration">Duration</div>
                    <div class="date-start">Start date</div>
                </div>
            </a>
        </div>-->
    <br>
    <div class="homepage-container1">
        <div class="homepage-vertical-center">
            <a href="internships.html" class="homepage-more-internships">
                <button class="homepage-more-button">More internships</button>
            </a>
        </div>
    </div>
</div>
</br>
</div>
</section>

</div>
<!-- End of company internship sections-->
<div class="homepage-container2">
    <!-- Text input-->
    <img src="images/newsletter.svg" class="homepage-news">
    <br>
    <form action="subscribeserv" method="post">
    <div class="homepage-receive">Receive internships by email</div>
    
    <img src="images/accent3.svg" class="homepage-accent3">
    <div class="homepage-form-group1">
        <label class="homepage-col control-label" for=""></label>
        <div class="homepage-col">
            <input id="" name="position" type="text" placeholder="Indicate the internship position" class="homepage-form-control1 homepage-input1">

        </div>
    </div>
    </br>
    <br>
    <!-- Text input-->
    <div class="homepage-form-group2">
        <label class="homepage-col control-label" for=""></label>
        <div class="homepage-col">
            <input id="" name="full-name" type="text" placeholder="Your full name" class="homepage-form-control2 homepage-input2">

        </div>
    </div>
    </br>
    <!-- Text input-->
    <br>
    <div class="homepage-form-group3">
        <label class="homepage-col control-label" for=""></label>
        <div class="homepage-col">
            <input id="" name="email" type="email" placeholder="Your email address" class="homepage-form-control3 homepage-input3">

        </div>
    </div>
    </br>
</fieldset>

<button class="homepage-subscribe-button">Subscribe</button>
</form>
    
</div>
<jsp:include page="common/footer.jspf" />
</body>

</html>