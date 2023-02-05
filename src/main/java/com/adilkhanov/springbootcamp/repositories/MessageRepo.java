package com.adilkhanov.springbootcamp.repositories;

import com.adilkhanov.springbootcamp.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepo extends JpaRepository<Message, Long> {
}