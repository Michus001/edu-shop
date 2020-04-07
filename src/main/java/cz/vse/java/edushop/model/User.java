package cz.vse.java.edushop.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User {
    @GeneratedValue
    @Id
    private Long id;
    private String name;
    private String lastname;
    private String hairColor;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(final String lastname) {
        this.lastname = lastname;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(final String hairColor) {
        this.hairColor = hairColor;
    }
}
