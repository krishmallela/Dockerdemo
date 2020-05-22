package com.demo.searchservice.repository;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.searchservice.entity.DeliveryBoy;

@Repository
public interface DeliveryBoyRepository extends JpaRepository<DeliveryBoy, String> {

	DeliveryBoy findDeliveryBoyById(int id);

	

}
