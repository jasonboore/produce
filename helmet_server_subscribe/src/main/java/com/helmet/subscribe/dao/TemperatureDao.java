package com.helmet.subscribe.dao;

import com.helmet.subscribe.data.TemperatureHistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemperatureDao extends JpaRepository<TemperatureHistory, Long> {
}