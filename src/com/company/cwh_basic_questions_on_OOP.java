package com.company;

class employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public String setName(String second_name){
        name = second_name;
        return second_name;
    }
}
public class cwh_basic_questions_on_OOP {
    public static void main(String[] args) {
        employee tutors = new employee();
        tutors.salary = 23000;
        tutors.name = "Hariom Joshi";
        System.out.println(tutors.name);
        tutors.setName("piyush Joshi");
        System.out.println(tutors.name);
        System.out.println(tutors.getName());
        System.out.println(tutors.getSalary());
    }
}
