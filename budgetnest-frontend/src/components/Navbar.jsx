import { FaBell, FaUserCircle } from "react-icons/fa";

function Navbar() {
  return (
    <nav className="navbar navbar-expand-lg bg-white shadow-sm px-4">
      <div className="container-fluid">

        <h4 className="fw-bold text-primary mb-0">
          BudgetNest
        </h4>

        <div className="ms-auto d-flex align-items-center">

          <FaBell size={22} className="me-4 text-secondary" />

          <FaUserCircle size={35} className="text-primary me-2" />

          <div>
            <div className="fw-bold">Bhargav</div>
            <small className="text-muted">Welcome Back</small>
          </div>

        </div>

      </div>
    </nav>
  );
}

export default Navbar;