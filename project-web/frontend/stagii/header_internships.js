const headerTemplate = document.createElement('template');
headerTemplate.innerHTML = `
<header>
<div class="wrapper">
    <nav>
        <!--> <div class="box"><!-->
            <a href="/Homepage/home.html" class="logo-button">
                <div class="logo">
                    ST <img class="vector" src="images/logo.svg" />GII.MD

                    <!--></div><!-->
                </div>
                </a>
        <ul>
            <li>
                <a href="/stagii/home.html">Home</a>
            </li>

            <li>
                <a href="#" class="styled-link2">Internships</a>
            </li>

            <li>
                <a href="/stagii/companies.html">Companies</a>
            </li>
            <!--
                <li>
                    <a href="#">Sign in</a>
                </li>
                
             <li>
                <a href="#" class="btn light">Sign up</a> 
             </li>
             <li>

                <a href="#" class="btn dark">Post internship</a> 
             </li>
             -->
        </ul>
    </nav>
</header>
`;
document.body.appendChild(headerTemplate.content);