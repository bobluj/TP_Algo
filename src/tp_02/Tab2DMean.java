package tp_02;

//import java.util.Arrays;
import java.util.Scanner;

public class Tab2DMean {

    // Calcule la moyenne de 4 Nombres
    public static void main(String[] args) {

        //Constantes
        final int MaxI = 5;
        final int MaxJ = 2;

        // Tableau
        int[][] Tab;

        Tab = new int[MaxI][MaxJ];

        //Variable
        int I;
        int J;
        double Moyenne;

        Moyenne = 0;

       for (I = 0; I < MaxI ; I++)
        {
            for (J = 0 ; J < MaxJ ; J++)
            {
                Scanner reader = new Scanner(System.in);
                System.out.printf("Entrer le nombre [%d,%d]:  ", J+1, I+1);
                Tab[I][J] = reader.nextInt();
            }
        }
             for (I = 0; I < MaxI; I++)
            {
                System.out.print("\n");
                for (J = 0; J < MaxJ; J++)
                {
                    Moyenne += Tab[I][J];
                    System.out.print( Tab[I][J]+ "\t");
                }
            }
             Moyenne =  Moyenne/(MaxI*MaxJ);
             System.out.print("\n" + Moyenne );
        }
}

