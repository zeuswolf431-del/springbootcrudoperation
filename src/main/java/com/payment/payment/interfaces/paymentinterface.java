package com.payment.payment.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payment.payment.models.Payment;

public interface paymentinterface extends JpaRepository<Payment, Long> {

}

// JPA - why we need JPA ?
// it helps me to store and retrieve data from the database
//T - means class   // how i can search in the database Long paymentID