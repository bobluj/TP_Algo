package tp_01;

import java.util.Scanner;

public class MoyenneKeyEsc {

    // Calcule la moyenne de N Nombres rentrés par l'utilisateur.
    public static void main(String[] args) {

        int I;
        int Compteur;
        int Nb;
        double Somme;


        I = 0;
        Somme = 0;
        Compteur = -1;

        Scanner reader = new Scanner(System.in);

        do
        {
            I++;
            System.out.printf("Entrer le nombre %d:  ", I);
            Nb = reader.nextInt();
            Somme = Somme + Nb;
            System.out.println("La moyenne vaut: " + Somme);
            Compteur++;

        }
        while (Nb != 0);

        Somme = Somme/ Compteur;
// ou si pas de compteur (I-1)
        if (Compteur == 0)
// ou si pas de compteur (I == 1)
        {
            System.out.println("Allez un petit effort, rentrer au moins deux nombres :)");
            System.out.println("           (__)\n           (oo)\n    /-------\\/ \n   / |     ||  \n  *  ||----||  \n     ~~    ~~  ");
         //   System.out.println("    ___     _         _ __                    \n   ( /     //        ( /  )          /     _/_\n    / , , // _  (     /--<  __,  _, /_  _  /  \n  _/_(_/_(/_(/_/_)_  /   \\_(_/(_(__/ /_(/_(__ \n //                                           \n(/     ");
        }
        else
        System.out.println("Moyenne: " + Somme);
    }
}