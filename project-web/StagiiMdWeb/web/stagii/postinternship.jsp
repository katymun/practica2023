<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/stagii/style2.css">
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
        </div>
    
        <div class="text-postinternship">Post an internship</div>
        <div class="element-postinternship">
            <img class="postinternship-vector" src="images/postinternship-vector.svg">
        </div>
        <div class="postinternship-enter-email">
            <div class="postinternship-email-input">
                <input type="text" placeholder="Enter your email or username" class="postinternship-input-email input">
            </div>
        </div>
        <div class="postinternship-enter-password">
            <div class="postinternship-password-input">
                <input type="password" placeholder="Enter your password" class="postinternship-input-password input" id="passwordInput">
                <button class="password-toggle-button" onclick="togglePasswordVisibility('passwordInput', 'eyeIcon1')">
                    <img id="eyeIcon1" src="images/closed-eye.svg" alt="">
                </button>
            </div>
        </div>
        <div class="postinternship-confirm-password">
            <div class="postinternship-confirm-password-input">
                <input type="password" placeholder="Confirm your password" class="postinternship-confirm-input-password input" id="confirmPasswordInput">
                <button class="password-toggle-button" onclick="togglePasswordVisibility('confirmPasswordInput', 'eyeIcon2')">
                    <img id="eyeIcon2" src="images/closed-eye.svg" alt="">
                </button>
            </div>
        </div>
        <div class="postinternship-name-company">
            <div class="postinternship-name-company-input">
                <input type="text" placeholder="Name of the company" class="postinternship-input-name-company input">
            </div>
        </div>
        <button class="postinternship-register"><a href="#" class="sign">Register</a></button>
        <script>
            function togglePasswordVisibility(passwordInputId, eyeIconId) {
                var passwordInput = document.getElementById(passwordInputId);
                var eyeIcon = document.getElementById(eyeIconId);
        
                if (passwordInput.type === "password") {
                    passwordInput.type = "text";
                    eyeIcon.src = "images/open-eye.svg"; // Change to your open eye image path
                } else {
                    passwordInput.type = "password";
                    eyeIcon.src = "images/closed-eye.svg"; // Change to your closed eye image path
                }
            }
        </script>
        <jsp:include page="common/footer.jspf" />
    </body>
    
    </html>