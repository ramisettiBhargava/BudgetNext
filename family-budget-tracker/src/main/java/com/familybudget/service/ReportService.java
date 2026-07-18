package com.familybudget.service;

import com.familybudget.entity.Transaction;
import com.familybudget.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {

    private final TransactionRepository transactionRepository;

    public ReportService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    // Get All Transactions
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    // Total Income
    public Double getTotalIncome() {
        return transactionRepository.findAll().stream()
                .filter(t -> "INCOME".equalsIgnoreCase(t.getType()))
                .mapToDouble(Transaction::getAmount)
                .sum();
    }

    // Total Expense
    public Double getTotalExpense() {
        return transactionRepository.findAll().stream()
                .filter(t -> "EXPENSE".equalsIgnoreCase(t.getType()))
                .mapToDouble(Transaction::getAmount)
                .sum();
    }
}