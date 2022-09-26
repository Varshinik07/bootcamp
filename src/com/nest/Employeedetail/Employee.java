package com.nest.Employeedetail;
import java.util.Scanner;
public class Employee {
    public static void main(String[] args) {
        System.out.println("select an option");
        int choice;
        while(true){
            System.out.println("1.select employee");
            System.out.println("2.view all employee");
            System.out.println("3.exit employee");
            Scanner scanner=new Scanner(System.in);
            choice=scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("select employee");
                    break;
                case 2:
                    System.out.println("view all employee");
                    break;
                case 3:
                    System.exit(0);
            }

        }
    }
}
