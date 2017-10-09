package com.company;


public class Main {

    public static void main(String[] args) {

        //factorial
        // example 5! = 1*2*3*4*5
        System.out.println(fact(5));

    }

    public static Integer fact(Integer i) {

        if (i == 1) { // this means that it's the first number  - (1)
            return 1;
        } else {
            return i * fact(i - 1);  // 5 * fact(5 -1) * fact(4 -1) * fact(3- 1) * fact(2 -1) and then we go in first if
            // and we get our first number - 1
        }

    }
}
