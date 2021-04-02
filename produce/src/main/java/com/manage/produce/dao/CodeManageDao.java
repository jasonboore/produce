package com.manage.produce.dao;

import com.manage.produce.data.CodeManage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeManageDao extends JpaRepository<CodeManage, Long> {
}
