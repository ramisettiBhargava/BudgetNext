package com.familybudget.service;

import com.familybudget.entity.DashboardResponse;
import com.familybudget.entity.Transaction;
import com.familybudget.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardService {

    @Autowired
    private TransactionRepository transactionRepository;

    public DashboardResponse getDashboardData() {

        List<Transaction> transactions = transactionRepository.findAll();

        double totalIncome = 0;
        double totalExpense = 0;

        for (Transaction transaction : transactions) {

            if ("INCOME".equalsIgnoreCase(transaction.getType())) {
                totalIncome += transaction.getAmount();
            }

            if ("EXPENSE".equalsIgnoreCase(transaction.getType())) {
                totalExpense += transaction.getAmount();
            }
        }

        double balance = totalIncome - totalExpense;

        return new DashboardResponse(totalIncome, totalExpense, balance);
    }
}