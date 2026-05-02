import React from "react";
import "./Header.css";

function Header() {
    return (
        <header className="header">
            <h2 className="logo">🏥 HealthCare App</h2>

            <nav>
                <a href="/">Home</a>
                <a href="/Doctor">Doctor</a>
                <a href="/Patient">Patient</a>
            </nav>
        </header>
    );
}

export default Header;