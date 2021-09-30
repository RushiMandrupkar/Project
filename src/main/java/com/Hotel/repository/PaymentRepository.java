package com.Hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Hotel.entity.*;

//payment repository
@Repository
public interface PaymentRepository extends JpaRepository<PaymentDetails, String> {

}
