package com.payment.payment.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity     // why ?
public class Payment {
	
	     @Id // to make primary key in the database
         private Long paymentId;
         private int custId;
         private int orderId;
         private double amount;
         private String currency;
         
         
		 public Long getPaymentId() {
			 return paymentId;
		 }
		 public void setPaymentId(Long paymentId) {
			 this.paymentId = paymentId;
		 }
		 public int getCustId() {
			 return custId;
		 }
		 public void setCustId(int custId) {
			 this.custId = custId;
		 }
		 public int getOrderId() {
			 return orderId;
		 }
		 public void setOrderId(int orderId) {
			 this.orderId = orderId;
		 }
		 public double getAmount() {
			 return amount;
		 }
		 public void setAmount(double amount) {
			 this.amount = amount;
		 }
		 public String getCurrency() {
			 return currency;
		 }
		 public void setCurrency(String currency) {
			 this.currency = currency;
		 }
		 public Payment() {
			
		 }
		 public Payment(Long paymentId, int custId, int orderId, double amount, String currency) {
			super();
			this.paymentId = paymentId;
			this.custId = custId;
			this.orderId = orderId;
			this.amount = amount;
			this.currency = currency;
		 }
         
         
         
}
