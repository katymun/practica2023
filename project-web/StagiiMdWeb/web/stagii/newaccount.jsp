<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>New Account</title>
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

        <div class="text-newaccount">New account</div>
        <div class="element-newaccount">
            <img class="new-account-vector" src="images/newaccount-vector.svg">
        </div>
        <div class="new-account-enter-email">
            <div class="new-account-email-input">
                <input id="textinput" name="textinput" type="text" placeholder="Enter your email or username" class="new-account-input-email input" >
            </div>
        </div>
        <div class="new-account-enter-password">
            <div class="new-account-password-input">
                <input type="password" placeholder="Enter your password" class="new-account-input-password input" id="passwordInput">
                <button class="password-toggle-button" onclick="togglePasswordVisibility('passwordInput', 'eyeIcon1')">
                    <img id="eyeIcon1" src="images/closed-eye.svg" alt="">
                </button>
            </div>
        </div>
        <div class="confirm-password">
            <div class="confirm-password-input">
                <input type="password" placeholder="Confirm your password" class="confirm-input-password input" id="confirmPasswordInput">
                <button class="password-toggle-button" onclick="togglePasswordVisibility('confirmPasswordInput', 'eyeIcon2')">
                    <img id="eyeIcon2" src="images/closed-eye.svg" alt="">
                </button>
            </div>
        </div>
        <div class="choice-form-group">
            <div class="col-md-4">
                <label class="radio-inline" for="radios-0">
                    <input type="radio" name="radios" id="radios-0" value="1">
                    Looking for internships
                </label>
                <label class="radio-inline" for="radios-1">
                    <input type="radio" name="radios" id="radios-1" value="2">
                    Looking for interns
                </label>
            </div>
        </div>


        <button class="newaccount-signup"><a href="#" class="sign">Sign up</a></button>
        <div class="have-account">Do you already have an account?<a href="#" class="new-account"> Login</a></div>
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
    </body>

</html>