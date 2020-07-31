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
public class FuncPowSqCub {


    public static void main(String[] args)
    {
        int Nb;
        Scanner reader = new Scanner(System.in);
        System.out.println("Entrer le nombre pour connaitre son carré et son cube : ");
        Nb = reader.nextInt();
        Prnt(Nb);
    }

public static int Sq(int Nb)
{
             return (Nb * Nb);
}

public static int Cub(int Nb)
{
            return(Nb * Nb * Nb);
}

public static void Prnt(int Nb)
{
        System.out.printf("**************** Calcul du Carré **************** %n");
        System.out.printf("le carre de %d est %d \n \n \n",Nb, Sq(Nb));
        System.out.printf("**************** Calcul du Cube **************** %n");
        System.out.printf("Le cube de %d est %d \n",Nb, Cub(Nb));
}
public static void PrntMsg(String msg)
{
        System.out.printf("****************" + msg + "**************** %n");
}
}


