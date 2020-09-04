package ru.mirea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);

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
        }*/


	//Задача 1.3
	int s = 0;
	int[] ar13 = {1,2,3,4};
	for(int i : ar13){
	   s+=i;
	}
	System.out.print(s);
	System.out.println();
    }
}
