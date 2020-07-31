package tp_01;

import java.util.Scanner;

public class Circonference {
// Calcule la circonference d'un cercle 
// Formule pi * diametre
    
    public static void main(String[] args) {
        
        /*Constantes*/
        
      //final float PI = 3.1415926f;
        
        //Variable
        double rayon; 
        double resultat;
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Longueur du rayon: ");
        rayon = reader.nextDouble();
        resultat = Math.PI * rayon * 2;
        System.out.println("Circonférence : " + resultat);
        // TODO code application logic here
    }
    
}
