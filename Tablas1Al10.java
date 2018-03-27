package tablas.pkg1.al.pkg10;
// Mostrar por la pantalla las tablas de mutiplicación del 1 al 10
/**
 *
 * @author Pratik
 */
public class Tablas1Al10 {

 
    public static void main(String[] args) {
        int mult;
        for (int a = 1; a <= 10; a++){
           for (int j = 1; j <= 10; j++){
           
               mult = a * j;
               System.out.println(+a+" * "+j+" = "+mult);

           }
        System.out.println(" ...............................................................................");
        }
    }
    
}
