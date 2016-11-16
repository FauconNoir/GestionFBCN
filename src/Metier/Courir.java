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
public class Courir {
    private String nomCourse,nomCoureur,prenomCoureur;
    private int place;
    private String temps;

    public Courir(String nomCourse, String nomCoureur, String prenomCoureur, int place, String temps) {
        this.nomCourse = nomCourse;
        this.nomCoureur = nomCoureur;
        this.prenomCoureur = prenomCoureur;
        this.place = place;
        this.temps = temps;
    }

    public Courir() {
    }

    public String getNomCourse() {
        return nomCourse;
    }

    public void setNomCourse(String nomCourse) {
        this.nomCourse = nomCourse;
    }

    public String getNomCoureur() {
        return nomCoureur;
    }

    public void setNomCoureur(String nomCoureur) {
        this.nomCoureur = nomCoureur;
    }

    public String getPrenomCoureur() {
        return prenomCoureur;
    }

    public void setPrenomCoureur(String prenomCoureur) {
        this.prenomCoureur = prenomCoureur;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public String getTemps() {
        return temps;
    }

    public void setTemps(String temps) {
        this.temps = temps;
    } 
}
