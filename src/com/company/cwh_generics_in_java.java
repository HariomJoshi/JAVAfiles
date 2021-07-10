package com.company;

// making our own generic class
class myGeneric<T1, T2>{
    int val;
    private T1 t1;
    private T2 t2;

    myGeneric(int val, T1 t1, T2 t2){
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    // getter and setter for val
    public void setVal(int val){
        this.val = val;
    }
    public int getVal(){
        return val;
    }

    // getter and setter for T1
    public void sett1(T1 value){
        T1 t1 = value;
    }
    public T1 gett1(){
        return t1;
    }

    //getter and settter for T2
    public void sett2(T2 value){
        T2 t2 = value;
    }
    public T2 gett2(){
        return t2;
    }


}
public class cwh_generics_in_java {
    public static void main(String[] args) {
        myGeneric<String, Integer> g1 = new myGeneric(21, "My string", 23);
        g1.sett1("Something ");
        System.out.println(g1.gett1());
        g1.sett2(21);
        System.out.println(g1.gett2());
    }
}
