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
public abstract class Figure2D {

    private double X;
    private double Y;

    public Figure2D(){}
    public Figure2D(double X, double Y){
        this.X = X;
        this.Y = Y;
    }


public abstract double calcSurface();


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
