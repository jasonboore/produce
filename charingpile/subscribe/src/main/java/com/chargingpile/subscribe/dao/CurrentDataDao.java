package com.chargingpile.subscribe.dao;


import com.chargingpile.subscribe.data.CurrentData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrentDataDao extends JpaRepository<CurrentData, String> {
}
