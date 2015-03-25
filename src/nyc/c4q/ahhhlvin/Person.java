package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/24/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class Person {

    private String name;
    private String phoneNumber;
    private String city;

    public void Person() {
    }

    public void Person(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
