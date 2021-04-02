package com.manage.produce.dao;

import com.manage.produce.data.CodeList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CodeListDao extends JpaRepository<CodeList, Long> {
    List<CodeList> findByCodeNameLike(String name);
}
