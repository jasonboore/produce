package com.manage.produce.dao;

import com.manage.produce.data.ConstructionUnitManage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ConstructionUnitManageDao extends JpaRepository<ConstructionUnitManage, Long> {
    public List<ConstructionUnitManage> findByUnitType(String unitType);
    public List<ConstructionUnitManage> findByUnitNameLike(String unitName);
    public List<ConstructionUnitManage> findByUnitTypeAndUnitNameLike(String unitType, String unitName);
}
