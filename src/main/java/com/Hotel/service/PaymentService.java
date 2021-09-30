package com.Hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Hotel.entity.*;
import com.Hotel.repository.*;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;
	
	
	//saving payment
	public void savePayment(PaymentDetails pay) {
		paymentRepository.save(pay);
	}
	
	//update reservation of hotels
	public boolean updateReservation(PaymentDetails pay,String email) {
		if(paymentRepository.findById(email)!=null)
		{
			paymentRepository.delete(pay);
			paymentRepository.save(pay);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	//cancel reservation of hotels
	public boolean cancelReservation(String email, String hotelname) {
		if(paymentRepository.findById(email)!=null)
		{
			paymentRepository.deleteById(email);
			return true;
		}
		else
		{
			return false;
		}
	}
}
