package com.app.pumpwimo.pumpwimoapi.quests.services;

import com.app.pumpwimo.pumpwimoapi.quests.models.Quest;
import com.app.pumpwimo.pumpwimoapi.quests.repositories.QuestRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class QuestService {

    private final QuestRepository questRepository;

    public QuestService(QuestRepository questRepository) {
        this.questRepository = questRepository;
    }

    /* получение всех квестов */
    public List<Quest> getAllQuests() {
        return questRepository.findAll();
    }

    /* получениек квеста по названию */
    public Quest getByTitle(String title) {
        List<Quest> quests = getAllQuests();

        for (Quest quest : quests) {
            if (Objects.equals(quest.getTitle(), title)) {
                return quest;
            }
        }
        /*
        если квест не был найден по названию,
        то возвращаем null
         */
        return null;
    }

    /* обновление квеста */
    public void update(Quest updatedQuest) {

        Optional<Quest> row = questRepository
                .findById(updatedQuest.getId());

        /**
         * todo | далее идет очень рутинный код
         * todo | в будущих обновлениях это будет исправлено!
         */
        if (row.isPresent()) {
            Quest quest = row.get();
            if (!updatedQuest.getTitle().isEmpty()) {
                quest.setTitle(updatedQuest.getTitle());
            }
            if (!updatedQuest.getShortDescription().isEmpty()) {
                quest.setTitle(updatedQuest.getShortDescription());
            }
            if (!updatedQuest.getFullDescription().isEmpty()) {
                quest.setTitle(updatedQuest.getFullDescription());
            }
            if (!updatedQuest.getImg().isEmpty()) {
                quest.setTitle(updatedQuest.getImg());
            }
            if (!updatedQuest.getButtonColor().isEmpty()) {
                quest.setTitle(updatedQuest.getButtonColor());
            }
            if (!updatedQuest.getFavourite().isEmpty()) {
                quest.setTitle(updatedQuest.getDoOrNot());
            }
            questRepository.save(quest);
        }
    }
}