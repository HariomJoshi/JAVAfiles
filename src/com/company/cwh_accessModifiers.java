package com.company;
// access modifiers determine whether other classes can use a particular field or invoke a particular method
// types of access modifier --> public --> private --> protected --> default (no modifier)
// tip! default is not the name of a modifier, it is the modifier which is by default if there is no access modifier

class c1{
    int x = 23;
    public int y = 21;
    private int z = 32;
    protected int xyz = 12;
    public  void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(xyz);
    }
}
public class cwh_accessModifiers {
    public static void main(String[] args) {
        c1 obj = new c1();
        obj.meth1();
    }
}
