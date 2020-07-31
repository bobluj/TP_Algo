package tp_01;

import java.util.Scanner;

public class FibonnacciSeq {

    /* Calcule le suite de la Nième valur de la suite de Fibonacci
    Nombre rentré par l'utilisateur.*/
    public static void main(String[] args) {

        int I;
        int Nb;
        int Somme;
        int Pivot;
        int Uminor;


        I = 3;
        Uminor = 1;
        Somme = 2;

        //System.out.println(Alea);

        Scanner reader = new Scanner(System.in);
            System.out.printf("Entrer jusqu'a quellle valeur vous voulez aller");
            Nb = reader.nextInt();
        switch (Nb) {
            case 1 :
            case 2:
                System.out.printf("Le premier terme de la suite vaut 1");
                break;
            default:
                // ou for (I = 3 ; Nb != I; I++;)
                while (Nb != I )
                {
                    Pivot = Somme;
                    Somme = Somme + Uminor;
                    Uminor = Pivot;
                    I++;

                }   System.out.printf("La nieme valeur rentrée vaut : %d", Somme);
                break;
        //System.out.printf("\n \n Bravo ! La vache Sacrée nommée Jésus te vénèrera jusqu'à la fin des temps.(%d essai(s))\n", I);
        //  System.out.println("           (__)\n           (oo)\n    /-------\\/ \n   / |     ||  \n  *  ||----||  \n     ~~    ~~  ");
        //   System.out.println("    ___     _         _ __                    \n   ( /     //        ( /  )          /     _/_\n    / , , // _  (     /--<  __,  _, /_  _  /  \n  _/_(_/_(/_(/_/_)_  /   \\_(_/(_(__/ /_(/_(__ \n //                                           \n(/     ");
        }

        }
}