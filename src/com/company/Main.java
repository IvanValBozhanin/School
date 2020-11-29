package com.company;

import com.company.entities.Student;
import com.company.entities.Teacher;
import com.company.entities.Team;

import java.time.LocalDate;


//======OESR======

public class Main {

    public static void main(String[] args) {
        int [][] g = {{3,5,6, 7, 5}, {5,3,7, 10, 4}, {9,8,6, 4,9}};
        Student s1 = new Student("Ivan", g);
        System.out.println(s1.getAverage0());
        System.out.println(s1.getAverage1());
        System.out.println(s1.getAverage2());

        Teacher th1 = new Teacher("Peter");
        th1.setSubjects(new String[]{"Mathematics", "Informatics", "Physics"});


        Team tm1 = th1.createTeam("Mathematics");
        System.out.println(tm1.createAppointment(LocalDate.of(2021, 1, 7)));
        System.out.println(tm1.writeNewPost("Homework dismissed for the next time!"));
    }
}
