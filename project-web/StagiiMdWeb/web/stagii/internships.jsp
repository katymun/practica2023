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
        <!--<script src="header_internships.js"></script>-->
        <jsp:include page="common/header_internships.jspf" />
        <!-- end of desktop navigation menu-->
        <div class="internship-best">
            <img src="images/accentul.svg" alt="" class="internship-best-accent">
            <div class="internship-section-title">Discover the <b> Best Internships</b></div>
        </div>
    </div>
    <div class="internship-button">
        <div class="internship-form-group">
            <label class="internship-col control-label" for=""></label>
            <div class="internship-col">
                <form action="internshipsfoundserv">
                    <input id="" name="SEARCH_INTERNSHIPS" placeholder="Search for an internship" type="text" class="internship-input internship-custom-input">
                    <div class="internship-container">
                        <img src="images/Search logo.svg" class="internship-search">
                        <a href="#" class="internship-search">
                            <button class="internship-search-button ">Search</button>
                        </a>
                    </div>
                </form>
            </div>
        </div>
    </div>

    <div class="internship-white-boxes">
        <a href="IT.html" class="internship-white-box-link">
            <div class="internship-white-box">
                <img src="images/IT sign.svg"  class="internship-box-image1">
                <p class="internship-box-text">IT</p>
            </div>
        </a>
        <a href="design.html" class="internship-white-box-link">
            <div class="internship-white-box">
                <img src="images/Design sign.svg"  class="internship-box-image2">
                <p class="internship-box-text">Design</p>
            </div>
        </a>
        <a href="marketing.html" class="internship-white-box-link">
            <div class="internship-white-box">
                <img src="images/Marketing sign.svg"  class="internship-box-image3">
                <p class="internship-box-text">Marketing</p>
            </div>
        </a>
        <a href="management.html" class="internship-white-box-link">
            <div class="internship-white-box">
                <img src="images/Management sign.svg"  class="internship-box-image4">
                <p class="internship-box-text">Management</p>
            </div>
        </a>
        <a href="telecommunications.html" class="internship-white-box-link">
            <div class="internship-white-box">
                <img src="images/Telecommunications sign.svg"  class="internship-box-image5">
                <p class="internship-box-text1">Telecommunications</p>
            </div>
        </a>
    </div>
    <div class="internship-white-boxes2">
        <a href="logistics.html" class="internship-white-box-link">
            <div class="internship-white-box">
                <img src="images/Logistics sign.svg" class="internship-box-image6">
                <p class="internship-box-text">Logistics</p>
            </div>
        </a>
        <a href="sales.html" class="internship-white-box-link">
            <div class="internship-white-box">
                <img src="images/Sales sign.svg" class="internship-box-image7">
                <p class="internship-box-text">Sales</p>
            </div>
        </a>
        <a href="accounting.html" class="internship-white-box-link">
            <div class="internship-white-box">
                <img src="images/Accounting sign.svg" class="internship-box-image8">
                <p class="internship-box-text">Accounting</p>
            </div>
        </a>
        <a href="banks.html" class="internship-white-box-link">
            <div class="internship-white-box">
                <img src="images/Banks sign.svg" class="internship-box-image9">
                <p class="internship-box-text">Banks</p>
            </div>
        </a>
        <a href="medicine.html" class="internship-white-box-link">
            <div class="internship-white-box">
                <img src="images/Medicine sign.svg" class="internship-box-image10">
                <p class="internship-box-text">Medicine</p>
            </div>
        </a>
    </div>
    <!--    <script src="footer.js"></script>-->
    <jsp:include page="common/footer.jspf" />
</body>

</html>
