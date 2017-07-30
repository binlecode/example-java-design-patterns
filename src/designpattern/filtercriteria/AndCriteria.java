package sample.designpattern.filtercriteria;

import java.util.List;

/**
 * This is kind of a meta-criteria which is based on other criteria.
 * It implements the same {@link sample.designpattern.filtercriteria.Criteria}
 * interface so can be used the same way as other criteria.
 * This is a common way of clustering criteria, which is a cluster of criteria
 * by some grouping logic.
 * @see {@link sample.designpattern.filtercriteria.OrCriteria}
 */
public class AndCriteria implements Criteria {
    private Criteria c1, c2;

    public AndCriteria(Criteria c1, Criteria c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return c2.meetCriteria(c1.meetCriteria(persons));
    }
}
