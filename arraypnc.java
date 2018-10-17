package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i;

        int p = 0;
        int n = 0;
        int c = 0;
        int mediap = 0;
        int median = 0;
        int nmayor;
        int nmenor;
        int rmayor = 0;
        int rmenor = 0;




        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un núemor de exec: ");
        int l = teclado.nextInt();
        int [] numeros = new int[l];

        for(i=0; i<numeros.length; i++) {
            System.out.println("Introduzca un valor: ");
            numeros[i] = teclado.nextInt();
        }


        for(i=0; i<numeros.length; i++) {

            if (numeros[i] > 0) {
                p++;
                mediap = mediap + numeros[i];

            } else if (numeros[i] < 0) {
                n++;
                median = median + numeros[i];


            } else if (numeros[i] == 0) {
                c++;
            }

        }

        nmayor=numeros[1];
        nmenor=numeros[1];

        for(i=0; i<numeros.length; i++) {
            if (numeros[i] > nmayor) {
                nmayor = numeros[i];
                rmayor = 0;
            }
            if (numeros[i] == nmayor) {
                rmayor++;
            }
            if (numeros[i] < nmenor) {
                nmenor = numeros[i];
                rmenor = 0;
            }
            if (numeros[i] == nmenor) {
                rmenor++;
            }
        }
        System.out.println("Hay "+p+" numeros positivos.");
        System.out.println("Hay "+n+" numeros negativos.");
        System.out.println("Hay "+c+" numeros ceros.");
        System.out.println("Media de los numeros positivos són "+mediap / p);
        System.out.println("El número mayor és : "+nmayor);
        System.out.println("El número menor és : "+nmenor);
        System.out.println("El número mayor repetido és : "+rmayor);
        System.out.println("El número menor repetido és : "+rmenor);
        System.out.println("Media de los numeros positivos són "+median / n);

    }

    }



