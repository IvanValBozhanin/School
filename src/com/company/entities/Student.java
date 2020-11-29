package com.company.entities;

import java.util.Arrays;

public class Student {
    private String name;
    private int[][] grades;

    public Student() {
        name = "Unknown";
        grades = new int[3][5];
    }

    public Student(String name) {
        this.name = name;
        grades = new int[3][5];
    }

    public Student(String name, int[][] grades) {
        this.name = name;
        this.grades = grades;
    }

    public double getAverage0(){
        return (Arrays.stream(grades[0])
                .sum()) / 5.0;
    }

    public double getAverage1(){
        return (Arrays.stream(grades[1])
                .sum()) / 5.0;
    }
    public double getAverage2(){
        return (Arrays.stream(grades[2])
                .sum()) / 5.0;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[][] getGrades() {
        return grades;
    }

    public void setGrades(int[][] grades) {
        this.grades = grades;
    }
}
