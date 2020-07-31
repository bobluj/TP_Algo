package tp_03;

//import java.util.Arrays;
import java.util.Scanner;

public class FuncAddMatSq {

    // Calcule la moyenne de 4 Nombres
    public static void main(String[] args) {


        int[][] Tab1;
        int[][] Tab2;
        int[][] Tab3;

        int Lig;
        int Col;

        Scanner reader = new Scanner(System.in);
        System.out.println("Entrer le nombre de Ligne de votre matrice : ");
        Lig = reader.nextInt();
         System.out.println("Entrer le nombre de Ligne de votre matrice : ");
         Col = reader.nextInt();

        Tab1 = ReadTab(Lig, Col);
        Tab2 = ReadTab(Lig, Col);

        Tab3 = AddMat(Tab1, Tab2);

        PrintTab(Tab3);
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
    public static int[][] AddMat(int[][] Tab1, int[][] Tab2)
    {
        int Lig;
        int Col;
        int I;
        int J;
        int[][] Somme;
        Lig = Tab1.length;
        Col = Tab1[0].length;

        Somme = new int[Lig][Col];

       for (I = 0; I < Lig ; I++)
        {
            for (J = 0 ; J < Col ; J++)
            {
                Somme[I][J]= Tab1[I][J] + Tab2[I][J];
            }
        }
       return(Somme);
    }
}

