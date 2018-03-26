//While necesita poner incremento del número en {}.
//For necesita poner todos los formato o incremento en ().
package pkgwhile.y.pkgfor.basic;

/**
 *
 * @author Pratik
 */
public class WhileYForBasic {

    
    public static void main(String[] args) {
    int w = 1;
    int f;

    while (w <= 5){
    System.out.println(w+":"+" ");
    w += 1;
    
    
}
System.out.println("Estoy fuera del bucle.");

    for (f = 1; f <= 5; f += 1){
    
        System.out.println(f+":"+" ");
        }
  
    System.out.println("Estoy fuera  del for.");
    }
    
}
