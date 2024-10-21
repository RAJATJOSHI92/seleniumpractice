package org.example;

class Classroom {
    String classname;
    String[] students;

    Classroom(String classname, String[] students) {
        this.classname = classname;
        this.students = students;
    }

    public void showdetails() {
        System.out.println("classnames are :" + classname);
        System.out.print("students are  :");
        for (String s : students) {

            System.out.print("  " + s);
        }
    }
}

public class prgm10 {
    public static void main(String[] args) {

        String[] students = {"rajat", "joshi", "rajaat"};
        Classroom cc = new Classroom("chitkara", students);
        cc.showdetails();
    }
}