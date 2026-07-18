function RecentTransactions({ transactions }) {


    return (

        <div className="card border-0 shadow-sm rounded-4 mt-4">


            <div className="card-body">


                <h5 className="fw-bold mb-3">
                    Recent Transactions
                </h5>



                <div className="table-responsive">


                    <table className="table table-hover">


                        <thead className="table-light">

                            <tr>

                                <th>Description</th>

                                <th>Category</th>

                                <th>Type</th>

                                <th>Amount</th>

                            </tr>

                        </thead>



                        <tbody>


                            {
                                transactions.length === 0 ? (

                                    <tr>

                                        <td
                                            colSpan="4"
                                            className="text-center"
                                        >

                                            No Transactions Found

                                        </td>

                                    </tr>


                                ) : (


                                    transactions.map((transaction)=>(

                                        <tr key={transaction.id}>


                                            <td>
                                                {transaction.description}
                                            </td>


                                            <td>

                                                {
                                                    transaction.category
                                                    ?
                                                    transaction.category.name
                                                    :
                                                    "-"
                                                }

                                            </td>


                                            <td>


                                                <span

                                                    className={
                                                        transaction.type === "Income"
                                                        ?
                                                        "badge bg-success"
                                                        :
                                                        "badge bg-danger"
                                                    }

                                                >

                                                    {transaction.type}

                                                </span>


                                            </td>



                                            <td className="fw-bold">

                                                ₹ {transaction.amount}

                                            </td>



                                        </tr>


                                    ))


                                )
                            }


                        </tbody>


                    </table>


                </div>


            </div>


        </div>

    );

}


export default RecentTransactions;