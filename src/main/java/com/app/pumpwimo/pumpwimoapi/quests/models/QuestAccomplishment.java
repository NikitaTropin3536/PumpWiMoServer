package com.app.pumpwimo.pumpwimoapi.quests.models;

public enum QuestAccomplishment {

    D0("do"), /* уже прошел квест */
    NOT_DO("not_do"); /* еше не прошел квест */

    private String doQuest;

    QuestAccomplishment(String doQuest) {
        this.doQuest = doQuest;
    }

    public String getDoQuest() {
        return doQuest;
    }
}