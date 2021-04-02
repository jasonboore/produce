package com.manage.produce.dao;

import com.manage.produce.data.PeopleManagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeopleManagementDao extends JpaRepository<PeopleManagement, Long> {
    List<PeopleManagement> findByAffiliatedUnits(String affiliatedUnits);
}
