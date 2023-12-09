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
        <link rel="stylesheet" href="${pageContext.request.contextPath}/stagii/stylemain.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/stagii/style5.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;700&family=Onest:wght@400;700&display=swap"
              rel="stylesheet">
    </head>

    <body>
        <jsp:include page="common/applicant_header.jspf" />
        <div class="internships-found-companies">

            <div class="internships-info-box-details it-companies2">
                <img src="../uploads/${company.imagePath}" width="100px" alt="noImg"/>
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
                        <img src="../images/Paid.svg" class="internship-details-paid" width="50" height="50">
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
                        <img src="../images/Schedule.svg" class="internship-details-schedule" width="50" height="50">
                        <div class="internship-details-box4"><u>Schedule:</u><br>Part-time</div>
                    </div>
                    <div class="internship-details-container5">
                        <img src="../images/Location.svg" class="internship-details-location" width="50" height="50">
                        <div class="internship-details-box5"><u>Location:</u><br><%= internshipProgram.getLocation()%></div>
                    </div>
                    <div class="internship-details-container6">
                        <img src="../images/Phone.svg" class="internship-details-phone" width="50" height="50">
                        <div class="internship-details-box6"><u>Phone number:</u><br>${company.phoneNumber}</div>
                    </div>
                    <div class="internship-details-container7">
                        <img src="../images/Mail.svg" class="internship-details-mail" width="50" height="50">
                        <div class="internship-details-box7"><u>Email:</u><br>${company.email}</div>
                    </div>
                    <button onclick="showPopup()" class="send-cv">Send CV</button>
                </div>
            </div>
        </div>
    </head>
    <style>
        .popup {
            width:550px;
            display: none;
            position: fixed;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            padding: 20px;
            background: var( --BG, #FFFCF2);
            border-radius: 5px;
            border: 1px solid var(--TEXT2, #AEB4C1);
            z-index: 1000;
            max-height: 1000px;
            height: auto;
            overflow-y: auto;
        }

        .overlay {
            display: none;
            position: fixed;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            background: rgba(0, 0, 0, 0.5);
            z-index: 999;
        }
        .first-name{
            font-size: 18px;
            font-family: "Montserrat";
            font-weight: 400;
            color: var(--TEXT);

        }   .internship-details-description-internship {
            max-height: 800px;
            width: 650px;
            height: auto;
            overflow-y: auto;
        }
        .send-cv{
            width: 322px;
            height: 60px;
            border-radius: 5px;
            display: block;
            background: var(--TEXT, #0c0c0e);
            color: var(--COMPONENTS, #FFFFFF);
            font-size: 20px;
            margin-top: 40px;
        }
        .first-name-input{
            margin-left:60px;
            width: 400px;
            color: var(--TEXT2, #AEB4C1);
            font-family: Montserrat;
            font-size: 16px;
            padding-left: 16px;
            padding-top: 22px;
            padding-bottom: 22px;
            border-radius: 5px;
            border: 1px solid var(--TEXT2, #AEB4C1);
            background: var(--COMPONENTS, #FFF);
            margin-top: 30px;
        }
        .last-name-input{
            margin-left:60px;
            width: 400px;
            color: var(--TEXT2, #AEB4C1);
            font-family: Montserrat;
            font-size: 16px;
            padding-left: 16px;
            padding-top: 22px;
            padding-bottom: 22px;
            border-radius: 5px;
            border: 1px solid var(--TEXT2, #AEB4C1);
            background: var(--COMPONENTS, #FFF);
            margin-top: 30px;
        }
        .email-cv-input{
            margin-left:60px;
            width: 400px;
            color: var(--TEXT2, #AEB4C1);
            font-family: Montserrat;
            font-size: 16px;
            padding-left: 16px;
            padding-top: 22px;
            padding-bottom: 22px;
            border-radius: 5px;
            border: 1px solid var(--TEXT2, #AEB4C1);
            background: var(--COMPONENTS, #FFF);
            margin-top: 30px;
        }
        .phone-number-cv-input{
            margin-left:60px;
            width: 400px;
            color: var(--TEXT2, #AEB4C1);
            font-family: Montserrat;
            font-size: 16px;
            padding-left: 16px;
            padding-top: 22px;
            padding-bottom: 22px;
            border-radius: 5px;
            border: 1px solid var(--TEXT2, #AEB4C1);
            background: var(--COMPONENTS, #FFF);
            margin-top: 30px;
        }
        .cv-input{
            display:none;
        }
        label{
            display: block;
            width: 70px;
            margin-top:30px;
            margin-left:130px;
            background-color: var(--TEXT);
            border-radius: 5px;
            padding-left: 40px;
            padding-right: 40px;
            padding-top: 12px;
            padding-bottom: 12px;  
            color: var(--COMPONENTS);
            text-decoration: none;
            font-family: Montserrat;
        }
        .submit-button{
            background-color: var(--TEXT);
            flex-shrink: 0;
            border-radius: 5px;
            padding-left: 40px;
            padding-right: 40px;
            padding-top: 12px;
            padding-bottom: 12px;  
            color: var(--COMPONENTS);
            text-decoration: none;
            font-family: Montserrat;
        }
        .cancel-button{
            background: none;
            border: none;
            cursor: pointer;
            margin-left: 50px;
            font-size: 15px;
            color: var(--TEXT);
            text-decoration: none;
            font-family: Montserrat;
        }
        .popup-buttons{
            margin-top: 50px;
            display: flex;
            justify-content: center;
        }
        .cv-attach {
            display: flex;
            align-items: center;
        }

        .add-cv {
            margin-right: 10px; /* Adjust the margin as needed */
        }

        .file-input-container {
            display: flex;
            align-items: center;
        }

        .selected-file-name {
            margin-top: 25px;
            margin-left: 10px; /* Adjust the margin as needed */
        }

        .input-file-cv {
            opacity: 0;
            width: 0.1px;
            height: 0.1px;
            position: absolute;
        }
        .input{
            color:var(--TEXT);
        }
        h2{
            text-align:center;
        }
    </style>

    <div id="popup" class="popup">
        <h2>Enter Details</h2>
        <form class="form-horizontal">
            <div class="forms">
                <div class="first-name-form">
                    <div class="first-name">
                        <input id="textinput" name="textinput" type="text" placeholder="Enter your first name" class="first-name-input input">

                    </div>
                </div>

                <div class="last-name-form">

                    <div class="last-name">
                        <input id="textinput" name="textinput" type="text" placeholder="Enter your last name" class="last-name-input input">

                    </div>
                </div>

                <div class="email-form">
                    <div class="email-form-cv">
                        <input id="textinput" name="textinput" type="text" placeholder="Enter your email" class="email-cv-input input">

                    </div>
                </div>

                <div class="phone-number-form">
                    <div class="phone-number-form-cv">
                        <input id="textinput" name="textinput" type="text" placeholder="Enter your phone number" class="phone-number-cv-input input">

                    </div>
                </div>
            </div>
        </form>
        <form class="form-horizontal">

            <div class="cv-attach">
                <label class="add-cv" for="filebutton">Add CV</label>
                <div class="file-input-container">
                    <input id="filebutton" name="filebutton" class="input-file-cv" type="file" onchange="displayFileName()" style="display: none;">
                    <span class="selected-file-name"></span>
                </div>
            </div>



        </form>
        <div class="popup-buttons">
            <button type="submit" class="submit-button">Submit</button>
            <button type="button" class="cancel-button"onclick="hidePopup()">Cancel</button>
        </div>
    </div>
    <div id="overlay" class="overlay" onclick="hidePopup()"></div>

    <div id="overlay" class="overlay" onclick="hidePopup()"></div>

    <script>
        function displayFileName() {
            var input = document.getElementById('filebutton');
            var fileNameSpan = document.querySelector('.selected-file-name');

            if (input.files.length > 0) {
                fileNameSpan.textContent = input.files[0].name;
                fileNameSpan.style.display = 'inline'; // Display the file name
            } else {
                fileNameSpan.textContent = ''; // Clear file name
                fileNameSpan.style.display = 'none'; // Hide the file name
            }
        }
        function showPopup() {
            document.getElementById('popup').style.display = 'block';
            document.getElementById('overlay').style.display = 'block';
        }

        function hidePopup() {
            document.getElementById('popup').style.display = 'none';
            document.getElementById('overlay').style.display = 'none';
        }
    </script>
    <div class="internship-details-mail1">
        <div class="internship-details-company-mail">
            <div class="internship-details-email">Email:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ${company.email}</div>
            <div class="internship-details-invisible"></div>
        </div>
    </div>


    <div class="internship-details-other">Other internships published by this company:</div>
    <c:forEach items="${internshipCompanyMapByCompany}" var="internshipCompany">

        <a href="cmsinternshipdetailsserv?ID_INTERNSHIP=${internshipCompany.key.id}" class="internships-found-company it-companies1">
            <img src="../uploads/${internshipCompany.value.imagePath}" width="100px" alt="noImg"/>
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

        <a href="cmsinternshipdetailsserv?ID_INTERNSHIP=${internshipCompany.key.id}" class="internships-found-company it-companies1">
            <img src="../uploads/${internshipCompany.value.imagePath}" width="100px" alt="noImg"/>
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

</body>
<footer>
    <div class="footer">
        <div class="logo1">
            ST<img src="../images/logo.svg" class="logo3" />GII.MD
        </div>
        <p class="copyright">This website was developed by Team04 © 2023</p>
    </div>
</footer>
</html>