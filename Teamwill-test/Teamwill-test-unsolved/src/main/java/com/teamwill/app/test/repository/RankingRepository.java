package com.teamwill.app.test.repository;

import com.teamwill.app.test.entity.Ranking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RankingRepository extends JpaRepository<Ranking, Long> {
    @Query(value = "SELECT TOP 1 id FROM Ranking order by id desc", nativeQuery = true)
    Long getLastId();

}