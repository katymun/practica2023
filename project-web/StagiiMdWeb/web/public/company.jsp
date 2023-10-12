
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Pagina pentru inregistrarea companiei</h1>
        <form class="form-horizontal" action="../companysaveserv" method="POST">
            <fieldset>

                <!-- Form Name -->
                <legend>Form Name</legend>

                <!-- Text input-->
                <div class="control-group">
                    <label class="control-label" for="TitleID">Title</label>
                    <div class="controls">
                        <input id="TitleID" name="COMPANY_TITLE" type="text" placeholder="Title" class="input-xlarge">
                        <p class="help-block">help</p>
                    </div>
                </div>

                <!-- Text input-->
                <div class="control-group">
                    <label class="control-label" for="Description">Description</label>
                    <div class="controls">
                        <input id="Description" name="COMPANY_DESCRIPTION" type="text" placeholder="Description" class="input-xlarge">
                        <p class="help-block">help</p>
                    </div>
                </div>

                <!-- Select Basic -->
                <div class="control-group">
                    <label class="control-label" for="selectbasic-0">Select Domain</label>
                    <div class="controls">
                        <select id="selectbasic-0" name="selectbasic-0" class="input-xlarge">
                            <option>IT</option>
                            <option>Design</option>
                            <option>Banlink</option>
                        </select>
                    </div>
                </div>

                <!-- Text input-->
                <div class="control-group">
                    <label class="control-label" for="phonenumber-id">Phone Number</label>
                    <div class="controls">
                        <input id="phonenumber-id" name="phonenumber-id" type="text" placeholder="phone number 9 digits" class="input-xlarge">
                        <p class="help-block">help</p>
                    </div>
                </div>

                <!-- Text input-->
                <div class="control-group">
                    <label class="control-label" for="email-id">Email</label>
                    <div class="controls">
                        <input id="email-id" name="email-id" type="text" placeholder="email" class="input-xlarge">
                        <p class="help-block">help</p>
                    </div>
                </div>

                <!-- Button -->
                <div class="control-group">
                    <label class="control-label" for="singlebutton-id">Click to register Company</label>
                    <div class="controls">
                        <button id="singlebutton-id" name="singlebutton-id" class="btn btn-primary">Button</button>
                    </div>
                </div>

            </fieldset>
        </form>

    </body>
</html>
