<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Modify Company</title>
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
.save {
    display: flex;
    justify-content: center;
    margin-top: 50px; /* Adjust this margin as needed */
    margin-bottom: 50px; /* Adjust this margin as needed */
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
                            <a href="#" class="see-applicants">See applicants</a>
                        </button>
                    </li>
                    <li>
                        <a href="" class="company-internships">Internships</a>
                    </li>
                    
                </ul>
            </nav>
        </div>

        <div class="company-name">
            <img class="vector-company-image" src="../images/companylogo.svg" id="company-pic" height="100px" width="auto"/>  Company name
        </div>
        <div class="update-file">
            <label class="upload-logo" for="filebutton">Upload company's logo</label>
            <div class="update-dompany-image">
                <input id="filebutton" name="filebutton" class="input-file" type="file" >
            </div>
        </div>

        <div class="general-information-text">General information:</div>
        <!-- Add your new element after the General Information text -->
        <div class="button-container-general">
            <button class="edit"><img src="../images/edit.svg" alt="Edit"></button>
            <button class="delete"><img src="../images/delete.svg" alt="Delete"></button>
        </div>
        <textarea class="resizable-textbox" placeholder="Write a company's overview..."></textarea>

        <div class="company-mail-text">Mail:</div>
        <div class="button-container-mail">
            <button class="edit"><img src="../images/edit.svg" alt="Edit"></button>
            <button class="delete"><img src="../images/delete.svg" alt="Delete"></button>
        </div>
        <div class="company-email">
            <label class="email-company" for=""></label>
            <div class="company-email-input">
                <input id="" name="" type="text" placeholder="Enter company's mail" class="input-email-company input">
            </div>
        </div>
        <div class="company-phone-text">Phone Number:</div>
        <div class="button-container-phone">
            <button class="edit"><img src="../images/edit.svg" alt="Edit"></button>
            <button class="delete"><img src="../images/delete.svg" alt="Delete"></button>
        </div>
        <form class="form-horizontal">
            <div class="company-phone">
                <label class="phone-company" for=""></label>  
                <div class="company-phone-input">
                    <input id="" name="" type="text" placeholder="Enter company's phone number" class="input-phone-company input">

                </div>
            </div>
        </form>
        <div class="save">
            <button class="save-button">
                <a href="#" class="save-internship">Save</a>
            </button>
            <button class="cancel-button">
                <a href="#" class="cancel-internship">Cancel</a>
            </button>
        </div>

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
