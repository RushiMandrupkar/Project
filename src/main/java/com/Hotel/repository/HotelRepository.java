package com.Hotel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hotel.entity.Hotel;


//hotel repository 
@Repository
public interface HotelRepository extends JpaRepository<Hotel, String> {

	List<Hotel> findByRating(String rating);

}
