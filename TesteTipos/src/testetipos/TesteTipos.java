/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipos;

/**
 *
 * @author Marcel
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);*/
       
        /*String valor = "30";
        int idade = Integer.parseInt(valor);
        System.out.println(idade);*/
        
        String valor = "30.5";
        float idade = Float.parseFloat(valor);
        System.out.printf("%.3f \n", idade);
    }
    
}
