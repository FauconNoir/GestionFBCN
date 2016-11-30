/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Administrateur
 */
public class ModelCSV extends AbstractModel{
    
    private final static String RESOURCES_PATH = "C://Users//Administrateur.C103-POSTE02//Documents//Fichiers_Csv//";
    private ArrayList<String> listeFile;
    private String file;
    
    public ModelCSV(String nom) {
        super(nom);
        listeFile = new ArrayList();
    }

    public ArrayList<String> getListeFile() {
        return listeFile;
    }

    public void setListeFile(ArrayList<String> listeFile) {
        this.listeFile = listeFile;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public void addFile(String pfile)
    {
        this.listeFile.add(file);
    }
}
