package com.manage.produce.dao;

import com.manage.produce.data.ActiveUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActiveUserDao extends JpaRepository<ActiveUser, Long> {
}
