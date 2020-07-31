package tp_01;

import java.util.Scanner;


public class FactorialFor {
// Multiplie les nombre de 1 en 1 jusqu'a Nb

    public static void main(String[] args) {


        //Variable
        int Nb;
        int i;
        int Produit;
        Produit = 1;

        Scanner reader = new Scanner(System.in);

        System.out.print("Entrer N reel: ");
        Nb = reader.nextInt();

        for (i = 1; i <= Nb; i++)
        {
            Produit = Produit * i;
        }
        System.out.printf("Le produit  des réels de votre Nombre vaut : %d ", Produit);
    }
}