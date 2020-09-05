package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    //    public static void main(String[] args) {
//        System.out.println(args[0]);
//        double num = Math.random();
//        String message = String.format("the num is : %.2f", num);
//        System.out.println(message);
//        Random random = new Random(12);
//        System.out.println(random.nextBoolean());
//        System.out.println(myMeth(12, 3));
//    }
//
//    static int myMeth(int a, int b){
//        return a+b;
//    }
//    public static void main(String[] args) {
//        int count1 = 0, count2 = 0, count3 = 0;
//        int[] arr = new int[10];
//        Random random = new Random(1);
//        for (int i = 0; i < 10; i++) {
//            arr[i] = random.nextInt(10);
//        }
//        for (int j : arr) {
//            count1 = count1 + j;
//        }
//        for (int k : arr) {
//            System.out.println(arr[k]);
//        }
//        System.out.println(count1);
//
//        int b = 0;
//        while(b < arr.length){
//            count2 = count2+arr[b];
//            b++;
//        }
//        System.out.println(count2);
//
//        int c = 0;
//        do{
//            count3 = count3+arr[c];
//            c++;
//        } while(c<arr.length);
//        System.out.println(count3);
//    }
//    public static void main(String[] args) {
//        for (String line : args) {
//            System.out.println(line);
//        }
//    }
//        public static void main(String[] args) {
//            int count = 0, k;
//            double g_r;
//            for(k = 1; k<=10; k++){
//                g_r = 1.0/k;
//                String g_rs = String.format("%.2f", g_r);
//                System.out.println(g_rs);
//            }
//        }
//    public static void main(String[] args) {
//        int arr[] = new int[10];
//        int change;
//        Random random = new Random(1);
//        for (int i = 0; i < 10; i++) {
//            arr[i] = random.nextInt(10);
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println(arr[i]);
//        }
//
//        System.out.println("\n");
//
//        boolean sorted = false;
//        int temp;
//        while (!sorted) {
//            sorted = true;
//            for (int i = 0; i < arr.length - 1; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                    sorted = false;
//                }
//            }
//        }
//        for(int i = 0; i<10; i++) {
//            System.out.println(arr[i]);
//        }
//    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(fac(num));
    }

    public static int fac(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f = f * i;
        }
        return f;
    }
}


