package com.manage.produce.dao;

import com.manage.produce.data.ConstructionUnitType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstructionUnitTypeDao extends JpaRepository<ConstructionUnitType, Long> {
}
