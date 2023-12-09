<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>New account</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/stagii/style5.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;700&family=Onest:wght@400;700&display=swap"
              rel="stylesheet">
    </head>
    
    <body>
        <jsp:include page="common/guest_header.jspf" flush="true" />
        <form action="newaccount2serv" method="POST" onsubmit="return validatePasswords()" class="newaccount-form">
            <div class="text-newaccount">New account</div>
            <div class="element-newaccount">
                <img class="new-account-vector" src="images/newaccount-vector.svg">
            </div>
            <div class="new-account-enter-email">
                <div class="new-account-email-input">
                    <input id="textinput" name="USERNAME" type="text" placeholder="Enter your username" class="new-account-input-email input" >
                </div>
            </div>
            <div class="new-account-enter-password">
                <div class="new-account-password-input">
                    <input type="password" name="PASSWORD" placeholder="Enter your password" class="new-account-input-password input" id="passwordInput">
                    <button class="password-toggle-button" onclick="togglePasswordVisibility('passwordInput', 'eyeIcon1'); return false;">
                        <img id="eyeIcon1" src="images/closed-eye.svg" alt="">
                    </button>
                </div>
            </div>
            <div class="confirm-password">
                <div class="confirm-password-input">
                    <input type="password" name="CONFIRM_PASSWORD" placeholder="Confirm your password" class="confirm-input-password input" id="confirmPasswordInput">
                    <button class="password-toggle-button" onclick="togglePasswordVisibility('confirmPasswordInput', 'eyeIcon2'); return false;">
                        <img id="eyeIcon2" src="images/closed-eye.svg" alt="">
                    </button>
                </div>
            </div>
            <div class="choice-form-group">
                <div class="col-md-4">
                    <label class="radio-inline" for="radios-0">
                        <input type="radio" name="ROLE" id="radios-0" value="APPLICANT">
                        Looking for internships
                    </label>
                    <label class="radio-inline" for="radios-1">
                        <input type="radio" name="ROLE" id="radios-1" value="RECRUITER">
                        Looking for interns
                    </label>
                </div>
            </div>
            <button class="newaccount-signup" onclick="return validatePasswords(event)">Sign up</button>


        </form>
        <div class="have-account">Do you already have an account?<a href="showloginserv" class="new-account"> Login</a></div>
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

            function validatePasswordFormat(password) {
                // Check if password length is between 8 and 16 characters
                if (password.length < 8 || password.length > 16) {
                    return false;
                }

                // Check if password contains at least one letter and one number
                var hasLetter = /[a-zA-Z]/.test(password);
                var hasNumber = /\d/.test(password);

                return hasLetter && hasNumber;
            }

            function validatePasswords(event) {
                if (event.target.classList.contains('newaccount-signup')) {
                    var password = document.getElementById("passwordInput").value;
                    var confirmPassword = document.getElementById("confirmPasswordInput").value;

                    if (!validatePasswordFormat(password)) {
                        alert("Password must be between 8 and 16 characters and include both letters and numbers.");
                        return false; // Prevent form submission
                    }

                    if (password !== confirmPassword) {
                        alert("Passwords do not match");
                        return false; // Prevent form submission
                    }
                }
                return true; // Allow form submission for other buttons
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