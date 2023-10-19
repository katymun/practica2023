<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="style.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;700&family=Onest:wght@400;700&display=swap"
        rel="stylesheet">
</head>

<body>
    <header>
        <div class="wrapper">
            <nav>
                <div class="logo">
                    ST<img src="images/logo.svg" alt="" />AGII.MD

                </div>
                <ul>
                    <li>
                        <a href="#">Home</a>
                    </li>

                    <li>
                        <a href="#">Internships</a>
                    </li>

                    <li>
                        <a href="#">Companies</a>
                    </li>

                    <li>
                        <a href="#">Sign in</a>
                    </li>
                    <!--
                 <li>
                    <a href="#" class="btn light">Sign up</a> 
                 </li>
                 <li>

                    <a href="#" class="btn dark">Post internship</a> 
                 </li>
                 -->
                </ul>
            </nav>
            <!-- end of desktop navigation menu-->

            <div class="hero-section">
                <div class="left">
                    <h1>
                        <div class="text-wrapper-5">Find</div>
                        <div class="internship">
                            <div class="overlap">
                                <img class="accent-internships" src="images/accent-internships.svg" />
                                <div class="text-wrapper-6">internships</div>
                            </div>
                    </h1>
                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="textinput"></label>
                        <div class="col-md-4">

                            <input id="textinput" name="textinput" type="text" placeholder="Search for internship title"
                                form-control input-md">
                            <div class="container">
                                <div class="vertical-center">
                                    <button>Search</button>
                                </div>
                            </div>
                            <div>
                                <br>
                                Examples: <li>Front end</li>
                                <li>Back end</li>
                                <li>Design</li>
                                </br>
                            </div>
                        </div>
                    </div>
                    <div class="right"></div>
                    <img src="images/image front page.svg" alt="" />
                </div>
            </div>
        </div>
        </div>
    </header>
    <!-- End of header section-->
    <nav>
    <div class="wrapper">
        <section class="testiomonials-section">
            <div class="testimonial-card">
                <button>
                    <img src="images/IT sign.svg" alt="" />
                    <div class="content">IT
                    </div>
                </button>
            </div>
            <div class="testimonial-card">
                <button>
                    <img src="images/Design sign.svg" alt="" />
                    <div class="content">Design
                    </div>
                </button>
            </div>
            <div class="testimonial-card">
                <button>
                    <img src="images/Marketing sign.svg" alt="" />
                    <div class="content">Marketing
                    </div>
                </button>
            </div>
            <div class="testimonial-card">
                <button>
                    <img src="images/Management sign.svg" alt="" />
                    <div class="content">Management
                    </div>
                </button>
            </div>
            <div class="testimonial-card">
                <button>
                    <div class="content">Discover<br>more</div></br>
            </div>
            </button>
    </div>
    </section>
</nav>
    <!--End of testimonials section-->
    <section class="internships-section">
        <br>
        <div>Featured internships:</div>
        </br>
        <div class="internships">
            <button>
                <div class="content">Company 1
                </div>
            </button>
        </div>
        <div class="internships">
            <button>
                <div class="content">Company 2
                </div>
            </button>
        </div>
        <div class="internships">
            <button>
                <div class="content">Company 3
                </div>
            </button>
        </div>
        <div class="internships">
            <button>
                <div class="content">Company 4
                </div>
            </button>
        </div>
        <div class="internships">
            <button>
                <div class="content">Company 5
                </div>
            </button>
        </div>
        <br>
        <div class="container">
            <div class="vertical-center">
                <button>More internships</button>
            </div>
        </div>
        </br>
    </section>

    </div>
    <!-- End of company internship sections-->
    <div class="container">
        <img src="images/newsletter.svg" alt="">
        <!-- Text input-->
        <br>
        <div class="form-group">
            <label class="col-md-4 control-label" for=""></label>
            <div class="col-md-4">
                <input id="" name="" type="text" placeholder="Indicate the internship position"
                    class="form-control input-md">

            </div>
        </div>
    </br>
        <br>
        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for=""></label>
            <div class="col-md-4">
                <input id="" name="" type="text" placeholder="Your full name" class="form-control input-md">

            </div>
        </div>
    </br>
        <!-- Text input-->
        <br>
        <div class="form-group">
            <label class="col-md-4 control-label" for=""></label>
            <div class="col-md-4">
                <input id="" name="" type="text" placeholder="Your email adress" class="form-control input-md">

            </div>
        </div>
    </br>
        </fieldset>
        </form>
        <button class="btn">Subscribe</button>
    </div>
    <!-- End of the newsletter-->
    <footer>
    <div class="logo">
        ST<img src="images/logo.svg" alt="" />AGII.MD

    </div>
</footer>
    <script src="main.js"></script>
</body>

</html>