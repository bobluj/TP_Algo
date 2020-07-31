package tp_01;

import java.util.Scanner;

public class ConsecCroiss {
// Verifie Nb1 et Nb2 se suivent et sont ordonnés
    
    public static void main(String[] args) {

        
        //Variable
        int Nb1;
        int Nb2;
        
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Entrer nombre 1: ");
        Nb1 = reader.nextInt();
        System.out.print("Entrer nombre 2: ");
        Nb2 = reader.nextInt();
        if (Nb1 < Nb2 && ++Nb1 == Nb2)
        {
            System.out.println("Les nombres sont consecutifs et ordonnés");
        }
        else
            System.out.println("Les nombres ne sont pas consecutifs "
                    + "et/ou ordonnés");
        // TODO code application logic here
    }
    
}