<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>New company</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/stagii/style.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;700&family=Onest:wght@400;700&display=swap"
              rel="stylesheet">
    </head>
    <style>
        .upload-logo1{
            padding-left:122px;
        }
        .next-company-button{
    background-color: var(--TEXT);
    flex-shrink: 0;
    border-radius: 5px;
    padding-left: 40px;
    padding-right: 40px;
    padding-top: 12px;
    padding-bottom: 12px;
}
.next-company1{
    color: var(--COMPONENTS);
    text-decoration: none;
    font-family: Montserrat;

}

.next-company {
    display: flex;
    justify-content: center; /* Horizontally center */
    margin-top: 30px; /* Adjust the margin as needed */
    margin-bottom: 50px;
}

    </style>
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
        <form method="POST" action="newaccountrecruiterserv">
            <div class="company-name">
                <img class="vector-company-image1" src="images/companylogo.svg" id="company-pic" height="100px" width="auto"/>
            </div>
            <div class="update-file1">
                <label class="upload-logo1" for="filebutton">Upload company's logo</label>
                <div class="update-company-image1">
                    <input id="filebutton" name="filebutton" class="input-file1" type="file" >
                </div>
            </div>
            <div class="companyname-text1">Company's name:</div>
            <div class="enter-company-name1">
                <div class="insert-company-name1">
                    <input id="textinput" name="textinput" type="text" placeholder="Enter the company name" class="input-company-name1 input">
                </div> 
            </div>
            <div class="company-domain-text">Company's domain:</div>
            <div class="choose-company-domain">
                <div class="company-domain">
                    <select id="selectbasic" name="selectbasic" class="company-domain-input input">
                        <option value="">Choose company's domain</option>
                        <option value="1">IT</option>
                        <option value="2">Design</option>
                        <option value="3">Marketing</option>
                        <option value="4">Management</option>
                        <option value="5">Telecommunications</option>
                        <option value="6">Logistics</option>
                        <option value="7">Sales</option>
                        <option value="8">Accounting</option>
                        <option value="9">Banks</option>
                        <option value="10">Medicine</option>
                    </select>
                </div>
            </div>
            <div class="general-information-text1">General information:</div>
            <textarea class="resizable-textbox1" placeholder="Write a company's overview..."></textarea>

            <div class="company-mail-text1">Mail:</div>
            <div class="company-email1">
                <label class="email-company1" for=""></label>
                <div class="company-email-input1">
                    <input id="" name="" type="text" placeholder="Enter company's mail" class="input-email-company1 input">
                </div>
            </div>
            <div class="company-phone-text1">Phone Number:</div>
            <form class="form-horizontal">
                <div class="company-phone1">
                    <label class="phone-company1" for=""></label>  
                    <div class="company-phone-input1">
                        <input id="" name="" type="text" placeholder="Enter company's phone number" class="input-phone-company1 input">

                    </div>
                </div>
            </form>
            <div class="next-company">
                <button class="next-company-button">
                    <a href="" class="next-company1">Next</a>
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

