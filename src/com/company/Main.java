package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int choose;

        System.out.println("Введите действие: 1 - дз№7, 2 - факториал, 3 - дз№2, 4 - дз№4, 5 - дз№10, 6 - дз№5, 7 - дз№8");
        choose = in.nextInt();

        switch (choose){
            case 1:
                int k1 = 1;
                for (int i = 114; i<1000; i+=19)
                {
                    System.out.println(i);
                    k1++;
                    if(k1 == 15)
                        break;
                }
            case 2:
                int a;
                System.out.println("Введите число");
                a = in.nextInt();
                factorial(a);
                break;
            case 3:
                function();
                break;
            case 4:
                int x;
                System.out.println("Введите элемент х");
                x = in.nextInt();
                z1function(x);
                break;
            case 5:
                progression();
                break;
            case 6:
                int x1;
                System.out.println("Введите элемент х");
                x1 = in.nextInt();
                z2function(x1);
                break;
            case 7:
                numsearch();
                break;

        }
    }

    public static void factorial(int a) {
        for (int i = a-1; i > 0; i--)
            a *= i;
        System.out.println(a);

    }
    public static void function()
    {
        for (double i=1; i<6; i+=0.5)
            System.out.println(3*Math.pow(i, 2)-5);
    }
    public static void z1function(int x)
    {
        double z=0;
        int f = 1;
        for (int i=1; i<21; i++) {
            for (int j = 1; j < 6; j++) {
                f *= j;
                z += Math.pow(x, j) / f;
            }f = 1;
        }System.out.println(z);
    }
    public static void progression()
    {
        int sum=0;
        int k2=0;
        for(int i=1; i<150; i+=4)
        {
            System.out.println(i);
            sum += i;
            k2++;
            if(k2 == 10)
                break;
        }
        System.out.println("---");
        System.out.println(sum);
    }
    public static void z2function(int x1)
    {
        double z2=0;
        int f=1;
        for(int i=1; i<16; i++)
        {
            f *= i;
            z2 += (i+x1)/f;
        }
        System.out.println(z2);
    }
    public static void numsearch()
    {
        int k=0;
        for(int i=500; i<1000; i++)
        {
            if(i%13==0 || i%17==0)
            {
                System.out.println(i);
                k++;
            }
            if(k==20)
                break;
        }
    }
}
