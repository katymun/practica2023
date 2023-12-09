<%@page import="com.iucosoft.stagiimdweb.entities.Applicant"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Profile Edit</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/stagii/style4.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;700&family=Onest:wght@400;700&display=swap"
              rel="stylesheet">
    </head>
    <style>  .personal-information-text{
            padding-left: 122px;
            font-size: 30px;
            font-family: "Stolzl";
            color: var(--TEXT);
            padding-top: 100px;
        }
        .personal-information-firstname{
            padding-left: 122px;
            font-size: 20px;
            font-family: "Stolzl";
            color: var(--TEXT);
            padding-top: 30px;
        }
        .personal-information-lastname{
            padding-left: 122px;
            font-size: 20px;
            font-family: "Stolzl";
            color: var(--TEXT);
            padding-top: 50px;
        }
        .personal-information-age{
            padding-left: 122px;
            font-size: 20px;
            font-family: "Stolzl";
            color: var(--TEXT);
            padding-top: 50px;
        }
        .personal-information-status{
            padding-left: 122px;
            font-size: 20px;
            font-family: "Stolzl";
            color: var(--TEXT);
            padding-top: 50px;
        }
        .personal-information-phone{
            padding-left: 122px;
            font-size: 20px;
            font-family: "Stolzl";
            color: var(--TEXT);
            padding-top: 50px;
        }
        .personal-information-email{
            padding-left: 122px;
            font-size: 20px;
            font-family: "Stolzl";
            color: var(--TEXT);
            padding-top: 50px;
        }
        .personal-information-cv{
            padding-left: 122px;
            font-size: 20px;
            font-family: "Stolzl";
            color: var(--TEXT);
            padding-top: 50px;
        }
        .personal-information-text {
            display: flex;
            align-items: center;
        }

        .button-container-general {
            margin-left: 10px; 
        }
        .edit {
            border: none;
            background: none;

        }


        .button-container-general {
            display: flex;
            align-items: center;
        }

        /* Style the button */
        .button-container-general button {
            background: none;
            border: none;
            cursor: pointer;
            margin-right: 10px;
        }

        .personal-information-firstname-edit{
            margin-top:20px;
            display: block;
            width: 250px;
            color: var(--TEXT2, #AEB4C1);
            font-family: Montserrat;
            font-size: 14px;
            padding-top: 15px;
            padding-bottom: 15px;
            padding-left: 12px;
            border-radius: 5px;
            border: 1px solid var(--TEXT2, #AEB4C1);
            background: var(--COMPONENTS, #FFF);
            box-sizing: border-box;
        }
        .personal-information-lastname-edit{
            margin-top:20px;
            display:block;
            width: 250px;
            color: var(--TEXT2, #AEB4C1);
            font-family: Montserrat;
            font-size: 14px;
            padding-top: 15px;
            padding-bottom: 15px;
            padding-left: 12px;
            border-radius: 5px;
            border: 1px solid var(--TEXT2, #AEB4C1);
            background: var(--COMPONENTS, #FFF);
            box-sizing: border-box;
        }
        .personal-information-age-edit{
            margin-top:20px;
            display: block;
            width: 250px;
            color: var(--TEXT2, #AEB4C1);
            font-family: Montserrat;
            font-size: 14px;
            padding-top: 15px;
            padding-bottom: 15px;
            padding-left: 12px;
            border-radius: 5px;
            border: 1px solid var(--TEXT2, #AEB4C1);
            background: var(--COMPONENTS, #FFF);
            box-sizing: border-box;
        }
        .personal-information-status-edit{
            margin-top:20px;
            display: block;
            width: 250px;
            color: var(--TEXT2, #AEB4C1);
            font-family: Montserrat;
            font-size: 14px;
            padding-top: 15px;
            padding-bottom: 15px;
            padding-left: 12px;
            border-radius: 5px;
            border: 1px solid var(--TEXT2, #AEB4C1);
            background: var(--COMPONENTS, #FFF);
            box-sizing: border-box;
        }
        .personal-information-email-edit{
            margin-top:20px;
            display: block;
            width: 250px;
            color: var(--TEXT2, #AEB4C1);
            font-family: Montserrat;
            font-size: 14px;
            padding-top: 15px;
            padding-bottom: 15px;
            padding-left: 12px;
            border-radius: 5px;
            border: 1px solid var(--TEXT2, #AEB4C1);
            background: var(--COMPONENTS, #FFF);
            box-sizing: border-box;
        }
        .personal-information-phone-edit {
            margin-top:20px;
            display: block;
            width: 250px;
            color: var(--TEXT2, #AEB4C1);
            font-family: Montserrat;
            font-size: 14px;
            padding-top: 15px;
            padding-bottom: 15px;
            padding-left: 12px;
            border-radius: 5px;
            border: 1px solid var(--TEXT2, #AEB4C1);
            background: var(--COMPONENTS, #FFF);
            box-sizing: border-box;
        }
        .personal-information-cv {
            margin-top:20px;
            display: flex;
            align-items: center;
        }

        .personal-information-attach {
            color: var(--COMPONENTS);
            text-decoration: none;
            font-family: Montserrat;
            font-size: 14px;
        }
        .personal-information-attach{
            padding-top: 40px;
            padding-left: 60px;
        }
        .personal-information-attach-cv {
            background-color: var(--TEXT);
            border-radius: 5px;
            padding-left: 40px;
            padding-right: 40px;
            padding-top: 12px;
            padding-bottom: 12px;
            margin-left: 20px; 
        }

        .input-personal-information-cv {
            display: none;
        }
        .save-button{
            background-color: var(--TEXT);
            flex-shrink: 0;
            border-radius: 5px;
            padding-left: 40px;
            padding-right: 40px;
            padding-top: 12px;
            padding-bottom: 12px;

        }
        .save-internship{
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
        }
        .cancel-internship{
            text-decoration: none;
            color: var(--TEXT, #AEB4C1);
            font-family: Montserrat;
        }
        .save-edit{
            margin-top: 50px;
            display: flex;
            align-items: center;
            justify-content: center;
            margin-bottom: 50px;
        }
        .personal-information-cv-label{
            padding-left: 122px;
            font-size: 20px;
            font-family: "Stolzl";
            color: var(--TEXT);
            padding-top: 30px;
        }
        .personal-information-container {
            display: flex;
            /* Adjust this for overall alignment */
        }

        .personal-text-edit,
        .personal-forms-edit {
            display: flex;
            flex-direction: column;
            padding-right: 20px; /* Adjust this for spacing between columns */
        }

        /* Style the form labels */
        .file-name-container {
            margin-top: 30px;
            color: var(--TEXT);
            font-size: 18px;
        }




    </style>
    <body>
        <jsp:include page="common/applicant_header.jspf" flush="true" />

        <form action="cmsupdateprofileserv" method="POST" enctype="multipart/form-data">
            <div class="personal-information-text">Personal information:
                <div class="button-container-general">
                    <button class="edit"><img src="../images/edit.svg" alt="Edit"></button>
                </div>
            </div>
            <div class="personal-information-container">
                <div class="personal-text-edit">
                    <div class="personal-information-firstname">First name:</div>
                    <div class="personal-information-lastname">Last name:</div>
                    <div class="personal-information-age">Age:</div>
                    <div class="personal-information-status">Status:</div>
                    <div class="personal-information-phone">Phone number:</div>
                    <div class="personal-information-email">Email:</div>
                    <div class="personal-information-cv-label">CV:</div>
                </div>
                <div class="personal-forms-edit">
                    <%
                        Applicant sessionApplicant = (Applicant) session.getAttribute("sessionApplicant");
                    %>
                    <input type="text" name="FIRST_NAME" id="" class="personal-information-firstname-edit" value="${sessionApplicant.aName}" >
                    <input type="text" name="LAST_NAME" id="" class="personal-information-lastname-edit" value="${sessionApplicant.aSurname}">
                    <input type="text" name="AGE" id="" class="personal-information-age-edit" value="${sessionApplicant.age}">
                    <input type="text" name="STATUS" id="" class="personal-information-status-edit" value="${sessionApplicant.status}">
                    <input type="text" name="PHONE_NUMBER" id="" class="personal-information-phone-edit" value="${sessionApplicant.phoneNumber}">
                    <input type="email" name="EMAIL" id="" class="personal-information-email-edit" value="${sessionApplicant.email}">

                    <div class="personal-information-attach">
                        <label class="personal-information-attach-cv" for="filebutton">Attach your CV</label>
                        <div class="personal-attach">
                            <input id="filebutton" name="file" class="input-personal-information-cv" type="file" onchange="updateFileName(this)">
                        </div>
                        <div id="fileNameContainer" class="file-name-container"></div>
                    </div>

                </div>
            </div>

            <div class="save-edit">
                <button class="save-button">
                    <a class="save-internship">Save</a>
                </button>
                <button class="cancel-button">
                    <a class="cancel-internship">Cancel</a>
                </button>
            </div>
        </form>
        <script>
            function updateFileName(input) {
                var fileNameContainer = document.getElementById("fileNameContainer");
                var fileName = input.files[0].name;
                fileNameContainer.textContent = fileName;
            }

        </script>
        <jsp:include page="common/applicant_footer.jspf" />
    </body>

</html>

