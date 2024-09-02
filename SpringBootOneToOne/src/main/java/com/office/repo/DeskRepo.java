package com.office.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.office.entity.Desk;
@Repository
public interface DeskRepo extends JpaRepository<Desk, Integer>{

}
