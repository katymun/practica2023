<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Company Home</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/stagii/style2.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;700&family=Onest:wght@400;700&display=swap"
              rel="stylesheet">
    </head>
    <style>
        
        .footer{
              position: absolute;
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
.add-internship-button {
    display: flex;
    justify-content: center;
    align-items: center; /* Align items vertically */
    background-color: var(--TEXT);
    border-radius: 5px;
    font-size:16px;
    padding: 12px 40px; /* Shortened padding property */
    margin: 0 auto; /* Center horizontally */
    width: fit-content; /* Adjusts width to fit content */
    font-family: Montserrat;
} 
.add-internship{
    color: var(--COMPONENTS);
    text-decoration: none;
    font-family: Montserrat;

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
                            <a href="cmsseeapplicantsserv" class="see-applicants">See applicants</a>
                        </button>
                    </li>
                    <li>
                        <a href="cmslogoutserv" class="company-internships">Log out</a>
                    </li>
                                    
                    <div class="company-logo">
                        <a href="cmscompanyprofileserv" class="company-logo"><img class="vector-company" src="../images/companylogo.svg" id="company-pic-right-corner" style="border-radius: 50px;"/></a>
                    </div>
                </ul>
            </nav>
        </div>
        <div class="published-internships-text">Published internships:</div>
        <button class="add-internship-button">
            <a href="cmsaddinternshipserv" class="add-an-internship">Add an internship</a>
        </button>
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
</footer>
</html>