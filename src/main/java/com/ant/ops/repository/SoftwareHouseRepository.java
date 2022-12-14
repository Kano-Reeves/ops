package com.ant.ops.repository;

import com.ant.ops.entity.SoftwareHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftwareHouseRepository extends JpaRepository<SoftwareHouse, Long> {
}
