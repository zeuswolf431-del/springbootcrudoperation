package com.payment.payment.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.payment.payment.interfaces.paymentinterface;
import com.payment.payment.models.Payment;
@Service
public class PaymentServices {
// service will ask repository
	
	// you have to write a code
	public paymentinterface repo;

	public PaymentServices(paymentinterface repo) {
		this.repo = repo;
	}
	
	public Payment addPayment(Payment payment)
	{
		return repo.save(payment);
	}
	
	public List<Payment> getPayments()
	{
		return repo.findAll();
	}
	
	public Payment getPaymentById(Long pid)
	{
		return repo.findById(pid)
				.orElseThrow(()->
						new RuntimeException("Payment not found"));
	}
	
	 public void deletePayment(Long id)
	{
		if(!repo.existsById(id))
		{
			throw new RuntimeException("payment not found");
		}
		repo.deleteById(id);
	}
	
	// update means already existed we have to change name location based on id
	public Payment updatePayment(Long id, Payment payment) 
	{
		Payment existingPayment = repo.findById(id)
				   .orElseThrow(()->
				   new RuntimeException("payment not found"));
		existingPayment.setPaymentId(payment.getPaymentId());
		existingPayment.setCustId(payment.getCustId());
		existingPayment.setAmount(payment.getAmount());
		existingPayment.setCurrency(payment.getCurrency());
		
		return repo.save(existingPayment);
	}
}
