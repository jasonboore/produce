package com.manage.produce.dao;

import com.manage.produce.data.ProduceInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduceInfoDao extends JpaRepository<ProduceInfo, Long> {
    public List<ProduceInfo> findByWorkUnit(String workUnit);
}
