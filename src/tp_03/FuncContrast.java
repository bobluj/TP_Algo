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
public class FuncContrast {
// Calcule la moyenne d'un tableau sous forme de fonctions imbriquées
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] Tab;
        int Res;

        Tab = ReadTab();
        System.out.println("La Moyenne");
        Res = MeanSat(Tab);
        System.out.println(Res);
        System.out.println("Le tableau d'origine");
        PrintTab(Tab);

        PrintMsg("Contraste ajusté");
        Tab = DeacrContrast(Tab);
        PrintTab(Tab);

    }

     public static int[][] ReadTab()
    {
        int I;
        int J;
        int Lig;
        int Col;
        int[][] Tab;

        Scanner reader = new Scanner(System.in);
        System.out.println("Entrer le nombre de Lignes de votre matrice : ");
        Lig = reader.nextInt();
        System.out.println("Entrer le nombre de Colonnes de votre matrice : ");
        Col = reader.nextInt();

        Tab = new int[Lig][Col];

        for (I = 0; I < Lig ; I++)
        {
            for (J = 0 ; J < Col ; J++)
            {
                System.out.printf("Entrer le nombre [%d,%d]:  ", J+1, I+1);
                Tab[I][J] = reader.nextInt();
            }
        }
        return(Tab);
    }

          public static void PrintMsg(String msg)
    {
        System.out.printf("\n \n *** " + msg + "***" + "\n");
    }

     public static void PrintTab(int[][] Tab)
    {
        final int Lig;
        final int Col;
        int I;
        int J;

        Lig = Tab.length;
        Col = Tab[0].length;

        for (I = 0; I < Lig; I++)
        {
            System.out.print("\n");
                for (J = 0; J < Col; J++)
                {
                    System.out.print(Tab[I][J]);
                    System.out.print("\t");
                }
        }
    }

    public static int MeanSat(int[][] Tab)
    {
        int I;
        int J;
        int Lig;
        int Col;
        int Somme;
        int Moyenne;

        Lig = Tab.length;
        Col = Tab[0].length;
        Moyenne = 0;
        Somme = 0;

       for (I = 0; I < Lig ; I++)
        {
            for (J = 0 ; J < Col ; J++)
            {
               Somme += Tab[I][J];
            }
            Moyenne = Somme / (Lig * Col);
        }
       return(Moyenne);
    }

        public static int[][] DeacrContrast(int[][] Tab)
    {
        int I;
        int J;
        int Lig;
        int Col;
        int Moyenne;

        Lig = Tab.length;
        Col = Tab[0].length;
        Moyenne = MeanSat(Tab);

       for (I = 0; I < Lig ; I++)
        {
            for (J = 0 ; J < Col ; J++)
            {
               Tab[I][J] -= ((Tab[I][J] - Moyenne)/2);
            }
        }
       return(Tab);
    }

}