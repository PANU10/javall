package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i;
        int[] numeros = new int[5];
        int p = 0;
        int n = 0;
        int c = 0;
        int mediap = 0;
        int median = 0;
        Scanner teclado = new Scanner(System.in);

        for(i=0; i<numeros.length; i++)
        {
            System.out.println("Introduzca un valor: ");
            numeros[i] = teclado.nextInt();

            if(numeros[i] > 0) {
                p++;
                mediap = mediap + numeros[i];
            }else if(numeros[i] < 0){
                n++;
                median = median + numeros[i];
            }else if(numeros[i] == 0){
                c++;
            }


        }
        System.out.println("Hay "+p+" numeros positivos.");
        System.out.println("Hay "+n+" numeros negativos.");
        System.out.println("Hay "+c+" numeros ceros.");
        System.out.println("Media de los numeros positivos són "+mediap / p);
        System.out.println("Media de los numeros positivos són "+median / n);

    }

}
