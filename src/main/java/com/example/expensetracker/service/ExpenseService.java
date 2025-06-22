package com.example.expensetracker.service;

import com.example.expensetracker.entity.Expense;
import com.example.expensetracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository repository;

    public List<Expense> getAllExpenses() {
        return repository.findAll();
    }

    public Expense addExpense(Expense expense) {
        return repository.save(expense);
    }

    public Expense updateExpense(Long id, Expense updatedExpense) {
        updatedExpense.setId(id);
        return repository.save(updatedExpense);
    }

    public void deleteExpense(Long id) {
        repository.deleteById(id);
    }
}