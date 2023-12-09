
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Sign in</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/stagii/style5.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;700&family=Onest:wght@400;700&display=swap"
              rel="stylesheet">
    </head>
    <body>
        <jsp:include page="common/guest_header.jspf" flush="true" />
        <div style="color: red;">
            ${error}

        </div>
        <div>
            <div class="text-signin">Sign in</div>
            <div class="element-signin">
                <img class="signin-vector" src="images/signin-vector.svg"/>
            </div>
            <form action="loginserv" method="POST" class="login-form">
                <div class="enter-email">
                    <div class="email-input">
                        <input id="" name="USERNAME" type="text" placeholder="Enter your email or username" class="input-email input">
                    </div>
                </div>
                <div class="enter-password">
                    <div class="password-input">
                        <input id="passwordInput" name="PASSWORD" type="password" placeholder="Enter your password" class="input-password input">
                        <button class="password-toggle-button" onclick="togglePasswordVisibility(); return false;">
                            <img id="eyeIcon" src="images/closed-eye.svg" alt="">
                        </button>
                    </div>
                </div>
                <div class="forgot"><a href="#" class="forgot-password">Forgot your password?</a> </div>
                <button class="signinaccount"><a class="sign">Sign in</a></button>
                <div class="new-account-link"><a href="newaccountserv" class="new-account" >New account?</a></div>
                <div></div>
            </form>
        </div>

        <script>
            function togglePasswordVisibility() {
                var passwordInput = document.getElementById("passwordInput");
                var eyeIcon = document.getElementById("eyeIcon");

                if (passwordInput.type === "password") {
                    passwordInput.type = "text";
                    eyeIcon.src = "images/open-eye.svg";
                } else {
                    passwordInput.type = "password";
                    eyeIcon.src = "images/closed-eye.svg";
                }
            }
        </script>
    </body>
    <footer>
    <div class="footer">
        <div class="logo1">
            ST<img src="images/logo.svg" class="logo3" />GII.MD
        </div>
        <p class="copyright">This website was developed by Team04 © 2023</p>
    </div>
</footer>
</html>