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
    
    <jsp:include page="common/header_companies.jspf" />
            <!-- end of desktop navigation menu-->
            <div class="companies-best">
                <img src="images/accent.svg" alt="" class="companies-accent">
                <div class="companies-section-title">Find <b> internships</b> by company</div>
            </div>
        </div>
        <div class="companies-button">
            <div class="companies-form-group">
                <label class="companies-col companies-control-label" for=""></label>
                <div class="companies-col">
                    <input id="" name="" type="text" placeholder="Search for a company"
                        class="companies-form-control-input companies-custom-input">
                    <div class="companies-container">
                        <img src="images/Search logo.svg" class="companies-search">
                        <a href="#" class="companies-search">
                            <button class="companies-search-button">Search</button>
                        </a>
                    </div>
                </div>
            </div>
        </div>

    <div class="companies-white-boxes">
        <a href="companies_details.html" class="companies-white-box-link">
        <div class="companies-white-box">
        </div>
    </a>
    <a href="" class="companies-white-box-link">
        <div class="companies-white-box">
        </div>
    </a>
    <a href="" class="companies-white-box-link">
        <div class="companies-white-box">
        </div>
    </a>
    <a href="" class="companies-white-box-link">
        <div class="companies-white-box">
        </div>
    </a>
    <a href="" class="companies-white-box-link">
        <div class="companies-white-box">
        </div>
    </a>
    </div>
    <div class="companies-white-boxes2">
        <a href="" class="companies-white-box-link">
            <div class="companies-white-box">
            </div>
        </a>
        <a href="" class="companies-white-box-link">
            <div class="companies-white-box">
            </div>
        </a>
        <a href="" class="companies-white-box-link">
            <div class="companies-white-box">
            </div>
        </a>
        <a href="" class="companies-white-box-link">
            <div class="companies-white-box">
            </div>
        </a>
        <a href="" class="companies-white-box-link">
            <div class="companies-white-box">
            </div>
        </a>
    </div>
<jsp:include page="common/footer.jspf" />
</body>

</html>