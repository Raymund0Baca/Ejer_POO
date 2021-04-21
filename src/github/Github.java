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
        String nombre;
        
        System.out.println("¿Cual es su nombre completo?");
        nombre= sc.nextLine();
        System.out.println("\n" + "Su nombre completo es: " + " \n " +nombre);
        SepararIniciales(nombre);
    }
    public static void SepararIniciales(String name){
        String [] Iniciales= name.split("");
        System.out.println("Las iniciales del nombre son: ");
        for (int x=0; x<Iniciales.length; x++){
            System.out.println(Iniciales[x].charAt(0)+" ");
        }
    }
            
}
