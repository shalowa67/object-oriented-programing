package com.oop;

public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        updateGrade(grade);
    }

    public void updateGrade(int newGrade) {
        if (newGrade < 0) {
            this.grade = 0;
        } else if (newGrade > 100) {
            this.grade = 100;
        } else {
            this.grade = newGrade;
        }
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}
