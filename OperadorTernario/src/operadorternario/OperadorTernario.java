
package operadorternario;


public class OperadorTernario {

  
    public static void main(String[] args) {
    /*int n1, n2, r;
    n1=14;
    n2=18;
    r = (n1>n2)?n1+n2:n1-n2;
        System.out.println(r);*/
    String nome1= "gustavo";
          String nome2= "gustavo";
            String nome3= new String("gustavo");
            String Res;
            //Res = (nome1==nome3 )?"igual":"diferente";
            Res = (nome1.equals(nome3) )?"igual":"diferente";//equal vai verificar apenas o conteudo do nome
            System.out.println(Res);
    }
    
}
