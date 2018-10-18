package com.company;

public class Person {
    private String name;
    private boolean likesFrenchFries;
    private boolean sleep;
    private boolean adventurous;

    public Person() {
    }

    public Person(String name, boolean likesFrenchFries, boolean sleep, boolean adventurous) {
        this.name = name;
        this.likesFrenchFries = likesFrenchFries;
        this.sleep = sleep;
        this.adventurous = adventurous;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLikesFrenchFries() {
        return likesFrenchFries;
    }

    public void setLikesFrenchFries(boolean likesFrenchFries) {
        this.likesFrenchFries = likesFrenchFries;
    }

    public boolean isSleep() {
        return sleep;
    }

    public void setSleep(boolean sleep) {
        this.sleep = sleep;
    }

    public boolean isAdventurous() {
        return adventurous;
    }

    public void setAdventurous(boolean adventurous) {
        this.adventurous = adventurous;
    }

}

