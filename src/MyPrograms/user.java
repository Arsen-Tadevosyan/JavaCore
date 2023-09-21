package MyPrograms;

public class user {
    String name;
    String surename;
    String profession;
   String salary;
    int age;

    user(String na, String su, String pr, int ag, String sl) {
        name = na;
        surename = su;
        profession = pr;
        age = ag;
        salary = sl;
    }

    void days(int a) {
        a = age;
        int d = age * 365;
        System.out.println("օրական. " + d);
    }

    void months(int a) {
        a = age * 12;
        System.out.println("ամսական. " + a);


    }

}
