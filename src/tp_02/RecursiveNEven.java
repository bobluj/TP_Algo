/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_02;

import java.util.Scanner;

    public class RecursiveNEven {

    static void p(int count){
    count++;
    if(count<=100){
    System.out.println("hello "+count);
    p(count );
    }
    }
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
        int MonNombre = reader.nextInt();
        p(MonNombre);
    }
    }