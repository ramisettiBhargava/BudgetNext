package com.familybudget.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.familybudget.entity.Category;
import com.familybudget.entity.Transaction;
import com.familybudget.repository.CategoryRepository;
import com.familybudget.repository.TransactionRepository;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public Transaction saveTransaction(Transaction transaction) {

        Category category = categoryRepository.findById(
                transaction.getCategory().getId())
                .orElseThrow(() -> new RuntimeException("Category Not Found"));

        transaction.setCategory(category);

        return transactionRepository.save(transaction);
    }

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public Transaction getTransactionById(Long id) {
        return transactionRepository.findById(id).orElse(null);
    }

    public Transaction updateTransaction(Long id, Transaction transaction) {

        Category category = categoryRepository.findById(
                transaction.getCategory().getId())
                .orElseThrow(() -> new RuntimeException("Category Not Found"));

        transaction.setId(id);
        transaction.setCategory(category);

        return transactionRepository.save(transaction);
    }

    public void deleteTransaction(Long id) {
        transactionRepository.deleteById(id);
    }
}