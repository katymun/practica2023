<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Internships</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/stagii/stylemain.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;700&family=Onest:wght@400;700&display=swap"
              rel="stylesheet">
    </head>

    <body>
        <!--<script src="header_internships.js"></script>-->
        <jsp:include page="common/guest_header.jspf" />
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
        <a href="internshipsbydomainserv?domain=IT" class="internship-white-box-link" onmouseover="changeITImage()" onmouseout="revertITImage()">
            <div class="internship-white-box">
                <img id="IT" src="images/IT sign.svg"  class="internship-box-image1">
                <p class="internship-box-text">IT</p>
            </div>
        </a>
        <a href="internshipsbydomainserv?domain=Design" class="internship-white-box-link"onmouseover="changeDesignImage()" onmouseout="revertDesignImage()">
            <div class="internship-white-box">
                <img id="Design" src="images/Design sign.svg"  class="internship-box-image2">
                <p class="internship-box-text">Design</p>
            </div>
        </a>
        <a href="internshipsbydomainserv?domain=Marketing" class="internship-white-box-link"onmouseover="changeMarketingImage()" onmouseout="revertMarketingImage()">
            <div class="internship-white-box">
                <img id="Marketing" src="images/Marketing sign.svg"  class="internship-box-image3">
                <p class="internship-box-text">Marketing</p>
            </div>
        </a>
        <a href="internshipsbydomainserv?domain=Management" class="internship-white-box-link"onmouseover="changeManagementImage()" onmouseout="revertManagementImage()">
            <div class="internship-white-box">
                <img id="Management" src="images/Management sign.svg"  class="internship-box-image4">
                <p class="internship-box-text">Management</p>
            </div>
        </a>
<a href="internshipsbydomainserv?domain=Telecommunications" class="internship-white-box-link" onmouseover="changeTelecommunicationsImage()" onmouseout="revertTelecommunicationsImage()">
    <div class="internship-white-box">
        <img id="Telecommunications" src="images/Telecommunications sign.svg" class="internship-box-image5">
        <p class="internship-box-text1">Telecommunications</p>
    </div>
</a>
    </div>
    <div class="internship-white-boxes2">
        <a href="internshipsbydomainserv?domain=Logistics" class="internship-white-box-link"onmouseover="changeLogisticsImage()" onmouseout="revertLogisticsImage()">
            <div class="internship-white-box">
                <img id="Logistics" src="images/Logistics sign.svg" class="internship-box-image6">
                <p class="internship-box-text">Logistics</p>
            </div>
        </a>
        <a href="internshipsbydomainserv?domain=Sales" class="internship-white-box-link"onmouseover="changeSalesImage()" onmouseout="revertSalesImage()">
            <div class="internship-white-box">
                <img id="Sales" src="images/Sales sign.svg" class="internship-box-image7">
                <p class="internship-box-text">Sales</p>
            </div>
        </a>
        <a href="internshipsbydomainserv?domain=Accounting" class="internship-white-box-link"onmouseover="changeAccountingImage()" onmouseout="revertAccountingImage()">
            <div class="internship-white-box">
                <img id="Accounting" src="images/Accounting sign.svg" class="internship-box-image8">
                <p class="internship-box-text">Accounting</p>
            </div>
        </a>
<a href="internshipsbydomainserv?domain=Banking" class="internship-white-box-link" onmouseover="changeBanksImage()" onmouseout="revertBanksImage()">
    <div class="internship-white-box">
        <img id="Banks" src="images/Banks sign.svg" class="internship-box-image9">
        <p class="internship-box-text">Banking</p>
    </div>
</a>
        <a href="internshipsbydomainserv?domain=Medicine" class="internship-white-box-link"onmouseover="changeMedicineImage()" onmouseout="revertMedicineImage()">
    <div class="internship-white-box">
        <img id="Medicine" src="images/Medicine sign.svg" class="internship-box-image10">
        <p class="internship-box-text">Medicine</p>
    </div>
        </a>
    </div>
       <script>
       
    function changeITImage() {
        document.getElementById('IT').src = "images/IT_white.svg";
    }

    function revertITImage() {
        document.getElementById('IT').src = "images/IT sign.svg";
    }
        function changeDesignImage() {
            document.getElementById('Design').src = "images/Design_white.svg";
        }

        function revertDesignImage() {
            document.getElementById('Design').src = "images/Design sign.svg";
        }

        function changeMarketingImage() {
            document.getElementById('Marketing').src = "images/Marketing_white.svg";
        }

        function revertMarketingImage() {
            document.getElementById('Marketing').src = "images/Marketing sign.svg";
        }

        function changeManagementImage() {
            document.getElementById('Management').src = "images/Management_white.svg";
        }

        function revertManagementImage() {
            document.getElementById('Management').src = "images/Management sign.svg";
        }
        function changeTelecommunicationsImage() {
            document.getElementById('Telecommunications').src = "images/Telecommunications_white.svg";
        }

        function revertTelecommunicationsImage() {
            document.getElementById('Telecommunications').src = "images/Telecommunications sign.svg";
        }
        function changeLogisticsImage() {
            document.getElementById('Logistics').src = "images/Logistics_white.svg";
        }

        function revertLogisticsImage() {
            document.getElementById('Logistics').src = "images/Logistics sign.svg";
        }
       
        function changeSalesImage() {
            document.getElementById('Sales').src = "images/Sales_white.svg";
        }

        function revertSalesImage() {
            document.getElementById('Sales').src = "images/Sales sign.svg";
        }
                function changeAccountingImage() {
            document.getElementById('Accounting').src = "images/Accounting_white.svg";
        }

        function revertAccountingImage() {
            document.getElementById('Accounting').src = "images/Accounting sign.svg";
        }
         function changeBanksImage() {
            document.getElementById('Banks').src = "images/Banks_white.svg";
        }

        function revertBanksImage() {
            document.getElementById('Banks').src = "images/Banks sign.svg";
        }
                 function changeMedicineImage() {
            document.getElementById('Medicine').src = "images/Medicine_white.svg";
        }

        function revertMedicineImage() {
            document.getElementById('Medicine').src = "images/Medicine sign.svg";
        }
    </script>
<footer>
    <div class="footer">
        <div class="logo1">
            ST<img src="images/logo.svg" class="logo3" />GII.MD
        </div>
        <p class="copyright">This website was developed by Team04 © 2023</p>
    </div>
</footer>
</body>

</html>
