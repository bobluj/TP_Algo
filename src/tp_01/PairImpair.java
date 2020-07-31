package tp_01;

import java.util.Scanner;

public class PairImpair {
// Verifie si un nombre est pair ou non
// Si Nb modulo 2 vaut 0 alors le nombre est pair sinon il est impair

    public static void main(String[] args) {


        //Variable
        int Nb;

        Scanner reader = new Scanner(System.in);

        System.out.print("Entrer nombre à vérifier: ");
        Nb = reader.nextInt();

        if (Nb % 2 == 0)
        {
            System.out.println("Le nombre est pair (^_^) ");
        }
        else
            System.out.println("Les nombre est impair   -_-' ");
            System.out.println(Nb % 2);
    }

}