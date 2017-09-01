package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        1.
//        a. Object Oriented: All things in jave treated as an object;
//        b. Multithreaded: capable of multi tasking;
//        c. Portable: they can run in many platform without recompiled

//        2.;
//        garbage colection is a pointer that is not being used again
//        3.;
//        there are 8
//                int: number;
//                float: number with a point;
//                boolean: true or false;
//                byte: very small number in range -127 to 128
//                char: single ASCII code;
//                short: small number in range -32767 to 32768
//                long: very large number;
//                double: large float
//        4.;
          int[] bilangan =  new int[10] ;
//        5.;
        int a = 7;    // 11
        int b = a++;  // 7
        int c = ++a;  // 11
        String x =  String.format("%o %o %o",a,b,c);
        System.out.println(x);
//        6.
        int bilang = 5;
        int angan = 2;
        if (bilang == 0){
            System.out.println(0);
        }else {
            for (int i = 0; i < bilang; i++) {
                angan *= 2;
            }
            System.out.println(angan);
        }
//        7.
        int panjangArray = 3;
        int[] arr = new int[panjangArray];
        arr[0] = 3;
        arr[1] = 23;
        arr[2] = 42;
        int low = arr[0];
        int jum =  arr[0];
        for (int i = 1; i < panjangArray ; i++) {
            if (arr[i]<low){
                low = arr[i];
            }
            jum += arr[i];
        }
        System.out.println(jum);
    }
}
