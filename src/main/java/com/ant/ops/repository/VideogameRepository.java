package com.ant.ops.repository;

import com.ant.ops.entity.Videogame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface VideogameRepository extends JpaRepository<Videogame, Long> {

}
