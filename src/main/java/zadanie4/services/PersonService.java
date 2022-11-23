package zadanie4.services;

import zadanie4.models.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class PersonService {
    Person person;

    public Person getOldestWomen(List<Person> people) {
        Optional<Person> result = people.stream()
                .filter(x -> x.getName().endsWith("a"))
                .max(Comparator.comparingInt(x -> x.getAge()));
        return result.orElseThrow();
    }

    public int getAvgAge(List<Person> people) {
        double avgAge = people.stream()
                .mapToDouble(Person::getAge)
                .average()
                .getAsDouble();
        return (int) avgAge;
    }

    public int getAvgMaleAge(List<Person> people) {
        double avgAge = people.stream()
                .filter(x -> !x.getName().endsWith("a"))
                .mapToDouble(Person::getAge)
                .average()
                .getAsDouble();
        return (int) avgAge;
    }

    public int getAvgFemaleAge(List<Person> people) {
        double avgAge = people.stream()
                .filter(x -> x.getName().endsWith("a"))
                .mapToDouble(Person::getAge)
                .average()
                .getAsDouble();
        return (int) avgAge;
    }

    public String getAvgAgeDependsOnSex(List<Person> people) {
        List<Person> females = people.stream()
                .filter(x -> x.getName().endsWith("a"))
                .collect(Collectors.toList());
        List<Person> males = people.stream()
                .filter(x -> !x.getName().endsWith("a"))
                .collect(Collectors.toList());
        int femaleAvgAge = (int) females.stream()
                .mapToDouble(Person::getAge)
                .average()
                .getAsDouble();
        int maleAvgAge = (int) males.stream()
                .mapToDouble(Person::getAge)
                .average()
                .getAsDouble();
        return "Male: " + maleAvgAge + " Female: " + femaleAvgAge;
    }

    public String getCityWithTheMostPeople(List<Person> people) {
        Map.Entry<String, Long> result = people.stream()
                .collect(Collectors.groupingBy(x -> x.getCity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();


        return result.getKey();
    }

    public List<String> getDifferentCities(List<Person> people) {
        List<String> result = people.stream()
                .collect(Collectors.groupingBy(x -> x.getCity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .map(x -> x.getKey())
                .collect(Collectors.toList());
        return result;
    }

}
