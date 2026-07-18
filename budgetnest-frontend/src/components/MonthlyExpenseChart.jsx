import { Bar } from "react-chartjs-2";

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



function MonthlyExpenseChart() {


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

                label: "Expenses",

                data: [
                    5000,
                    8000,
                    4500,
                    10000,
                    7000,
                    9000
                ],

                backgroundColor: "#0d6efd"

            }

        ]

    };



    return (

        <div className="card border-0 shadow-sm rounded-4 p-4 mt-4">


            <h5 className="fw-bold mb-3">
                Monthly Expenses
            </h5>



            <Bar
                data={data}
            />


        </div>

    );

}


export default MonthlyExpenseChart;