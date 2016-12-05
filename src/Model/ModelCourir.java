/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Metier.Courir;
import Metier.CsvHelper;
import static Metier.CsvHelper.readCSVFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrateur
 */
public class ModelCourir extends AbstractModel{
   
    private final static String RESOURCES_PATH = "C://Users//Administrateur.C103-POSTE02//Documents//Fichiers_Csv//";
    private ArrayList<Courir> listeCourir;
    private Courir courir;
    private String nom;
    
    public ModelCourir(String nom) {
        super(nom);
        listeCourir = new ArrayList();
        
    }
    
    public ArrayList<Courir> getListeCourir(String fichier) throws FileNotFoundException, IOException {
                ArrayList<String> data;
                data = readCSVFile(RESOURCES_PATH,fichier);
                String nomFichier = (fichier != null) ? fichier.substring(0,fichier.indexOf('.')) : "";
        for (int i= 0; i < data.size(); i++)
                {
                    String[] ligne = data.get(i).split(";");
                    //String[] tabTemps = ligne[3].split(":");
                    //String temps =  tabTemps[0];
                   
                    //System.out.println(temps);
                    courir = new Courir(nomFichier,ligne[2],ligne[1],Integer.parseInt(ligne[0]),ligne[3]);
                    listeCourir.add(courir);
                }
      return listeCourir;
    }
}
