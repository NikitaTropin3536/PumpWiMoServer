package com.app.pumpwimo.pumpwimoapi.quests.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "quest")

/*
Класс задания / квеста
 */
public class Quest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",
            updatable = false,
            unique = true,
            nullable = false)
    private Integer id;

    @NotBlank
    @Size(max = 50)
    @Column(name = "title",
            unique = true,
            nullable = false)
    private String title; /* название квеста */

    @NotBlank
    @Size(max = 100)
    @Column(name = "short_description",
            nullable = false)
    private String shortDescription; /* короткое описание квеста */

    @NotBlank
    @Column(name = "full_description",
            nullable = false)
    private String fullDescription; /* полное описание квеста */

    @NotBlank
    @Column(name = "quest_difficulty_level",
            nullable = false)
    private int questDifficultyLevel; /* уровень сложности квеста */

    @NotBlank
    @Column(name = "img",
            nullable = false)
    private String img; /* картинка квеста */

    @NotBlank
    @Column(name = "money",
            nullable = false)
    /* количество единиц валюты, которое дается за прохождение квеста */
    private int money;

    @NotBlank
    @Column(name = "button_color",
            nullable = false)
    private String buttonColor; /* цвет кнопки для прохождения квеста */

    @NotBlank
    @Size(max = 3)
    @Column(name = "favourite",
            nullable = false)
    private String favourite; /* в избранном или нет? */

    @NotBlank
    @Size(max = 10)
    @Column(name = "do_or_not",
            nullable = false)
    private String doOrNot; /* пройден или нет */

    public Quest(Integer id,
                 String shortDescription,
                 String fullDescription,
                 int questDifficultyLevel,
                 String img,
                 int money,
                 String buttonColor) {
        this.id = id;
        this.shortDescription = shortDescription;
        this.fullDescription = fullDescription;
        this.questDifficultyLevel = questDifficultyLevel;
        this.img = img;
        this.money = money;
        this.buttonColor = buttonColor;
        favourite = "No";
        doOrNot = QuestAccomplishment.NOT_DO.getDoQuest();
    }
}