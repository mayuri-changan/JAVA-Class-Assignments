package com.abc.recruitment;

import java.util.ArrayList;

public class StudentSkill {
    ArrayList<String> skills = new ArrayList<>();

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public void removeSkill(String skill) {
        skills.remove(skill);
    }

    public boolean hasSkill(String skill) {
        return skills.contains(skill);
    }

    public String toString() {
        return skills.toString();
    }
}
