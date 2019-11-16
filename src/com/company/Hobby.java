package com.company;

import com.company.enums.Complexity;

import java.util.Objects;

public abstract class Hobby implements Comparable<Hobby> {
    private String name;
    private Complexity complexity;
    private float timeToLearn;

    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(String name, Complexity complexity,float timeToLearn) {
        this.name = name;
        this.complexity = complexity;
        this.timeToLearn = timeToLearn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Complexity getComplexity() {
        return complexity;
    }

    public void setComplexity(Complexity complexity) {
        this.complexity = complexity;
    }

    public float getTimeToLearn() {
        return timeToLearn;
    }

    public void setTimeToLearn(float timeToLearn) {
        this.timeToLearn = timeToLearn;
    }

    @Override
    public abstract String toString();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hobby hobby = (Hobby) o;
        return Float.compare(hobby.timeToLearn, timeToLearn) == 0 &&
                Objects.equals(name, hobby.name) &&
                complexity == hobby.complexity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, complexity, timeToLearn);
    }

    @Override
    public int compareTo(Hobby o) {
        return name.compareTo(o.name);
    }
}