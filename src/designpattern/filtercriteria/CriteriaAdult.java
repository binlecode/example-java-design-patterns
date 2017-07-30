package sample.designpattern.filtercriteria;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 8/25/13
 * Time: 10:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class CriteriaAdult implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> adultPersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (18 <= person.getAge()) {
                adultPersons.add(person);
            }
        }
        return adultPersons;
    }
}
