
package operadoresaritimeticos;


public class OperadoresAritimeticos {

    public static void main(String[] args) {
       /*int n1 = 3;
       int n2 = 5;
       float m = (n1 + n2) / 2;
        System.out.println("A média é: "+ m);*/
        
        /*int numero = 5;
                numero--;
                System.out.println(numero);
        int numero2 = 5;
            numero2 ++;
            System.out.println(numero2);*/
             
        
       /* int numero = 5;
        int valor = 5 + ++numero;
        // se colocar o ++ depois do numero ele vai fazer a soma 5 + 5 = 10 e o numero vai se somar depoir fincando 6
        System.out.println(valor);*/
       
      /* int x = 4;
       x += 2; // x = x +2
        System.out.println(x);*/
      
      //arrendondamentos 
      
     /* float v = 8.9f;
      int ar = (int)Math.floor(v);
        System.out.println(ar);
       
      float v2 = 7.1f;
      int ar2 = (int)Math.ceil(v2);
        System.out.println(ar2);
        
       float v3 = 6.5f;
      int ar3 = (int)Math.round(v3);
        System.out.println(ar3);*/
     
     double ale =  Math.random();
        System.out.println(ale);
       // caso queira fazer acima de 0.0 a 1.0
     double ale1 =  Math.random();
        int n = (int) (5 + ale1 * (10 - 5));
        System.out.println(n);
        
     
    }
    
}
