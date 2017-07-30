package sample.designpattern.filtercriteria;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 8/25/13
 * Time: 10:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class Person {

    String name;
    String gender;
    String maritalStatus;
    int age;

    public Person(String name, String gender, String maritalStatus, int age) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
