package com.epamtask3;
import java.util.*;
public class Calculator {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a,b values:\n");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("Select an operator to perform operation on given values (+, -, *, /): ");
        char c=s.next().charAt(0);
        switch(c)
        {
            case '+': sum add=new sum();
                      add.calculate(a,b);
                      break;
            case '-': minus m=new minus();
                      m.calculate(a,b);
                      break;
            case '*': multiply mul=new multiply();
                      mul.calculate(a,b);
                      break;
            case '/': divide div=new divide();
                      div.calculate(a,b);
                      break;
        }

    }
}
