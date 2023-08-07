import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String country;
    private String city;

    public Person(String name, int age, String gender, String country, String city) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.country = country;
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public static void printAll(Person[] people) {
        System.out.println("All people:");
        for (Person person : people) {
            System.out.println(person);
        }
    }


    public static Person getMaxAgePerson(Person[] people) {
        Person person = people[0];
        for (int i = 1; i < people.length; i++) {
            if (people[i].age > person.age) {
                person = people[i];
            }
        }
        return person;

    }
    public static ArrayList<Person> getPersonByFemale(Person [] people) {
ArrayList<Person> femalePeople = new ArrayList<>();
        for (Person person : people) {
            if (person.getGender().equals("Female")){
                femalePeople.add(person);
            }

        }return femalePeople;
    }


    public static ArrayList<Person> getPersonByMale(Person[] people) {
        ArrayList<Person> malePeople = new ArrayList<>();
        for (Person person : people) {
            if (person.getGender().equals("Male")) {
                malePeople.add(person);
            }
        }
        return malePeople;
    }

    @Override
    public String toString() {
        return "\n"+"Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
