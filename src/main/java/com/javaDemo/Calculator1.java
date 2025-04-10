package com.javaDemo;

public class Calculator1 {


        public Calculator1()
        {
            System.out.println("Calculator() object created....");
        }

        public int add(int a, int b)
        {
            return a+b;
        }
        public int sub(int a, int b)
        {
            return a-b;
        }
        public int mul(int a, int b)
        {
            return a*b;
        }
        public int div(int a, int b)
        {
            if(b==0)
                throw new ArithmeticException();
               
            return a/b;
        }


    public static void main(String[] args) {
        Calculator1 cal= new Calculator1();
        cal.add(3,6);
        cal.sub(6,1);
        cal.mul(2,5);
        cal.div(10,5);
    }
    }



