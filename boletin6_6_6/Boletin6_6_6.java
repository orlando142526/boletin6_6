
package boletin6_6_6;

import java.util.Scanner;
public class Boletin6_6_6 {

   
    public static void main(String[] args) {
        // TODO code application logic here
 System.out.println("Escribe el número de ventas de un producto:");
        Scanner sc = new Scanner(System.in);
        Producto product = new Producto(sc.nextInt());
        System.out.println(product.clasificarTipo());
    }
    
}
