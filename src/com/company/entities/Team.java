package com.company.entities;

import java.time.LocalDate;

public class Team {
    private String name;
    private Teacher teacher;
    private Student[] students;
    private int numOfStudents;

    public Team() {
        students = new Student[30];
    }

    public Team(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
        students = new Student[30];
    }

    public Team(String name, Teacher teacher, Student[] students) {
        if(students.length > 30){
            throw new IllegalArgumentException("Cannot have more than 30 students!");
        }
        this.name = name;
        this.teacher = teacher;
        this.students = students;
        numOfStudents = students.length;
    }

    public void addStudent(Student student){
        if(numOfStudents == 30){
            throw new IllegalArgumentException("Cannot add another student!");
        }
        Student [] t = new Student[this.students.length + 1];
        int i=0;
        for(;i<this.students.length; ++ i){
            t[i] = this.students[i];
        }
        t[i] = student;
        this.students = t;
    }

    public String createAppointment(LocalDate date){
        return "Meeting for this date: "+date.toString() + " was created!";
    }

    public String writeNewPost(String text){
        return this.name + ", "
                + this.teacher.getName() + ", "
                + text;
    }
}
