package com.sha.springbootmicroservices2transaction.service;

import com.sha.springbootmicroservices2transaction.model.Transaction;
import com.sha.springbootmicroservices2transaction.repository.ITransactionRepository;
import org.apache.catalina.startup.ListenerCreateRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionService implements ITransactionService {

    @Autowired
    private ITransactionRepository transactionRepository;

    @Override
    public Transaction saveTransaction(Transaction transaction){
        transaction.setTransactionTime(LocalDateTime.now());
        return transactionRepository.save(transaction);
    }

    @Override
    public void deleteTransaction(Long transactionId){
        transactionRepository.deleteById(transactionId);
    }

    @Override
    public List<Transaction> findAllTransactionsOfUser(Long userId){
        return transactionRepository.findAllByUserId(userId);
    }

}