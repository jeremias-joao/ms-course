package com.devsuperior.hrpayrool.service;

import org.springframework.stereotype.Service;

import com.devsuperior.hrpayrool.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		
		//Worker worker = workerFeignClient.findById(workerId).getBody();
		//return new Payment(worker.getName(), worker.getDailyIncome(), days);
		return new Payment("Bob", 200.0, days);
	}

}
