
package lahoraintroducida;
import java.util.Scanner;
/**
 *
 * @author Pratik
 */
public class LaHoraIntroducida {


    public static void main(String[] args) {
      int hora,min,seg;
      Scanner S = new Scanner(System.in);
      
      System.out.println("Introduce la hora : ");
      hora = S.nextInt();
      
      System.out.println("Introduce los minutos : ");
      min = S.nextInt();
      
      System.out.println("Introduce los segundos : ");
      seg = S.nextInt();
      
      
      if (hora <= 24 && min <= 60 && seg <=60){
          seg += 1;
          
          if(seg == 60){
          min += 1;
          seg += 0; 
          }
          
          if(min == 60){
          hora += 1;
          seg = 0; 
          }
          
          if(hora == 24){
          min = 0; 
          }
      
          System.out.println("Són las "+hora+":"+min+":"+seg);
          
      }
          else{
          System.out.println("La hora introducida es incorrecta ");
      }
      }
              }
    

