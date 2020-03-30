package cz.vse.java.edushop.model;

public class User {
    private String name;
    private String lastname;
    private String hairColor;

    public User(final String name, final String lastname, final String hairColor) {
        this.name = name;
        this.lastname = lastname;
        this.hairColor = hairColor;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getFullName() {
        return this.name + " " + this.getLastname();
    }
}
