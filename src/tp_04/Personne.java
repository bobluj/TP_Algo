/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_04;

import java.util.Calendar;

/**
 *
 * @author jules.rachet
 */
public class Personne {
    private int annee;
    private String nom;
    private int salaire;

    public Personne(){}

    public Personne(String nom, int annee, int salaire)
    {
        this.nom = nom;
        this.annee = annee;
        this.salaire = salaire;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }




     public int CalculAge()
     {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        return (year - getAnnee());
     }

     public void Affiche()
     {
         System.out.printf("%s âgé de %d ans \n", getNom(), CalculAge());
     }



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personne p1 = new Personne("JOE", 1990, 12000);
        Personne p2 = new Personne("Joe",0,0);
        p2.setAnnee(1990);
        p2.setSalaire(2000);


        p1.Affiche();
        p2.Affiche();

        System.out.println((p1.equals(p2))?"bravo":"dommage");

       // Personne(Martin, 1997, 2000);
        // TODO code application logic here
    }

}
