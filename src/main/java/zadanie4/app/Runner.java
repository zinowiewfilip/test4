package zadanie4.app;

import zadanie4.models.Person;
import zadanie4.services.PersonService;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        PersonService personService = new PersonService();

        List<Person> people = List.of(
                new Person("Kamil", "Kowalski", "Warszawa", 20),
                new Person("Kamila", "Kowalska", "Poznan", 30),
                new Person("Dariusz", "Nowak", "Łódź", 40),
                new Person("Patrycja", "Wasilewska", "Warszawa", 18)
        );

        System.out.println(personService.getOldestWomen(people));
        System.out.println(personService.getAvgAge(people));
        System.out.println(personService.getAvgMaleAge(people));
        System.out.println(personService.getAvgFemaleAge(people));
        System.out.println(personService.getAvgAgeDependsOnSex(people));
        System.out.println(personService.getCityWithTheMostPeople(people));
        System.out.println(personService.getDifferentCities(people));
    }
}
