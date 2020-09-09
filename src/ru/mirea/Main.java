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
	System.out.print("Это сумма:" + s);
	System.out.println();
    
	//Задача 1.4

	for(String i : args) {
	   System.out.println("Принятый аргумент:" + i); 
	}

	//Задача 1.5
	
	for (int i = 1; i < 11; i++) {
	    System.out.println("Член гармонического ряда:" + 1./i); 
	}

  	//Задача 1.6
	for (int i = 0; i < 10; i++) {
	   System.out.printf("Случайное число:" + "%.0f\n",Math.random()*10);
         }


	//Задача 1.7
	factorCalc(3);
	//sayHello("Слава");


    }
    
    //Метод для задачи 1.7
    public static void factorCalc(int num) {
	 int res = 1;
	 int i = 1;
	 for(i = 1; i <= num; i++ ) { res*= i; }
	 System.out.println(res);
	}

			/*public static void sayHello(String name) {
				System.out.println("Привет, " + name);
			}*/
    	//Задача 1.8 решалась так: git commit Main.java -m "Текст коммита"
	//git push origin main, где origin это - git@github.com:Panikowsky-M/FirstProjectIKBO1919
  }
