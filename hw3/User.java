package hw_3;

import java.util.List;

public class User {

    private String givenName;
    private String sureName;



    public User(String givenName, String sureName) {
        this.givenName = givenName;
        this.sureName = sureName;

    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }
}
