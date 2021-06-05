package com.company;

import java.util.Scanner;
// abstract classes are used to give us the contours of the objects
// so we can assign different values/codes to its different properties in different subclasses
// we can keep some properties fixed (the properties which would be same for all the subclasses)
// let us understand this with and example -- consider you made and abstract class phones
// -- the properties that you want to be fixed will be -- lets say weight, -- metal body etc
// -- the properties(or methods) that you want to differ according to your phones are -- let's say camera, --processor
// so such properties would be kept in abstract methods

abstract class four_sided_shapes{
    // if you don't want to declare this class abstract so simply remove extract method
    int dimension1;
    int dimension2;
    public four_sided_shapes(int dimension1,int dimension2){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the shape! ");
        String ans = scan.next();
    }
    public int getDimension1() {
        return dimension1;
    }
    public void setDimension1(int dimension1) {
        this.dimension1 = dimension1;
    }
    public int getDimension2() {
        return dimension2;
    }
    public void setDimension2(int dimension2) {
        this.dimension2 = dimension2;
    }
    public int getPerimeter(){
        return 2*(dimension2 + dimension1);
    }
    abstract public int getArea();
}
class square extends four_sided_shapes{
    public square(int dimension1, int dimension2) {
        super(dimension1, dimension2);
    }
    @Override
    public int getArea(){
        return dimension1 * dimension2;
    }
}

public class cwh_abstract_ch10 {
    public static void main(String[] args) {
        square obj = new square(12, 12);
        System.out.println(obj.getArea());
        }
    }
}
