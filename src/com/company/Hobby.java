package com.company;

import com.company.enums.Complexity;

public abstract class Hobby {
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
}