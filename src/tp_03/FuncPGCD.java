/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_03;

import java.util.Scanner;

/**
 *
 * @author jules.rachet
 */
public class FuncPGCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int Nb1;
        int Nb2;

        Scanner reader = new Scanner(System.in);

        System.out.println("Entrer le nombre 1 à opérer: ");
        Nb1 = reader.nextInt();

        System.out.println("Entrer le nombre 2 à opérer: ");
        Nb2 = reader.nextInt();

        System.out.println(PGCD(Nb1, Nb2));
    }

public static int Max(int Nb1, int Nb2)
{
    return (Nb1 > Nb2 ? Nb1 : Nb2);
}

public static int Min(int Nb1, int Nb2)
{
    return (Nb1 > Nb2 ? Nb2 : Nb1);
}

public static int PGCD(int Nb1, int Nb2)
{
    int Buff;
    Buff = 4;

    while (Nb1 != Nb2 )
    {
        Buff = (Max(Nb1, Nb2)) - (Min(Nb1, Nb2));
        if (Nb1 > Nb2)
            Nb1 = Nb1 - Nb2;
        else
            Nb2 = Nb2 - Nb1;
    }
    return(Nb1);

}
}
