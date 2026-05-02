import React from "react";
import "./Footer.css";

function Footer() {
    return (
        <footer className="footer">
            <h2 className="logo">MediCare</h2>

            <nav>
                <a href="#">Home</a>
                <a href="#">Doctors</a>
                <a href="#">Contact</a>
            </nav>

            <p>© 2026 MediCare. All rights reserved.</p>
        </footer>
    );
}

export default Footer;