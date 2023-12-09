<%@page import="com.iucosoft.stagiimdweb.entities.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>New account</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/stagii/style.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;700&family=Onest:wght@400;700&display=swap"
              rel="stylesheet">
    </head>
    <body>
        <jsp:include page="common/guest_header.jspf" flush="true" />
        <div class="text-createaccount">Create your account</div>
        <form action="registerapplicantserv" method="POST" enctype="multipart/form-data" class="newaccount-applicant-form">
            <%
                User newUser = (User) request.getAttribute("newUser");
                System.out.println("newUser din jsp: " + newUser);
                
            %>
            <input type="hidden" name="USERNAME" value="${newUser.username}">
            <input type="hidden" name="PASSWORD" value="${newUser.password}">
            <input type="hidden" name="ROLE" value="${newUser.role}">
            
            <div class="createaccount-enter-firstname">
                <div class="createaccount-firstname-input">
                    <input type="text" name="FIRST_NAME" placeholder="Enter your first name" class="createaccount-input-firstname input">
                </div>
            </div>

            <div class="createaccount-enter-lastname">
                <div class="createaccount-enter-firstname-input">
                    <input type="text" name="LAST_NAME" placeholder="Enter your last name" class="createaccount-input-lastname input">
                </div>
            </div>
            <div class="createaccount-enter-age">
                <div class="createaccount-enter-age-input">
                    <input type="text" name="AGE" placeholder="Enter your age" class="createaccount-input-age input">
                </div>
            </div>
            <div class="createaccount-enter-email">
                <div class="createaccount-enter-email-input">
                    <input type="text" name="EMAIL" placeholder="Enter your email" class="createaccount-input-email input">
                </div>
            </div>
            <div class="createaccount-chooseoption">
                <div class="createaccount-options">
                    <select id="selectbasic" name="STATUS" class="createaccount-option-status">
                        <option value="">Choose your status</option>
                        <option value="STUDENT">Student</option>
                        <option value="WORKING">Working</option>
                        <option value="UNEMPLOYED">Unemployed</option>
                    </select>
                </div>
            </div>
            <div class="createaccount-enter-phonenumber">
                <div class="createaccount-enter-phone-input">
                    <input type="text" name="PHONE_NUMBER" placeholder="Enter your phone number" class="createaccount-input-phone input">
                </div>
            </div>
            <div class="createaccount-attach-cv">
                <label class="createaccount-cv" for="filebutton">Attach your CV</label>
                <div class="createaccount-attach">
                    <input id="filebutton" name="file" class="input-cv" type="file" onchange="updateFileName(this)">
                </div>
                <div id="fileNameContainer" class="file-name-container"></div>
            </div>

            <button class="createaccount-signup"><a class="createaccount-sign">Sign up</a></button>
        </form>


        <script>
            function updateFileName(input) {
                var fileNameContainer = document.getElementById("fileNameContainer");
                var fileName = input.files[0].name;
                fileNameContainer.innerHTML = fileName;
            }

            function validateForm() {
                var firstName = document.getElementsByName("FIRST_NAME")[0].value;
                var lastName = document.getElementsByName("LAST_NAME")[0].value;
                var age = document.getElementsByName("AGE")[0].value;
                var status = document.getElementsByName("STATUS")[0].value;
                var phoneNumber = document.getElementsByName("PHONE_NUMBER")[0].value;
                var cvFile = document.getElementsByName("CV_FILE")[0];

                if (firstName === "" || lastName === "" || age === "" || status === "" || phoneNumber === "" || cvFile === "") {
                    alert("Please fill in all fields.");
                    return false;
                }

                return true;
            }
        </script>
        <jsp:include page="common/footer.jspf" />
    </body>

</html>
