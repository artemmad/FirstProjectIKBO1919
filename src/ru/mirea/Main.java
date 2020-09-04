package ru.mirea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //////////////TASK1//////////////////////
        Scanner scanner = new Scanner(System.in);

        //примитивные типы данных
        int a = 10;//4 байта
        float b = 20.7f; // 8-16 байта
        boolean c = false; //1 байт

        a = (int) b;
        b = a;

        // обьектные/ссылочные типы
        int[] d = new int[10];
        String string = new String("");
        String string2 = scanner.nextLine();
        String string3 = "dwadwadwa";

        String[] stringArray = string2.split("  ");

        for(String v : stringArray ){
            System.out.println(v);
        }

        int[] mass = new int[10];
        int[] mass2 = {1,2,3,4,5,6,78,8};

        for(int i = 0; i < mass2.length; i++){
            mass2[i]+=1;
            System.out.println(mass2[i]);
        }

        for(int v : mass2){
            System.out.println(v +  "   второй массив");
        }

        //////////////PRAKT 2//////////////////////






    }
}
