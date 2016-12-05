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
public class CsvHelper
{
    
    private static ArrayList<String> listeString = new ArrayList();
    public static ArrayList<String> readCSVFile(String path, String fichier) throws IOException
    {
        for (int i = 0; i < listeString.size(); i++)
        {
            listeString.remove(i);
        }
        BufferedReader br = new BufferedReader(new FileReader(path + fichier));
        String ligne = null;
        while ((ligne = br.readLine()) != null)
        {
            // Retourner la ligne dans un tableau
            listeString.add(ligne);
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
    
    public static File[] loadFile(String path)
    {
        File repertoire = new File(path);
        File[] files = repertoire.listFiles();
        return files;
    }
}
