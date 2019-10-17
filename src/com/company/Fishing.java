package com.company;

import com.company.enums.Complexity;

public class Fishing extends Hobby {
    float biggestFish;
    float rodLenght;

    public Fishing(String name, Complexity complexity, float timeToLearn, float biggestFish, float rodLenght) {
        super(name, complexity, timeToLearn);
        this.biggestFish = biggestFish;
        this.rodLenght = rodLenght;
    }

    public float getBiggestFish() {
        return biggestFish;
    }

    public void setBiggestFish(float biggestFish) {
        this.biggestFish = biggestFish;
    }

    public float getRodLenght() {
        return rodLenght;
    }

    public void setRodLenght(float rodLenght) {
        this.rodLenght = rodLenght;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "Name='" + super.getName() + '\'' +
                ", complexity=" + super.getComplexity() +
                ", TimeToLearn=" + super.getTimeToLearn() +
                ", Biggest fish=" + biggestFish +
                ", Rod lenght=" + rodLenght +
                '}';
    }
}
