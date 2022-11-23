package zadanie4.models;

public class Person {
    private String name;
    private String lastName;
    private String city;
    private int age;

    public Person(String name, String lastName, String city, int age) {
        this.name = name;
        this.lastName = lastName;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }
}
