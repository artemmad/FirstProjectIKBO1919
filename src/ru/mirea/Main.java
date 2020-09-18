package ru.mirea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


		//Задача 1.3
		int sum = 0;
		int[] mass13 = {1,2,3,4};
		for(int i : mass13){
			summ+=i;
		}
		System.out.println("Cумма чисел:" + sum);


		//Задача 1.4

	for(String g : args) {
	   System.out.println("Принятый аргумент:" + g);
	}

	//Задача 1.5
	
	for (int k = 1; k < 11; k++) {
	    System.out.println("Член гармонического ряда:" + 1./k);
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
	 int result= 1;
	 int n = 1;
	 for(n = 1; n <= num; n++ ) { result*= n; }
	 System.out.println(result);
	}
//Задача 1.8 решалась путем загрузки исходного кода в репозиторий командой
	//Git Push Origin Main
		  }
