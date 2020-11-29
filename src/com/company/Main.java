/*
 * MIT License
 *
 * Copyright (c) 2020 Ivan Valentinov Bozhanin
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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
