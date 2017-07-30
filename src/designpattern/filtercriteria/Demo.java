package sample.designpattern.filtercriteria;

import java.util.ArrayList;
import java.util.List;

/**
 * Filters are implemented via {@link sample.designpattern.filtercriteria.Criteria} interface.
 * Criteria can be cascaded and grouped. They are typically applied to some object flow (collection).
 */
public class Demo {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Male A", "Male", "Single", 45));
        persons.add(new Person("Female O", "Female", "Married", 45));
        persons.add(new Person("Male B", "Male", "Married", 35));
        persons.add(new Person("Female P", "Female", "Single", 12));
        persons.add(new Person("Male C", "Male", "Single", 15));
        persons.add(new Person("Female Q", "Female", "Single", 25));

        Criteria criteriaMale = new CriteriaMale();
        Criteria criteriaFemale = new CriteriaFemale();
        Criteria criteriaSingle = new CriteriaSingle();
        Criteria criteriaAdult = new CriteriaAdult();

        List<Person> malePersons = criteriaMale.meetCriteria(persons);
        System.out.println("male persons:");
        printPersons(malePersons);

        List<Person> femalePersons = criteriaFemale.meetCriteria(persons);
        System.out.println("female persons:");
        printPersons(femalePersons);

        List<Person> singleMalePersons = new AndCriteria(criteriaSingle, criteriaMale).meetCriteria(persons);
        System.out.println("single male persons:");
        printPersons(singleMalePersons);

        List<Person> adultFemalePersons = new AndCriteria(criteriaAdult, criteriaFemale).meetCriteria(persons);
        System.out.println("adult female persons:");
        printPersons(adultFemalePersons);
    }

    static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    + ", Gender : " + person.getGender()
                    + ", Marital Status : " + person.getMaritalStatus()
                    + ", Age : " + person.getAge()
                    + " ]");
        }
    }

}
