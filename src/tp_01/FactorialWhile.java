package tp_01;

import java.util.Scanner;


public class FactorialWhile {
// Verifie Nb1 et Nb2 se suivent et sont ordonnés

    public static void main(String[] args) {


        //Variable
        int Nb;
        long Produit;

        Scanner reader = new Scanner(System.in);

        System.out.print("Entrer N reel: ");
        Nb = reader.nextInt();
        Produit = Nb;

        while (Nb != 1)
        {
            Produit *= (Nb-1);
            Nb--;
            System.out.printf("Le produit des réels de votre Nombre vaut : %d \n", Produit);
        }
        System.out.printf("Le produit des réels de votre Nombre vaut : %d ", Produit);
    }
}
