package com.familybudget.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.familybudget.entity.Transaction;
import com.familybudget.service.TransactionService;

@RestController
@RequestMapping("/api/transactions")
@CrossOrigin(origins = "*")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;


    // CREATE TRANSACTION
    @PostMapping
    public Transaction saveTransaction(
            @RequestBody Transaction transaction) {

        System.out.println("========== TRANSACTION CONTROLLER REACHED ==========");
        System.out.println("Description : " + transaction.getDescription());
        System.out.println("Amount : " + transaction.getAmount());
        System.out.println("Type : " + transaction.getType());

        return transactionService.saveTransaction(transaction);
    }


    // GET ALL TRANSACTIONS
    @GetMapping
    public List<Transaction> getAllTransactions() {

        return transactionService.getAllTransactions();
    }


    // GET TRANSACTION BY ID
    @GetMapping("/{id}")
    public Transaction getTransactionById(
            @PathVariable Long id) {

        return transactionService.getTransactionById(id);
    }


    // UPDATE TRANSACTION
    @PutMapping("/{id}")
    public Transaction updateTransaction(
            @PathVariable Long id,
            @RequestBody Transaction transaction) {

        return transactionService.updateTransaction(id, transaction);
    }


    // DELETE TRANSACTION
    @DeleteMapping("/{id}")
    public String deleteTransaction(
            @PathVariable Long id) {

        transactionService.deleteTransaction(id);

        return "Transaction Deleted Successfully";
    }
}