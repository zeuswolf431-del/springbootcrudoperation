package com.payment.payment.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.payment.payment.models.Payment;
import com.payment.payment.services.PaymentServices;

@RestController
public class PaymentController {

	
	public PaymentServices services;

	public PaymentController(PaymentServices services) {
	
		this.services = services;
	}

	
	@PostMapping("/add") // request is post end point is/add
	public Payment create(@RequestBody Payment cust)
	{
		return services.addPayment(cust);
	}
	@GetMapping("/all")
	public List<Payment> getAll()
	{
		return services.getPayments();
	}
	@GetMapping("/{pid}")
	public Payment getPaymentById(@PathVariable Long pid)
	{
		return services.getPaymentById(pid);
	}
//	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletePayment (@PathVariable Long id) {
		services.deletePayment(id);
		return ResponseEntity.noContent().build();
	}
	
	


	@PutMapping("/{id}")
	public Payment updatePayment(
			@PathVariable Long id,
			@RequestBody Payment payment) {
		return services.updatePayment(id, payment);
	}
}
