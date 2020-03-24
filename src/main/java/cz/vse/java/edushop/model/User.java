package cz.vse.java.edushop.model;

public class User {
    private String name;
    private String lastname;

    public User(final String name, final String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }
}
