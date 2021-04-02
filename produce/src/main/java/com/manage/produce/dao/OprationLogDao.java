package com.manage.produce.dao;

import com.manage.produce.data.OprationLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OprationLogDao extends JpaRepository<OprationLog, Long> {
}
