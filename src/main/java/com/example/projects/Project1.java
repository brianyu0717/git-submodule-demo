package com.example.projects;

public class Project1 {
    public static void main(String[] args) {
        System.out.println("Hello from project1");
        System.out.println(Project2.printFromProject2());
    }

    public static String printFromProject1(){
        return "hi from project 1";
    }
}