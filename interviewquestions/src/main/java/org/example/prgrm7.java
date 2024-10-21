package org.example;

import java.util.ArrayList;

class Student {
    String name;
    String grade;
    ArrayList course;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.course = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public ArrayList getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setCourse(ArrayList course) {
        this.course = course;
    }

    public void addcourse(String newcourse) {
        course.add(newcourse);
    }

    public void removecourse(String newcourse) {
        course.add(newcourse);
    }

    public void showdetails() {
        System.out.println("name =" + name);
        System.out.println("garde =" + grade);

    }
}


public class prgrm7 {
    public static void main(String[] args) {
        Student s = new Student("rajat", "A");
        Student s1 = new Student("joshi", "B");
        s.showdetails();
        s1.showdetails();
        s.addcourse("english");
        s.addcourse("hindi");
        s.addcourse("punjabi");
        System.out.println(s.name + " has this courses :" + s.getCourse());


    }
}
