<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Add internship</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/stagii/style2.css">
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
        .add-internship1{
            display: flex;
            justify-content: center;
            margin-top: 30px;
            margin-bottom: 50px;
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
                        <a href="cmscompanyinternshipsserv" class="company-internships">Internships</a>
                    </li>
                    <a href="" class="company-logo">
                        <div class="company-logo">
                            <img class="vector-company" src="../images/companylogo.svg" id="company-pic-right-corner" style="border-radius: 50px;"/>
                        </div>
                    </a>
                </ul>
            </nav>
        </div>

        <form action="cmssaveinternshipserv" method="POST" enctype="multipart/form-data">
            <div class="new-internship-text">Create a new internship:
                <button class="edit"><img src="../images/edit.svg" alt="Edit"></button>
                <button class="delete"><img src="../images/delete.svg" alt="Delete"></button>
            </div>
            <div class="general-text">General information:</div>
            <div class="requirements-text1">What you'll do:</div>

            <div class="requirement1">
                <label class="col-md-4 control-label" for="textinput"></label>
                <div class="requirement1-input">
                    <input id="textinput" name="textinput" type="text" placeholder="Enter a requirement"
                           class="input-requirement1 input">

                    <button class="add-button1">Add a new requirement</button>
                </div>
            </div>

            <div class="requirements-text2">What we are looking for:</div>

            <div class="requirement2">
                <label class="col-md-4 control-label" for="textinput"></label>
                <div class="requirement2-input">
                    <input id="textinput" name="textinput" type="text" placeholder="Enter a requirement"
                           class="input-requirement2 input">

                    <button class="add-button2">Add a new requirement</button>
                </div>
            </div>
            <div class="requirements-text3">What we offer:</div>

            <div class="requirement2">
                <label class="col-md-4 control-label" for="textinput"></label>
                <div class="requirement3-input">
                    <input id="textinput" name="OFFER" type="text" placeholder="Enter a requirement"
                           class="input-requirement3 input">

                    <button class="add-button3">Add a new benefit</button>
                </div>
            </div>

            <div class="details-text">Details of the internship:</div>
            <div class="paid-text">Paid:</div>


            <div class="choose-option1">
                <label class="col-md-4 control-label" for="selectbasic"></label>
                <div class="choose">
                    <select id="selectbasic" name="PAID" class="choose-option-paid">
                        <option value="">Choose an option</option>
                        <option value="YES">Yes</option>
                        <option value="NO">No</option>
                    </select>
                </div>
            </div>

            <div class="schedule-text">Schedule:</div>


            <div class="choose-option2">
                <label class="col-md-4 control-label" for="selectbasic"></label>
                <div class="choose-option-sch">
                    <select id="selectbasic" name="SCHEDULE" class="choose-option-schedule">
                        <option value="">Choose an option</option>
                        <option value="FULL_TIME">Full-time</option>
                        <option value="PART_TIME">Part-time</option>
                    </select>
                </div>
            </div>

            <div class="location-text">Location:</div>

            <div class="location">
                <label class="col-md-4 control-label" for="textinput"></label>
                <div class="location-input">
                    <input id="textinput" name="LOCATION" type="text" placeholder="Enter the location"
                           class="input-location input">
                </div>
            </div>

            <div class="company-mail-text1">Mail:</div>

            <div class="company-email1">
                <label class="email-company" for=""></label>
                <div class="company-email-input1">
                    <input id="" name="EMAIL" type="text" placeholder="Enter company's mail" class="input-email-company1 input">
                </div>
            </div>

            <div class="company-phone-text1">Phone Number:</div>

            <div class="company-phone1">
                <label class="phone-company" for=""></label>  
                <div class="company-phone-input1">
                    <input id="" name="PHONE_NUMBER" type="text" placeholder="Enter company's phone number" class="input-phone-company1 input">

                </div>
            </div>
            <div class="duration-text">Duration:</div>
            <div class="duration-choose">
                <label class="col-md-4 control-label" for="selectbasic"></label>
                <div class="choose-duration-internship">
                    <input id="" name="DURATION" type="text" placeholder="Enter the duration of the internship" class="choose-duration input">

                </div>
            </div>

            <div class="start-text">Start date:</div>
            <div class="start-date">
                <label class="col-md-4 control-label" for="selectbasic"></label>
                <div class="input-start-date">
                    <input id="" name="" type="text" placeholder="Enter the start date of the internship" class="start-date-input input">
                </div>
            </div>

            <div class="add-internship1">
                <button class="add-internship-button">
                    <a href="" class="add-internship">Add internship</a>
                </button>
                <button class="cancel-button1">
                    <a href="" class="cancel-internship1">Cancel</a>
                </button>
            </div>
        </form>
        <script>
            let companyPic = document.getElementById("company-pic");
            let companyPicRightCorner = document.getElementById("company-pic-right-corner");
            let inputFile = document.getElementById("filebutton");

            inputFile.onchange = function () {
                let file = inputFile.files[0];
                companyPic.src = URL.createObjectURL(file);
                companyPicRightCorner.src = URL.createObjectURL(file);
            }

            const textarea = document.querySelector(".resizable-textbox");

            textarea.addEventListener("input", function () {
                this.style.height = "auto";
                this.style.height = (this.scrollHeight) + "px";
            });
        </script>
        <jsp:include page="common/applicant_footer.jspf" />
    </body>

</html>