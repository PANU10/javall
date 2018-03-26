package temperatura;

import java.util.Scanner;
public class Temperatura {

    public static void main(String[] args) {
        double temperatura;
        Scanner S = new Scanner(System.in);
        
        System.out.println(" Introduce la tempretura : ");
        temperatura = S.nextDouble();
        
        if(temperatura >= 30){
        System.out.println(" Hace mucho calor. ");
        }
        else if(temperatura >= 20){
        System.out.println(" Hace calor. ");
        }
        else if(temperatura >= 5){
        System.out.println(" Hace frio. ");
        }
        else if(temperatura < 5){
        System.out.println(" - Hace mucho frio. ");
        System.out.println(" - ¡Ojalá que nieva! ");
        }  
        
    }
    
}
