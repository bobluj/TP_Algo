package tp_01;

import java.util.Scanner;


public class NreelFor {
// additionne les nombre de 1 en 1 jusqu'a Nb

    public static void main(String[] args) {


        //Variable
        int Nb;
        int i;
        int Somme;
        Somme = 0;

        Scanner reader = new Scanner(System.in);

        System.out.print("Entrer N reel: ");
        Nb = reader.nextInt();

        for (i = 2; i <= Nb; i++)
        {
            Somme += i;
        }
        System.out.printf("L'addition des réels de votre Nombre vaut : %d ", Somme);
    }
}