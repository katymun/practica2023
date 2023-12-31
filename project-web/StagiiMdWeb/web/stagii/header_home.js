const headerTemplate = document.createElement('template');
headerTemplate.innerHTML = `
<header>
    <div class="wrapper">
        <nav>
            <a href="/stagii/home.html" class="logo-button">
                <div class="logo">
                    ST <img class="vector" src="images/logo.svg" />GII.MD
                </div>
            </a>
            <ul>
                <li>
                    <a class="styled-link" href="#">Home</a>
                </li>
                <li>
                    <a href="/stagii/internships.html">Internships</a>
                </li>
                <li>
                    <a href="/stagii/companies.html">Companies</a>
                </li>
            </ul>
        </nav>
    </div>
</header>
`;
document.body.appendChild(headerTemplate.content);