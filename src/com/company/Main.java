package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        int m = scn.nextInt();
        if (m == 12 || m == 1 || m == 2){
            System.out.println("winter");
        }else if (m>=3 && m<=5){
            System.out.println("spring");
        }else if (m>=6 && m<=8){
            System.out.println("summer");
        }else if (m>=9 && m<=11){
            System.out.println("autumn");
        }
    }
}
