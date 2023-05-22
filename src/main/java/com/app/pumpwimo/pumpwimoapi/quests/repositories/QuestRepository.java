package com.app.pumpwimo.pumpwimoapi.quests.repositories;

import com.app.pumpwimo.pumpwimoapi.quests.models.Quest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestRepository extends JpaRepository<Quest, Integer> {
}