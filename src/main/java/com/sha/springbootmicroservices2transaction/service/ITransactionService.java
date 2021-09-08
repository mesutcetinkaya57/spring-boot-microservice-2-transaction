package com.sha.springbootmicroservices2transaction.service;

import com.sha.springbootmicroservices2transaction.model.Transaction;

import java.util.List;

public interface ITransactionService {
    Transaction saveTransaction(Transaction transaction);

    void deleteTransaction(Long transactionId);

    List<Transaction> findAllTransactionsOfUser(Long userId);
}
