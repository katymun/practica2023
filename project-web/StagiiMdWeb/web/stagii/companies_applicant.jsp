<%@page import="com.iucosoft.stagiimdweb.entities.Company"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Companies</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/stagii/stylemain.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/stagii/style5.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;700&family=Onest:wght@400;700&display=swap"
              rel="stylesheet">
    </head>

    <body>

        <jsp:include page="common/applicant_header.jspf" />
        <!-- end of desktop navigation menu-->
        <div class="companies-best">
            <img src="../images/accent.svg" alt="" class="companies-accent">
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
                    <img src="../images/Search logo.svg" class="companies-search">
                    <a href="#" class="companies-search">
                        <button class="companies-search-button">Search</button>
                    </a>
                </div>
            </div>
        </div>
    </div>

    <div class="companies-white-boxes"></div>


    <%
        List<Company> companyList = (List<Company>) request.getAttribute("companyList");
        if (companyList != null) {
            int element = 0;
            float columns = 5f;  // numarul de coloane pe un rand
            int rows = (int) Math.ceil(companyList.size() / columns);
            for (int i = 0; i < rows; i++) {
    %>

    <div class="companies-white-boxes2">

        <%
            for (int j = 0; j < (int) columns && element < companyList.size() - 1; j++) {
                element = i * (int) columns + j;
                Company company = companyList.get(element);
                if (company != null) {
//                    out.println("ImagePath="+company.getImagePath());
        %>

        <a href="cmscompanydetailsserv?company-id=<%=company.getId() %>" class="companies-white-box-link">
            <div class="companies-white-box">
                    <img src="../uploads/<%=company.getImagePath() %>" width="100px" alt="No Image"/>
              
            </div>
        </a>

        <%                } // de la if la company
            } // de la j

        %>

    </div>

    <%            } //de la i
        } //de la if

    %>

<footer>
    <div class="footer">
        <div class="logo1">
            ST<img src="../images/logo.svg" class="logo3" />GII.MD
        </div>
        <p class="copyright">This website was developed by Team04 © 2023</p>
    </div>
</footer>
</body>

</html>