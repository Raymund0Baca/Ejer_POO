/*
Ejercicios para visualizar en Github
 */
package github;

import java.util.Scanner;

/**
 *
 * @author Raymundo
 */
public class Github {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String nomb;
        
        System.out.println("Escribe tu nombre completo");
        nomb= sc.nextLine();
        System.out.println("\n" + "Tu nombre completo es: " + " \n " +nomb);
        SepararIniciales(nomb);
    }
    public static void SepararIniciales(String name){
        String [] Inicial= name.split("");
        System.out.println("Las iniciales de tu nombre son: ");
        for (int x=0; x<Inicial.length; x++){
            System.out.println(Inicial[x].charAt(0)+" ");
        }
    }
            
}
