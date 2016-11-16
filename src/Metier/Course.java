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
public class Course {
    private String nom,lieu;
    private String date,temps;
    private float distance;
    private int prix,challenge;

    public Course(String nom, String lieu, String date, String temps, float distance, int prix, int challenge) {
        this.nom = nom;
        this.lieu = lieu;
        this.date = date;
        this.temps = temps;
        this.distance = distance;
        this.prix = prix;
        this.challenge = challenge;
    }

    public Course() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return temps;
    }

    public void setTime(String temps) {
        this.temps = temps;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getChallenge() {
        return challenge;
    }

    public void setChallenge(int challenge) {
        this.challenge = challenge;
    }
    
    
    
}
