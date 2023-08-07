import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25, "Female", "USA", "New York");
        Person person2 = new Person("Bob", 30, "Male", "Canada", "Toronto");
        Person person3 = new Person(" Carol", 22, "Female", "UK", "London");
        Person person4 = new Person("David", 40, "Male", "Australia", "Sydney");
        Person person5 = new Person("Eva", 28, "Female", "Germany", "Berlin");


        Person person6 = new Person("", 0, "", "", "");
        person6.setName("Frank");
        person6.setAge(35);
        person6.setGender("Male");
        person6.setCountry("France");
        person6.setCity("Paris");

        Person person7 = new Person("", 0, "", "", "");
        person7.setName("Grace");
        person7.setAge(29);
        person7.setGender("Female");
        person7.setCountry("Italy");
        person7.setCity("Rome");

        Person person8 = new Person("", 0, "", "", "");
        person8.setName("Henry");
        person8.setAge(33);
        person8.setGender("Male");
        person8.setCountry("Spain");
        person8.setCity("Madrid");

        Person person9 = new Person("", 0, "", "", "");
        person9.setName("Ivy");
        person9.setAge(27);
        person9.setGender("Female");
        person9.setCountry("Japan");
        person9.setCity("Tokyo");

        Person person10 = new Person("", 0, "", "", "");
        person10.setName("John");
        person10.setAge(31);
        person10.setGender("Male");
        person10.setCountry("Brazil");
        person10.setCity("Rio de Janiero");

        Person[] people = {person1, person2, person3, person4, person5, person6, person7, person8, person9, person10};
        Person.printAll(people);
        System.out.println("---------------------------------------------------------------------------");

        Person oldest = Person.getMaxAgePerson(people);
        System.out.println("the oldest people: \n"+oldest);
        System.out.println("----------------------------------------------------------------------------");

        ArrayList<Person> genderF = Person.getPersonByFemale(people);
        System.out.println("Female: "+genderF);
        System.out.println("-----------------------------------------------------------------------------");

        ArrayList<Person> genderM = Person.getPersonByMale(people);
        System.out.println("Male: "+genderM);

    }
}