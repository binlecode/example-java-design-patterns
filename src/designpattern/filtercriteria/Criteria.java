package sample.designpattern.filtercriteria;

import java.util.List;

/**
 * This is the working unit of filtering chain.
 * Its method signature has idential input and output type, which suggests the
 * concatenating usage pattern.
 */
public interface Criteria {

    public List<Person> meetCriteria(List<Person> persons);

}
