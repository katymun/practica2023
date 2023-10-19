const footerTemplate = document.createElement('template');
footerTemplate.innerHTML = `
<footer>
    <div class="footer">
        <div class="logo1">
            ST<img src="images/logo.svg" class="logo3" />GII.MD
        </div>
        <p class="copyright">This website was developed by Team04 © 2023</p>
    </div>
</footer>
`;
document.body.appendChild(footerTemplate.content);