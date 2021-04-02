package com.manage.produce.dao;

import com.manage.produce.data.SubcontractTypeManage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubcontractTypeManageDao extends JpaRepository<SubcontractTypeManage, Long> {
}
