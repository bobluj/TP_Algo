package tp_02;

//import java.util.Arrays;
import java.util.Scanner;

public class Tab2DSmallest {

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
        int Min;

       for (I = 0; I < MaxI ; I++)
        {
            for (J = 0 ; J < MaxJ ; J++)
            {
                Scanner reader = new Scanner(System.in);
                System.out.printf("Entrer le nombre [%d,%d]:  ", J+1, I+1);
                Tab[I][J] = reader.nextInt();
            }
        }
             Min = Tab[0][0];
             for (I = 0; I < MaxI; I++)
            {
                for (J = 0; J < MaxJ; J++)
                {
                    if (Tab[I][J]< Min)
                    {
                        Min = Tab[I][J];
                    }
                }
            }
             System.out.print("La valeur de min "+Min );
        }
}