package com.lucky;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LuckyRepository extends JpaRepository<Lucky, Long> {
  @Query(value = "select * from lucky_result lucky ORDER BY lucky.id DESC LIMIT 1", nativeQuery = true)
  Lucky findLastestLuckyResult();
}