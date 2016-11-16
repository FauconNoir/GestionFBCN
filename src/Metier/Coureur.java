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
public class Coureur {
    private String nomClub,nom,prenom;
    private char sex;
    private int an_naiss;
    private String adresse,cp,ville,tel,email;
    private int ptsPrec,ptsAct;

    public Coureur(String nomClub, String nom, String prenom, char sex, int an_naiss, String adresse, String cp, String ville, String tel, String email, int ptsPrec, int ptsAct) {
        this.nomClub = nomClub;
        this.nom = nom;
        this.prenom = prenom;
        this.sex = sex;
        this.an_naiss = an_naiss;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
        this.tel = tel;
        this.email = email;
        this.ptsPrec = ptsPrec;
        this.ptsAct = ptsAct;
    }
    
    public Coureur() {
    }

    public String getNomClub() {
        return nomClub;
    }

    public void setNomClub(String nomClub) {
        this.nomClub = nomClub;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom= nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAn_naiss() {
        return an_naiss;
    }

    public void setAn_naiss(int an_naiss) {
        this.an_naiss = an_naiss;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPtsPrec() {
        return ptsPrec;
    }

    public void setPtsPrec(int ptsPrec) {
        this.ptsPrec = ptsPrec;
    }

    public int getPtsAct() {
        return ptsAct;
    }

    public void setPtsAct(int ptsAct) {
        this.ptsAct = ptsAct;
    }
    
    
  
            
    
    
    
    
    
}
