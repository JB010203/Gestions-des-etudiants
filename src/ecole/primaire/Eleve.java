/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecole.primaire;

import java.util.Vector;

/**
 *
 * @author hjuve
 */
public class Eleve {

    private int id;
    private String nom;
    private String prenom;
    private int classe_fk;

    public Eleve() {
    }

    public Eleve(String nom, String prenom, int classe_fk) {
        this.nom = nom;
        this.prenom = prenom;
        this.classe_fk = classe_fk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getClasse_fk() {
        return classe_fk;
    }

    public void setClasse_fk(int classe_fk) {
        this.classe_fk = classe_fk;
    }
    
    public Vector toLine(){
        Vector v = new Vector();
        v.add(this.id);
        v.add(this.nom);
        v.add(this.prenom);
        v.add(this.classe_fk);
        return v;
    }

}
