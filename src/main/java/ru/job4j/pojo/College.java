package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Jon Jonson Jons ");
        student.setGroup("first");
        student.setEntraceDate("2024");

        System.out.println(student.getFio() + " in group- " + student.getGroup() + " since  " + student.getEntraceDate());
    }
}