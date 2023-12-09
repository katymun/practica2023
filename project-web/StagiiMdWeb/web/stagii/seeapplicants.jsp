<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>All applicants</title>
    <link rel="stylesheet" href="style2.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;700&family=Onest:wght@400;700&display=swap"
        rel="stylesheet">
</head>
    <style>
.footer {
    position: relative;
    bottom: 0;
    background-color: var(--TEXT); 
    color: white;
    height: 200px;
    width: 100%;
}
.logo-button{
    color:white;
}
.logo1 {
    color: var(--COMPONENTS);
    font-family: Stolzl;
    font-size: 30px;
    padding-left: 122px;
    padding-top: 50px;
}

.logo3{
    transform: translate(2%,5%);
    color:white;
}
.copyright {
    font-size: 12px;
    font-family: "Stolzl";
    color: var(--COMPONENTS);
    padding-left: 122px;
    padding-top: 30px;
}
</style>
<body>
        <div class="wrapper">
            <nav>
                <a href="" class="logo-button">
                    <div class="logo">
                        ST <img class="vector" src="../images/logo.svg" />GII.MD
                    </div>
                </a>
                <ul>
                    <li>
                        <button class="applicants">
                            <a href="#" class="see-applicants">See applicants</a>
                        </button>
                    </li>
                    <li>
                        <a href="" class="company-internships">Internships</a>
                    </li>
                                    <a href="" class="company-logo">
                    <div class="company-logo">
                        <img class="vector-company" src="../images/companylogo.svg" id="company-pic-right-corner" style="border-radius: 50px;"/>
                    </div>
                </a>
                </ul>
            </nav>
        </div>
    
    <div class="see-applicants-text">See applicants:</div>
    <div class="homepage-companies1">
        <a href="/stagii/companies_details.html" class="homepage-company">
            <!--<div class="content">Company -->
            </div>
        </a>
    </div>
    <div class="applicant-text">Applicants:</div>
<div class="applicant-information-container">
    <div class="applicant-first-name">First name:</div>
    <div class="applicant-last-name">Last name:</div>
    <div class="applicant-email">Email:</div>
    <div class="applicant-phonenumber">Phone number:</div>
    <div class="applicant-cv">CV attachment:</div>
</div>
</body>
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
</html>
