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
public class FuncPow {


    public static void main(String[] args)
    {
        int Nb;
        int Pow;
        Scanner reader = new Scanner(System.in);
        System.out.println("Entrer le nombre a elever en puissance: ");
        Nb = reader.nextInt();
        System.out.println("Entrer la puissance : ");
        Pow = reader.nextInt();
        Prnt(Nb, Pow);
    }

public static int ToPow(int Nb, int Pow)
{
    int i;
    int Proportion;
    Proportion =1;
    for (i = 1 ; i != Pow; i++)
        Proportion = Proportion * Nb;

    return (Proportion);
}


public static void Prnt(int Nb, int Pow)
{
        System.out.printf("**************** Calcul de la puissance %d du nombre %d **************** %n", Pow, Nb);
        System.out.printf("le résultat vaut : %d \n",ToPow(Nb, Pow));
}
public static void PrntMsg(String msg)
{
        System.out.printf("****************" + msg + "**************** %n");
}
}


