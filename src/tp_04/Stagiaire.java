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
public class Stagiaire {
    private String Nom;
    private String Prenom;

    public Stagiaire(){}
    public Stagiaire(String Nom, String Prenom){
        this.Nom = Nom;
        this.Prenom = Prenom;

}

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Stagiaire)
        {
            Stagiaire s = (Stagiaire) obj;
            return s.getNom().equalsIgnoreCase(this.getNom()) && s.getPrenom().equalsIgnoreCase(this.getPrenom());
        }
        else
        {
            return super.equals(obj);
        }
    }

    @Override
    public String toString() {

        return String.format("Stagiaire %s %s", getNom(), getPrenom());
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hesre
        Stagiaire S1= new Stagiaire("Jean","Henri");
        Stagiaire S2= new Stagiaire("JeAn","Henri");
        Stagiaire S3= new Stagiaire("JeAn","Zenri");

        System.out.println((S1.equals(S2))?"Les mêmes":"Pas les memes");
        System.out.println((S2.equals(S3))?"Les mêmes":"Pas les memes");
        System.out.println(S1);
    }

}
