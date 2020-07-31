/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_04;

/**
 *
 * @author jules.rachet
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Personne p1 = new Personne("JOE", 1990, 12000);
        Personne p2 = new Personne("JOE", 1990, 12000);
        System.out.println(p1.CalculAge());

        System.out.println((p1.equals(p2))?"bravo":"dommage");
        // TODO code application logic here
    }

}
