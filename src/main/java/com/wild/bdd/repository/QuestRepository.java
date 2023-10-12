package com.wild.bdd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wild.bdd.entity.Quest;

@Repository
public interface QuestRepository extends JpaRepository<Quest, Long>{
    
}
