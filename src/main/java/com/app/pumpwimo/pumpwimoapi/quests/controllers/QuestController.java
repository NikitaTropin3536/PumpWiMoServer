package com.app.pumpwimo.pumpwimoapi.quests.controllers;

import com.app.pumpwimo.pumpwimoapi.quests.models.Quest;
import com.app.pumpwimo.pumpwimoapi.quests.services.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quests")
public class QuestController {

    @Autowired
    private final QuestService questService;

    public QuestController(QuestService questService) {
        this.questService = questService;
    }

    @GetMapping("/all")
    public List<Quest> getAllQuests() {
        return questService.getAllQuests();
    }

    @GetMapping("/{title}")
    public Quest getByTitle(@PathVariable String title) {
        return questService.getByTitle(title);
    }

    @PutMapping("/updatedQuest")
    public void update(@RequestBody Quest updatedQuest) {
        questService.update(updatedQuest);
    }
}