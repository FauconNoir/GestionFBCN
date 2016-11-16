/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

/**
 *
 * @author Administrateur
 */
public class Club {
    private String nom,adresse,cp,ville,nomPresident;

    public Club(String nom, String adresse, String cp, String ville, String nomPresident) {
        this.nom = nom;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
        this.nomPresident = nomPresident;
    }

    public Club() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getNomPresident() {
        return nomPresident;
    }

    public void setNomPresident(String nomPresident) {
        this.nomPresident = nomPresident;
    }
    
    
    
    
    
    
    
}
