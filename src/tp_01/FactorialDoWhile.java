package tp_01;

import java.util.Scanner;


public class FactorialDoWhile {
// Verifie Nb1 et Nb2 se suivent et sont ordonnés

    public static void main(String[] args) {


        //Variable
        int Nb;
        int i;
        long Produit;

        i = 1;

        Scanner reader = new Scanner(System.in);

        System.out.print("Entrer un entier positif different de 0 : ");
        Nb = reader.nextInt();
        Produit = i;
        do
        {
            Produit *= (i);
            i++;
        }
        while (i <= Nb);

        System.out.printf("Le produit des réels de votre Nombre vaut : %d ", Produit);
    }
}
