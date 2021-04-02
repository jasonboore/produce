package com.manage.produce.dao;

import com.manage.produce.data.SubcontractUnitManage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubcontractUnitManageDao extends JpaRepository<SubcontractUnitManage, Long> {
    List<SubcontractUnitManage> findByUnitNameLike(String unitName);
}
