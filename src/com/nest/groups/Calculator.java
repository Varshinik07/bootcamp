package com.nest.groups;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("calculator");
        int a=30,b=20;
        int choice;
        while(true){
            System.out.println("select an option");
            System.out.println("1.addition");
            System.out.println("2.subtraction");
            System.out.println("3.multiplication");
            System.out.println("4.division");
            System.out.println("5.exit");
            Scanner scanner=new Scanner(System.in);
            choice=scanner.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println(a+b);
                    break;
                case 2:
                    System.out.println(a-b);
                    break;
                case 3:
                    System.out.println(a*b);
                    break;
                case 4:
                    System.out.println(a/b);
                    break;
                case 5:
                    System.exit(0);


            }
        }
    }
}
