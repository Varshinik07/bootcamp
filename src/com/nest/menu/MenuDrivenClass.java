package com.nest.menu;
import java.util.Scanner;
public class MenuDrivenClass {
    public static void main(String[] args) {
        System.out.println("Menu driven");
        int choice;
        while(true){
            System.out.println("select an option");
            System.out.println("1. add student");
            System.out.println("2. search student");
            System.out.println("3. delete  student");
            System.out.println("4. view all student");
            System.out.println("5. Exit");
            Scanner scanner=new Scanner(System.in);
            choice=scanner.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("add student selector");
                    break;
                case 2:
                    System.out.println("search student selector");
                    break;
                case 3:
                    System.out.println("delete student selector");
                    break;
                case 4:
                    System.out.println("view all student selector");
                    break;
                case 5:
                    System.out.println("exit status selector");;
            }
        }
    }
}
