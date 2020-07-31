package tp_01;

import java.util.Scanner;


public class NreelWhile {
// Multiplie les nombre de 1 en 1 en partant de Nb jusqu'à 1

    public static void main(String[] args) {


        //Variable
        int Nb;
        int Somme;

        Scanner reader = new Scanner(System.in);

        System.out.print("Entrer N reel: ");
        Nb = reader.nextInt();
        Somme = Nb;

        while (Nb != 0)
        {
            Somme += (Nb-1);
            Nb--;
            System.out.printf("L'addition des réels de votre Nombre vaut : %d \n", Somme);
        }
        System.out.printf("L'addition des réels de votre Nombre vaut : %d ", Somme);
    }
}
