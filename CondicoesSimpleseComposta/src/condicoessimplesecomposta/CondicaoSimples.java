
// Condição simples

package condicaosimples;

import java.util.Scanner;

public class CondicaoSimples {

  
    public static void main(String[] args) {
      
        Scanner teclado = new Scanner(System.in);
        System.out.println("Primeira nota");
        float n1 = teclado.nextFloat();
        System.out.println("segunda nota");
        float n2 = teclado.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Sua media foi " + m);
        if (m>9) {
            System.out.println("Parabens");
        }
    }
    
}
