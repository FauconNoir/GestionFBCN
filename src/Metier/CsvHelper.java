/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Administrateur
 */
public class CsvHelper {
    private static ArrayList<String> listeString = new ArrayList();
    private static String nomFichier;
    public static ArrayList<String> readCSVFile(String path, String fichier) throws IOException
    {
        
    String nomFichier = (fichier != null) ? fichier.substring(0,fichier.indexOf('.')) : "";
    BufferedReader br = new BufferedReader(new FileReader(path + fichier));
    String ligne = null;
    while ((ligne = br.readLine()) != null)
     {
      // Retourner la ligne dans un tableau
      String[] data = ligne.split(",");
 
      // Afficher le contenu du tableau
      for (int i = 0; i < data.length; i++)
      {
          listeString.add(data[i]);
      }
    }
    br.close();
    return listeString;
    }

    public static ArrayList<String> getListeString() {
        return listeString;
    }

    public static void setListeString(ArrayList<String> listeString) {
        CsvHelper.listeString = listeString;
    }

    public static String getNomFichier() {
        return nomFichier;
    }

    public static void setNomFichier(String nomFichier) {
        CsvHelper.nomFichier = nomFichier;
    }
      
}
