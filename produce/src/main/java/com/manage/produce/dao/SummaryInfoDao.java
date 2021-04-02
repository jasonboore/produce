package com.manage.produce.dao;

import com.manage.produce.data.SummaryInfo;
import net.bytebuddy.build.Plugin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SummaryInfoDao extends JpaRepository<SummaryInfo, Long> {
    List<SummaryInfo> findByWorkUnitAndIsFin(String workUnit, String isFin);
    List<SummaryInfo> findByWorkUnit(String workUnit);
    List<SummaryInfo> findByIsFin(String isFin);
}
