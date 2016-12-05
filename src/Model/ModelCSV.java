/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Metier.CsvHelper;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Administrateur
 */
public class ModelCSV extends AbstractModel{
    
    private final static String RESOURCES_PATH = "C://Users//Administrateur.C103-POSTE02//Documents//Fichiers_Csv//";
    private ArrayList<File> listeFiles;
    private File file;
    
    public ModelCSV(String nom) {
        super(nom);
        listeFiles = new ArrayList<File>();
        File[] lesFiles = CsvHelper.loadFile(RESOURCES_PATH);
        for (int i= 0; i < lesFiles.length; i++)
        {
       
            listeFiles.add(lesFiles[i]);
        }
    }

    public ArrayList<File> getListeFiles() {
        return listeFiles;
    }

    public void setListeFile(ArrayList<File> listeFiles) {
        this.listeFiles = listeFiles;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void addFile()
    {
        
    }
}
