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
public class Classe {
    private int id;
    private String nom;

    public Classe() {
    }

    public Classe(String nom) {
        this.nom = nom;
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
    
    public Vector toLine(){
        Vector v = new Vector();
        v.add(this.id);
        v.add(this.nom);
        return v;
    }
    
}
