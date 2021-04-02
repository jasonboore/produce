package com.manage.produce.dao;

import com.manage.produce.data.PublicInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PublicInfoDao extends JpaRepository<PublicInfo, Long> {
    public List<PublicInfo> findByWorkYear(Long wordYear);
    public List<PublicInfo> findByWorkCompany(String workConpany);
    public List<PublicInfo> findByWorkYearAndWorkCompany(Long wordYear, String workConpany);
}
