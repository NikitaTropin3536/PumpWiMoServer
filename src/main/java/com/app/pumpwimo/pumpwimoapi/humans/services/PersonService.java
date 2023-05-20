package com.app.pumpwimo.pumpwimoapi.humans.services;

import com.app.pumpwimo.pumpwimoapi.humans.models.Person;
import com.app.pumpwimo.pumpwimoapi.humans.repositories.PersonRepository;
import com.app.pumpwimo.pumpwimoapi.humans.response.RestApiException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class PersonService {

    /*
        отвечает за формирование ответа на запрос
     */

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    /* получение всех людей */
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    /* получение человека по имени */
    public Person getByName(String name) {
        List<Person> personList = getAllPersons();

        for (Person person : personList) {
            if (Objects.equals(person.getName(), name)) {
                return person;
            }
        }
        /*
        если человек не был найден по имени,
        то возвращаем null
         */
        return null;
    }

    /* добавление человека */
    public void add(Person newPerson) {
        if (getByName(newPerson.getName()) == null) {
            personRepository.save(newPerson);
        } else {
        /*
            если пользователь с таким именем уже есть,
            то вывдится ошибка
         */
            throw new RestApiException("Имя занято");
        }
    }

    /* обновление человека */
    public void update(Person updatedPerson) {

        Optional<Person> row = personRepository
                .findById(updatedPerson.getId());

        /**
         * todo | далее идет очень рутинный код
         * todo | в будущих обновлениях это будет исправлено!
         */
        if (row.isPresent()) {
            Person person = row.get();
            if (!updatedPerson.getName().isEmpty()) {
                person.setName(updatedPerson.getName());
            }
            if (!updatedPerson.getPhoto().isEmpty()) {
                person.setPhoto(updatedPerson.getPhoto());
            }
            if (!updatedPerson.getWhatDo().isEmpty()) {
                person.setWhatDo(updatedPerson.getWhatDo());
            }
            if (!updatedPerson.getSummary().isEmpty()) {
                person.setSummary(updatedPerson.getSummary());
            }
            if (!updatedPerson.getInfoLink().isEmpty()) {
                person.setInfoLink(updatedPerson.getInfoLink());
            }
            if (!updatedPerson.getDopLink().isEmpty()) {
                person.setDopLink(updatedPerson.getDopLink());
            }
            if (!updatedPerson.getFavourite().isEmpty()) {
                person.setFavourite(updatedPerson.getFavourite());
            }
            if (!updatedPerson.getBiographyRead().isEmpty()) {
                person.setBiographyRead(updatedPerson.getBiographyRead());
            }
            personRepository.save(person);
        }
    }

    /* удаление человека */
    public void delete(Person person) {
        personRepository.delete(person);
    }
}