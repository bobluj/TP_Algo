package tp_02;

//import java.util.Arrays;
import java.util.Scanner;

public class Tab2DStep {

    // Itere un tableau avec un pas et un U0 donné par l'utilisateur
    public static void main(String[] args) {

        //Constantes
        final int MaxI = 10;
        final int MaxJ = 2;


        // Tableau
        int[][] Tab;

        Tab = new int[MaxI][MaxJ];

        //Variable
        int I;
        int J;
        int Step;
        int Start;
        int Buff;

        Scanner reader = new Scanner(System.in);
        System.out.printf("Entrer la valeur de l'index[0,0]:  ");
        Start = reader.nextInt();

        System.out.printf("Entrer la valeur du pas");
        Step = reader.nextInt();

       // Tab[0][0] = Start; ***
       // Tab[0][1] = Buff = Start + Step; ***

       // Buff = Start;**

       for (I = 0; I < MaxI ; I++) // ** I = 1 Pour que ça marche avec les 3 étoiles
        {
            for (J = 0 ; J < MaxJ ; J++)
            {
               // if (J == 1) ***
               //     Tab[I][J] = (Tab[I][J-1] + Step); ***
               // else if (J == 0) ***
                //    Tab[I][J] = (Tab[I-1][J+1] + Step); ***
               // Tab[I][J] = Buff ; **
               // Buff = Buff + Step; **
                Tab[I][J] = Start + (MaxJ * I + J) * Step;

            }
        }
             for (I = 0; I < MaxI; I++)
            {
                System.out.print("\n");
                for (J = 0; J < MaxJ; J++)
                {
                    System.out.print( Tab[I][J]+ "\t");
                }
            }
        }
}

