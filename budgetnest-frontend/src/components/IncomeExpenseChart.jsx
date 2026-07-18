import { Pie } from "react-chartjs-2";

import {
    Chart as ChartJS,
    ArcElement,
    Tooltip,
    Legend
} from "chart.js";


ChartJS.register(
    ArcElement,
    Tooltip,
    Legend
);



function IncomeExpenseChart({ income, expense }) {


    const data = {

        labels: [
            "Income",
            "Expense"
        ],

        datasets: [

            {

                data: [
                    income,
                    expense
                ],

                backgroundColor: [
                    "#198754",
                    "#dc3545"
                ],

                borderWidth: 1

            }

        ]

    };



    return (

        <div className="card border-0 shadow-sm rounded-4 p-4">

            <h5 className="fw-bold mb-3">
                Income vs Expense
            </h5>


            <div style={{ height: "300px" }}>

                <Pie
                    data={data}
                    options={{
                        maintainAspectRatio:false
                    }}
                />

            </div>


        </div>

    );

}


export default IncomeExpenseChart;