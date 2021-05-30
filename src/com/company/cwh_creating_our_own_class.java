package com.company;

//question 1
// class named employee and some of its attributes
/*class employe{
    int num;
    String name;
    int employee_id;
    public void printdetails(){
        System.out.println("My name is "+ name);
        System.out.println("and my employee id is "+ employee_id);
    }
}
public class cwh_creating_our_own_class {
    public static void main(String[] args) {
        System.out.println("This class is created by me: ");
        employe hariom = new employe(); // instantiating a new employee object , memory allocation occur at this point
        // setting attributes
        hariom.employee_id = 1;
        hariom.name = "Hariom Joshi";
        hariom.num = 1;
        hariom.printdetails();
        // similarly as above we can do for other employees also
        employe piyush = new employe();
        piyush.employee_id = 2;
        piyush.name = "Piyush Joshi";
        piyush.num = 2;
        piyush.printdetails();
    }
}*/

// Question 3
// creating a class square with method to initialize its side, finding area, finding perimeter

/*class square{         // class created
    int side;             //declaration
    int area;
    int perimeter;
    public int initialize(){       //method to
        return side = 20;
    }
    public int getArea(){           // method to get area
        return area = side*side;
    }
    public int getPerimeter(){         // Method to get perimeter
        return perimeter = 4* side;
    }
}
public class cwh_creating_our_own_class {
    public static void main(String[] args) {
        square number1 = new square();
        number1.initialize();
        System.out.println(number1.getArea());
    }
}*/

//question 5
// character tpmmyVacetti and some methods to hit, run and fire

/*
class TommyVacetti{
    String reaction; // will print null if no value is given to reaction
    public String hit(){
        reaction = "Hitting";
        return reaction;
    }
    public String run(){
        reaction = "Running";
        return reaction;
    }
    public String fire(){
        reaction = "Firing";
        return reaction;
    }
}
public class cwh_creating_our_own_class {
    public static void main(String[] args) {
        TommyVacetti character = new TommyVacetti();
        System.out.println(character.fire());
        System.out.println(character.run());
        System.out.println(character.hit());
    }
}
*/

// question 6
// repeat 4 for circle i.e. find area, perimeter etc

/*
class  circle{
    int radius;
    public int findPerimeter(){
        return 2* (22/7) * radius;
    }
    public int findArea(){
        return (22/7) * radius * radius;
    }
}
public class cwh_creating_our_own_class {
    public static void main(String[] args) {
        circle lawn = new circle();
        lawn.radius = 12;
        System.out.println(lawn.findPerimeter());
        System.out.println(lawn.findArea());
    }
}
*/

// completed all the questions, I have not done similar question because i find them not very useful
