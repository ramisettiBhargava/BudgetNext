import React from "react";
import ReactDOM from "react-dom/client";
import "./styles/navbar.css";
import App from "./App.jsx";

import "bootstrap/dist/css/bootstrap.min.css";
import "@fortawesome/fontawesome-free/css/all.min.css";
import "admin-lte/dist/css/adminlte.min.css";
import "aos/dist/aos.css";
import "./index.css";
import "./styles/dashboard.css";
import "./styles/sidebar.css";
import "./styles/navbar.css";

ReactDOM.createRoot(document.getElementById("root")).render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);
