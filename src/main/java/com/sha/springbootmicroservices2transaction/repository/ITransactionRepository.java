package com.sha.springbootmicroservices2transaction.repository;

import com.sha.springbootmicroservices2transaction.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// JpaRepository parametre olarak model sınıfının türü ve model sınıfındaki id nin class'ını alır.
public interface ITransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findAllByUserId(Long userId);
}
