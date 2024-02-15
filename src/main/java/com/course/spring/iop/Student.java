package com.course.spring.iop;

public class Student {
    private String name;
    private int course;
    private double avgGrate;

    public Student(String name, int course, double avgGrate) {
        this.name = name;
        this.course = course;
        this.avgGrate = avgGrate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrate() {
        return avgGrate;
    }

    public void setAvgGrate(double avgGrate) {
        this.avgGrate = avgGrate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", avgGrate=" + avgGrate +
                '}';
    }
}
