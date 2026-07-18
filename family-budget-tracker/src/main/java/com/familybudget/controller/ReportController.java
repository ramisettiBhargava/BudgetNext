package com.familybudget.controller;

import com.familybudget.entity.Transaction;
import com.familybudget.service.ReportService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reports")
@CrossOrigin("*")
public class ReportController {

    private final ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    // ===========================
    // Get All Transactions Report
    // ===========================
    @GetMapping("/transactions")
    public List<Transaction> getTransactionsReport() {
        return reportService.getAllTransactions();
    }

    // ===========================
    // Get Total Income
    // ===========================
    @GetMapping("/income")
    public Double getTotalIncome() {
        return reportService.getTotalIncome();
    }

    // ===========================
    // Get Total Expense
    // ===========================
    @GetMapping("/expense")
    public Double getTotalExpense() {
        return reportService.getTotalExpense();
    }

    // ===========================
    // Get Current Balance
    // ===========================
    @GetMapping("/balance")
    public Double getBalance() {
        return reportService.getTotalIncome()
                - reportService.getTotalExpense();
    }

}