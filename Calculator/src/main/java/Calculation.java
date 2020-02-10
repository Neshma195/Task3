package com.epamtask3;
public class Calculation {
    public int first_num;
    public int second_num;
    public void calculate(int first_num,int second_num) {
    }
}
class sum extends Calculation {
    public void calculate (int first_num,int second_num) {
        System.out.println("sum of "+first_num+" and "+second_num+" is : "+(first_num+second_num));
    }
}
class minus extends Calculation {
    public void calculate (int first_num,int second_num) {
        System.out.println("difference between "+first_num+" and "+second_num+" is : "+(first_num-second_num));
    }
}
class multiply extends Calculation {
    public void calculate (int first_num,int second_num) {
        System.out.println("multiplication of "+first_num+" and "+second_num+" is : "+(first_num*second_num));
    }
}
class divide extends Calculation {
    public void calculate (int first_num,int second_num) {
        System.out.println("division of "+first_num+" and "+second_num+" is : "+(first_num/second_num));
    }
}
