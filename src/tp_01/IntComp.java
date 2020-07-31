package tp_01;

import java.util.Scanner;

public class IntComp {
// Compare deux Variables Nb1 et Nb2
// Si Nb1 est plus petit que Nb1, afficher Vrai sinon afficher Faux
    
    public static void main(String[] args) {
        
        
        //Variable
        int Nb1;
        int Nb2;
        
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Entrer nombre 1: ");
        Nb1 = reader.nextInt();
        System.out.print("Entrer nombre 2: ");
        Nb2 = reader.nextInt();
        if (Nb1 < Nb2)
        {
            System.out.println("Les nombres sont ordonnés");
        }
        else
            System.out.println("Les nombres ne sont pas ordonnés");
        // TODO code application logic here
    }
    
}
