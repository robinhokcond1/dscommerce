package com.devsuperior.dscommerce.repositories;

import com.devsuperior.dscommerce.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
