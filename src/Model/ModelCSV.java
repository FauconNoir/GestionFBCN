/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Metier.Courir;
import Metier.CsvFileHelper;
import static Metier.CsvFileHelper.readCsvFile;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrateur
 */
public class ModelCSV extends AbstractModel{
    
    
    public ModelCSV(String nom) {
        super(nom);
        
    }

    private final static char SEPARATOR = ';';
    private final static String RESOURCES_PATH = "D://java//Activité1_FBCN//Ressources//Fichiers_Csv";
    

    public List<Courir> getCourir(String fichier) {

        final List<String[] > data = readCsvFile(RESOURCES_PATH + fichier, SEPARATOR);

        final List<Courir> courirs = dataToCourirs(data);

        return courirs;
    }

    private List<Courir> dataToCourirs(List<String[] > data) {
        final List<Courir> courirs = new ArrayList<Courir>();
        
        for (String[] oneData : data) {
            final String nomCourse = CsvFileHelper.getFile();
            final String nomCoureur = oneData[1];
            final String prenomCoureur = oneData[2];
            final int place = Integer.parseInt(oneData[3]);
            final String temps = oneData[4];
            final Courir courir = new Courir(nomCourse, nomCoureur, prenomCoureur, place,temps);
            courirs.add(courir);
        }
        return courirs;
    }
}
