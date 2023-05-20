package com.app.pumpwimo.pumpwimoapi.humans.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data /* lombok аннотация - генерит "рутинный" код */
@Entity
@NoArgsConstructor
@Table(name = "person") /* название таблички */

/*
Класс какой - то персоны (успешного человека)
 */
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",
            updatable = false,
            unique = true,
            nullable = false)
    private Integer id;

    @NotBlank
    @Size(max = 50)
    @Column(name = "name",
            unique = true,
            nullable = false)
    private String name; /* имя */

    @NotBlank
    @Column(name = "photo",
            nullable = false)
    private String photo; /* фото */

    @NotBlank
    @Size(max = 80)
    @Column(name = "what_do",
            nullable = false)
    private String whatDo; /* что сделал? / чем известен? */

    @NotBlank
    @Column(name = "summary",
            nullable = false)
    /* предисловие */
    private String summary;

    @NotBlank
    @Column(name = "info_link",
            nullable = false)
    /* ссылка на ресурс с полной биографией */
    private String infoLink;

    @NotBlank
    @Column(name = "dop_link",
            nullable = false)
    /* ссылка на доп. ресурс */
    private String dopLink;

    @NotBlank
    @Size(max = 3)
    @Column(name = "favourite",
            nullable = false)
    /* в избранном или нет? */
    private String favourite;

    @NotBlank
    @Size(max = 50)
    @Column(name = "biography_read",
            nullable = false)
    /* биография прочитана или нет? */
    private String biographyRead;

    public Person(String name,
                  String photo,
                  String whatDo,
                  String summary,
                  String infoLink,
                  String dopLink) {
        this.name = name;
        this.photo = photo;
        this.whatDo = whatDo;
        this.summary = summary;
        this.infoLink = infoLink;
        this.dopLink = dopLink;
        favourite = "No";
        biographyRead = ReadBiography.NOT_READ_BIOGRAPHY.getReadBiographyOrNot();
    }
}