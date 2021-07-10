package com.company;


class random extends class2{
    @Override  // this notation is to just to say that the method has been override
    public void method3(){
        System.out.println("Something is printing boy");
    }
}
@FunctionalInterface  // this annotation is used to denote a functional interface
interface something{
    public void method();
}
public class cwh_annotations_in_java {
    @Deprecated // this annotation is used to deprecate a method
    @SuppressWarnings( "deprecation" )  // this annotation is used to remove any warnings that are due tp some reasons
    public static void randomMethod(int a ,int b){
        System.out.println("The sum of the integers is " + (a+b));
    }
    public static void main(String[] args) {
        random rn = new random();
        rn.method3();
        randomMethod(21,21);
    }
}
