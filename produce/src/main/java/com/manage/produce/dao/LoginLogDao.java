package com.manage.produce.dao;

import com.manage.produce.data.LoginLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginLogDao extends JpaRepository<LoginLog, Long> {
}
