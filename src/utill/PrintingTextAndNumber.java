package utill;

import java.util.Scanner;

public class PrintingTextAndNumber {

    public static String printText(String text){
        System.out.println(text);
        Scanner sc=new Scanner(System.in);
        String print=sc.nextLine();
        return print;

    }
    public static int printNumber(String text){
        System.out.println(text);
        Scanner sc=new Scanner(System.in);
        int print=sc.nextInt();
        return print;
    }
}
