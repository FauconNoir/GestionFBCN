/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvFileHelper {

   private static String fileName;
    
    public static List<String[] > readCsvFile(String pFileName, char separator) {
        final List<String[] > data = new ArrayList<String[] >();

        fileName = pFileName;
        try {
            final File file = new File(pFileName);
            final FileReader fr = new FileReader(file);

            final CSVReader csvReader = new CSVReader(fr, separator);

            String[] nextLine = null;
            while ((nextLine = csvReader.readNext()) != null) {
                final int size = nextLine.length;

                // ligne vide
                if (size == 0) {
                    continue;
                }
                final String debut = nextLine[0].trim();
                if (debut.length() == 0 && size == 1) {
                    continue;
                }

                // ligne de commentaire
                if (debut.startsWith("#")) {
                    continue;
                }
                data.add(nextLine);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

   public static String getFile()
   {
       return fileName;
   }       
    
    
}
    
    
