package com.manage.produce.dao;

import com.manage.produce.data.CodeStyle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CodeStyleDao extends JpaRepository<CodeStyle, Long> {
    List<CodeStyle> findByCodeName(String codeName);
}
