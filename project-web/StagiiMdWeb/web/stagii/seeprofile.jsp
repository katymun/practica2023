<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Profile Info</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/stagii/style4.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;700&family=Onest:wght@400;700&display=swap"
              rel="stylesheet">


    </head>

    <body>
        <jsp:include page="common/applicant_header.jspf" flush="true" />
        <div class="personal-information-text">Personal information:
            <div class="button-container-general">
                
                <button class="edit"><a href="cmsseeprofileeditserv"><img src="../images/edit.svg" alt="Edit"></a></button>
            </div>
        </div>
        <div class="personal-information-firstname">First name:  ${sessionApplicant.aName}</div>
        <div class="personal-information-lastname">Last name:  ${sessionApplicant.aSurname}</div>
        <div class="personal-information-age">Age:  ${sessionApplicant.age}</div>
        <div class="personal-information-status">Status:  ${sessionApplicant.status}</div>
        <div class="personal-information-phone">Phone number:  ${sessionApplicant.phoneNumber}</div>
        <div class="personal-information-email">Email:  ${sessionApplicant.email}</div>
        <div class="personal-information-cv">CV:  ${sessionApplicant.cvFile}</div>
        <div class="personal-information-cv">CV file:  <a href="${pageContext.request.contextPath}/uploads/${sessionApplicant.cvFile}">cvFile</a></div>
        
       <footer>
    <div class="footer">
        <div class="logo1">
            <a href="home.html" class="logo-button">
                <div class="logo" >
                    ST <img class="vector" src="../images/logo.svg" />GII.MD
                </div>
            </a>
        </div>
        <p class="copyright">This website was developed by Team04 © 2023</p>
    </div>
</footer>
    </body>

</html>
