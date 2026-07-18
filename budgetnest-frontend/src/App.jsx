import { BrowserRouter, Routes, Route } from "react-router-dom";
import Profile from "./pages/Profile";
import Login from "./pages/Login";
import Dashboard from "./pages/Dashboard";
import Transactions from "./pages/Transactions";
import Categories from "./pages/Categories";
import Reports from "./pages/Reports";
import Register from "./pages/Register";
function App() {
  return (
    <BrowserRouter>

      <Routes>
<Route 
path="/profile" 
element={<Profile />} 
/>
        <Route
          path="/"
          element={<Login />}
        />

        <Route
          path="/dashboard"
          element={<Dashboard />}
        />

        <Route
          path="/transactions"
          element={<Transactions />}
        />

        <Route
          path="/categories"
          element={<Categories />}
        />

        <Route
          path="/reports"
          element={<Reports />}
        />
<Route path="/register" element={<Register />} />
      </Routes>

    </BrowserRouter>
  );
}

export default App;