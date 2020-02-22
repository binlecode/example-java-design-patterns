package sample.designpattern.filtercriteria;

import java.util.ArrayList;
import java.util.List;

/**
 * And OR logic based group criteria.
 * @see {@link sample.designpattern.filtercriteria.AndCriteria}
 */
public class OrCriteria implements Criteria {
    private Criteria c1, c2;

    public OrCriteria(Criteria c1, Criteria c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> persons1 = c1.meetCriteria(persons);
        List<Person> persons2 = c2.meetCriteria(persons);
        for (Person p : persons2) {
            if (!persons1.contains(p)) {
                persons1.add(p);
            }
        }
        return persons1;
    }
}
