package com.manage.produce.dao;

import com.manage.produce.data.DepartmentManagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentManageDao extends JpaRepository<DepartmentManagement, Long> {
}
