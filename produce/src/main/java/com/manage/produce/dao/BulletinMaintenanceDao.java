package com.manage.produce.dao;

import com.manage.produce.data.BulletinMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BulletinMaintenanceDao extends JpaRepository<BulletinMaintenance, Long> {
    public BulletinMaintenance findByPid(Long pid);
}
