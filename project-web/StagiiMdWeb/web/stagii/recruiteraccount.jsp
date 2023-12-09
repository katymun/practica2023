<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>New recruiter</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/stagii/style.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;700&family=Onest:wght@400;700&display=swap"
              rel="stylesheet">
    </head>
    <body>
        <div class="wrapper">
            <nav>
                <a href="" class="logo-button">
                    <div class="logo">
                        ST <img class="vector" src="images/logo.svg" />GII.MD
                    </div>
                </a>
                <ul>
                    <li>
                        <a class="" href="#">Home</a>
                    </li>
                    <li>
                        <a href="">Internships</a>
                    </li>
                    <li>
                        <a href="">Companies</a>
                    </li>
                    <li>
                        <a href="" class="signin">Sign in</a>
                    </li>
                    <li>
                        <button class="signup">
                            <a href="" >Sign up</a>
                        </button>
                    </li>
                    <li>
                        <button class="post">
                            <a href="#" class="post-internship">Post internship</a>
                        </button>
                    </li>
                </ul>
            </nav>
        </div>
        <div class="create-recruiter-text">Create your recruiter account</div>
        <div class="enter-recruiter-firstname">
            <div class="recruiter-firstname-input">
                <input id="" name="" type="text" placeholder="Enter your first name" class="input-recruiter-firstname input">
            </div>
        </div>
        <div class="create-recruiter-lastname">
            <div class="recruiter-lastname-input">
                <input id="" name="" type="password" placeholder="Enter your last name" class="input-recruiter-lastname input">
            </div>
        </div>
        <div class="create-recruiter-email">
            <div class="recruiter-email-input">
                <input id="" name="" type="password" placeholder="Enter your email" class="input-recruiter-email input">
            </div>
        </div>
        <div class="register-company">
            <button class="register-company-button">
                <a href="#" class="register-company1">Register company</a>
            </button>
        </div>

        <jsp:include page="common/footer.jspf" />
    </body>

</html>
