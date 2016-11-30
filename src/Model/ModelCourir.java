/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Metier.Courir;
import static Metier.CsvHelper.getNomFichier;
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
    
    String nom;
    public ModelCourir(String nom) {
        super(nom);
        listeCourir = new ArrayList();
    }
    
    
    public List<Courir> getListeCourir(String fichier) throws FileNotFoundException, IOException {
                ArrayList<String> data = new ArrayList();
                data = readCSVFile(RESOURCES_PATH,fichier);
                String nomFichier = (fichier != null) ? fichier.substring(0,fichier.indexOf('.')) : "";
        for (int i= 0; i < data.size();i++)
                {
                    
                    courir = new Courir(nomFichier,data.get(2),data.get(1),Integer.parseInt(data.get(0)),Time.valueOf(data.get(3)));
                    listeCourir.add(courir);
                }
      return listeCourir;
    }
}
