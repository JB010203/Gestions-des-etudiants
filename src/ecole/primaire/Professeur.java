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
public class Professeur {
    private int id;
    private String nom; 
    private String prenom;
    private int courId;

    public Professeur() {
    }

    public Professeur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourId() {
        return courId;
    }

    public void setCourId(int courId) {
        this.courId = courId;
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
    
    public Vector toLine(){
        Vector v = new Vector();
        v.add(this.id);
        v.add(this.nom);
        v.add(this.prenom);
        
        return v;
    }
    
    
	
    
}
