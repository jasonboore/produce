package com.helmet.subscribe.dao;

import com.helmet.subscribe.data.Data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataDao extends JpaRepository<Data, Long> {
}