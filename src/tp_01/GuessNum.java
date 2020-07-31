package tp_01;

import java.util.Scanner;

public class GuessNum {

    // Calcule la moyenne de N Nombres rentrer par l'utilisateur.
    public static void main(String[] args) {

        int I;
        int Nb;
        double Alea;


        I = 0;
        Alea = Math.random()*100 ;
        Alea = (int) Alea;
        //System.out.println(Alea);

        Scanner reader = new Scanner(System.in);

        do
        {
            System.out.printf("Allez, devine moi ce nombre morte-couille:  ");
            Nb = reader.nextInt();
            I++;
            if (Nb < Alea)
                System.out.println("La calotte de ses morts c'est plus (+) ");
            else if (Nb > Alea)
                System.out.println("Ch’est l’métier qui rinte ! C'est moein (-) ");
        }
        while (Nb != Alea);

            System.out.printf("\n \n Bravo ! La vache Sacrée nommée Jésus te vénèrera jusqu'à la fin des temps.(%d essai(s))\n", I);
            System.out.println("           (__)\n           (oo)\n    /-------\\/ \n   / |     ||  \n  *  ||----||  \n     ~~    ~~  ");
         //   System.out.println("    ___     _         _ __                    \n   ( /     //        ( /  )          /     _/_\n    / , , // _  (     /--<  __,  _, /_  _  /  \n  _/_(_/_(/_(/_/_)_  /   \\_(_/(_(__/ /_(/_(__ \n //                                           \n(/     ");
    }
}