package main.java.windpark;

import org.springframework.data.annotation.Id;

public class Windengine {

    @Id
    public String id;

    public String firstName;
    public String lastName;

    public Windengine() {}

    public Windengine(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

}

