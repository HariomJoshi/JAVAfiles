package com.company;

/**
 * This class has been made just ot demonstrate the dags in javadocs
 *@version 0.1
 * @author Hari
 * @since 2002
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html">java docs</a>
 */
public class cwh_tagsInJavaClass {
    /**
     * This method is used to <B>Add</B> two numbers
     * @param a takes two integers as an input
     * @param b Adds both
     * @return returns sum of both the numbers
     * @throws Exception
     * @deprecated this method has been deprecated please use another method
     */
    // we can also add html in the comments
    public int add(int a , int b) throws Exception{
        if (a ==1){
            throw new Exception();
        }
        int sum;
        sum = a + b;
        return sum;

    }
    public static void main(String[] args) throws Exception {
        cwh_tagsInJavaClass tg = new cwh_tagsInJavaClass();
        System.out.println(tg.add(21, 32));
    }
}
