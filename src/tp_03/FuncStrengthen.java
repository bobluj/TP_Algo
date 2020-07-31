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
public class FuncStrengthen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] Tab1;
        int[][] Tab2;

        int Lig;
        int Col;


        Scanner reader = new Scanner(System.in);
        System.out.println("Entrer le nombre de Ligne de votre matrice : ");
        Lig = reader.nextInt();
         System.out.println("Entrer le nombre de Ligne de votre matrice : ");
         Col = reader.nextInt();

        Tab1 = ReadTab(Lig,Col);

        Tab2 = Strengthen(Tab1);

        PrintTab(Tab2);
        // TODO code application logic here
    }

     public static int[][] ReadTab(int Lig, int Col)
    {
        int I;
        int J;
        int[][] Tab;

        Scanner reader = new Scanner(System.in);
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

    public static int[][] Strengthen(int[][] Tab)
    {
        int I;
        int J;
        int Lig;
        int Col;
        int[][] Somme;

        Lig = Tab.length;
        Col = Tab[0].length;
        Somme = new int[Lig][Col];

       for (I = 0; I < Lig ; I++)
        {
            for (J = 0 ; J < Col ; J++)
            {
                if (Tab[I][J] > 75)
                    Somme[I][J] = 100;
                else if (Tab[I][J] > 50)
                    Somme[I][J] = 75;
                else
                Somme[I][J]= (Tab[I][J]/2);
            }
        }
       return(Somme);
    }

}
