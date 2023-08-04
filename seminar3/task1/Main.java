package seminar3.task1;

import seminar3.task1.IMyValue;

public class Main {
    public static void main(String[] args) {
        IMyValue value;
        IMyValue myvalue;
        IMyValue myvalue2;
        value = (m, t) -> t / m;
        //lambda
        myvalue = (x,y) -> x + y;
        myvalue2 = (z, q) -> z * q;
        System.out.println(value.getValue(5, 3));
        System.out.println(myvalue2.getValue(3,5));
        System.out.println(myvalue.getValue(2,6));
    }
}
