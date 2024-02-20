package dev.joaocalca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.joaocalca.models.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    
}
