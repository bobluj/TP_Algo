package tp_01;

import java.util.Scanner;


public class ForEvenv2 {
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

        for (i = 2; i <= Nb * 2 ; i = i + 2)
        {
            Somme += i;
            System.out.printf("L'addition des N réels pairs de votre Nombre vaut : %d ", Somme);
        }
        System.out.printf("L'addition des N réels pairs de votre Nombre vaut : %d ", Somme);
    }
}