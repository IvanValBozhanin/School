package com.company.entities;

public class Teacher {
    private String name;
    private String[] subjects;

    public Teacher() {
        subjects = new String[5];
    }

    public Teacher(String name) {
        this.name = name;
        subjects = new String[5];
    }

    public Teacher(String name, String[] subjects) {
        if(subjects.length > 5){
            throw new IllegalArgumentException("Cannot have more than 5 subjects!");
        }
        this.name = name;
        this.subjects = subjects;
    }

    public Team createTeam(String teamName){
        return new Team(teamName, this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }
}
