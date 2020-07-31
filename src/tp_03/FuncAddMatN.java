package tp_03;

//import java.util.Arrays;
import java.util.Scanner;

public class FuncAddMatN {

    // Calcule la moyenne de 4 Nombres
    public static void main(String[] args) {


        int[][] Tab1;
        int[][] Tab2;
        int[][] Tab3;

        int Ord;
        int I;
        int J;

        Scanner reader = new Scanner(System.in);
        System.out.println("Entrer le rang de votre matrice : ");
        Ord = reader.nextInt();

        Tab1 = ReadTab(Ord);
        Tab2 = ReadTab(Ord);

        Tab3 = AddMat(Tab1, Tab2);

        PrintTab(Tab3);
    }

    public static int[][] ReadTab(int n)
    {
        int I;
        int J;
        int[][] Tab;

        Scanner reader = new Scanner(System.in);
        Tab = new int[n][n];

        for (I = 0; I < n ; I++)
        {
            for (J = 0 ; J < n ; J++)
            {
                System.out.printf("Entrer le nombre [%d,%d]:  ", J+1, I+1);
                Tab[I][J] = reader.nextInt();
            }
        }
        return(Tab);
    }

     public static void PrintTab(int[][] Tab)
    {
        final int Ord;
        int I;
        int J;

        Ord = Tab.length;

        for (I = 0; I < Ord; I++)
        {
            System.out.print("\n");
                for (J = 0; J < Ord; J++)
                {
                    System.out.print(Tab[I][J]);
                    System.out.print("\t");
                }
        }
    }
    public static int[][] AddMat(int[][] Tab1, int[][] Tab2)
    {
        int n;
        int I;
        int J;
        int[][] Somme;
        n = Tab1.length;

        Somme = new int[n][n];

       for (I = 0; I < n ; I++)
        {
            for (J = 0 ; J < n ; J++)
            {
                Somme[I][J]= Tab1[I][J] + Tab2[I][J];
            }
        }
       return(Somme);
    }
}
