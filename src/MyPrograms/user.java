package MyPrograms;

public class user {
    String name;
    String surename;
    int age;

    user(String na, String su, int ag) {
        name = na;
        surename = su;
        age = ag;
    }

    void days(int a) {
        a = age;
        int d = age * 365;
        System.out.println("օրական. " + d);
    }

    void months(int a) {
        a = age * 12;
        System.out.println("ամսեկան. " + a);
    }

}
