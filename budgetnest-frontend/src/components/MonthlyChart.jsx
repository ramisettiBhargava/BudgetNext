import {
  Bar
} from "react-chartjs-2";

import {
  Chart as ChartJS,
  CategoryScale,
  LinearScale,
  BarElement,
  Tooltip,
  Legend
} from "chart.js";

ChartJS.register(
  CategoryScale,
  LinearScale,
  BarElement,
  Tooltip,
  Legend
);

function MonthlyChart() {

  const data = {

    labels: [
      "Jan",
      "Feb",
      "Mar",
      "Apr",
      "May",
      "Jun"
    ],

    datasets: [

      {

        label: "Monthly Expenses",

        data: [
          500,
          1000,
          1200,
          900,
          1500,
          700
        ],

        backgroundColor: [
          "#4F46E5",
          "#3B82F6",
          "#06B6D4",
          "#10B981",
          "#F59E0B",
          "#EF4444"
        ],

        borderRadius: 10

      }

    ]

  };

  const options = {

    responsive: true,

    plugins: {

      legend: {

        display: false

      }

    }

  };

  return (

    <div className="card shadow border-0 rounded-4 p-4">

      <h5 className="fw-bold mb-3">
        Monthly Expense Report
      </h5>

      <Bar
        data={data}
        options={options}
      />

    </div>

  );

}

export default MonthlyChart;