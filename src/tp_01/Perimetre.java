package tp_01;

import java.util.Scanner;

public class Perimetre {
// Calcule le perimetre d'un carre
// cote * 4
    public static void main(String[] args) {
        
        //Constantes
        final int NB_COTES = 4;
        
        //Variable
        double longueur; 
        double resultat;
        Scanner reader = new Scanner(System.in);
        
        System.out.print("longueur du côté: ");
        longueur = reader.nextDouble();
        resultat = longueur * NB_COTES;
        System.out.println("Périmètre : " + resultat);
        // TODO code application logic here
    }
    
}
