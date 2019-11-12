package com.company.Hobbyes;

import com.company.Hobby;
import com.company.enums.Complexity;
import com.company.enums.WorkFoot;

public class Football extends Hobby {
    String type;
    WorkFoot workFoot;

    public Football(String name, Complexity complexity, float timeToLearn, String type, WorkFoot workFoot) {
        super(name, complexity, timeToLearn);
        this.type = type;
        this.workFoot = workFoot;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "Name='" + super.getName() + '\'' +
                ", complexity=" + super.getComplexity() +
                ", TimeToLearn=" + super.getTimeToLearn() +
                ", Type=" + type +
                ", Work Foot=" + workFoot +
                '}';
    }
}
