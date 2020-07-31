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
public class FuncDivSortQuo {



    public static void main(String[] args)
    {
        int Nb1;
        int Nb2;

        Scanner reader = new Scanner(System.in);

        System.out.println("Entrer le nombre 1 à opérer: ");
        Nb1 = reader.nextInt();

        System.out.println("Entrer le nombre 2 à opérer: ");
        Nb2 = reader.nextInt();

        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        WebdesignHead(c);
        Multitool(Nb1, Nb2);
        WebdesignTail(c);
    }

public static int Max(int Nb1, int Nb2)
{
                return (Nb1 < Nb2 ? Nb1 : Nb2);
}

public static int Min(int Nb1, int Nb2)
{
                return (Nb1 > Nb2 ? Nb2 : Nb1);
}

public static int Quo(int Nb1, int Nb2)
{
                return (Nb1/Nb2);
}

public static int Mod(int Nb1, int Nb2)
{
                return (Nb1%Nb2);
}

public static void Multitool(int Nb1 , int Nb2)
{
        System.out.printf("\n          Min : %d \n", Min(Nb1, Nb2));
        System.out.printf("          Max : %d \n", Max(Nb1, Nb2));
        System.out.printf("          Quotient : %d \n", Quo(Nb1, Nb2));
        System.out.printf("          Reste : %d \n", Mod(Nb1, Nb2));
}

 public static void WebdesignHead(char c)
{
    int i;
        for (i = 0 ; i <= 8; i++)
            System.out.print(c);
        System.out.printf(" RESULTAT ");
        for (i = 0 ; i <= 8 ; i++)
            System.out.print(c);
        System.out.printf("\n");
}

  public static void WebdesignTail(char c)
{
    int i;
        System.out.printf("\n");
        for (i = 0 ; i <= 30; i++)
            System.out.print(c);
        System.out.print("\n");
}
}


