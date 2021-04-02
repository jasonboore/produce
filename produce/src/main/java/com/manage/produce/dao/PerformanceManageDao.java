package com.manage.produce.dao;

import com.manage.produce.data.PerformanceManage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerformanceManageDao extends JpaRepository<PerformanceManage, Long> {
}
