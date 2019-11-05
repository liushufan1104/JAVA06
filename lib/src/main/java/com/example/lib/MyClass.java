package com.example.lib;
import java.util.Scanner;
public class MyClass {
    public static void main ( String[] args ) {
        int Ly=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Year of the West");
        Ly = scanner.nextInt();
        if(Ly%4!=0)
            System.out.print("leap year:no");
        else if(Ly%100!=0)
            System.out.print("leap year:yes");
        else if(Ly%400!=0)
            System.out.print("leap year:no");
        else
            System.out.print("leap year:yes");
    }
}