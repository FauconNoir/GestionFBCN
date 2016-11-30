/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrateur
 */
/*
public class test {
    public static List<String[] > readCsvFile(String pFileName, char separator) {
        final List<String[] > data = new ArrayList< >();

        try {
            file = new File(pFileName);
            String nomfichier = (file.getName() != null) ? file.getName().substring(0,file.getName().indexOf('.')) : "";
            nom = nomfichier;
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
            e.getMessage();
        } catch (IOException e) {
            e.getCause();
        }
      
        return data;
    }

    public static File getFile() {
        return file;
    }

    public static void setFile(File file) {
        CsvFileHelper.file = file;
    }

    public static String getNom() {
        return nom;
    }

    public static void setNom(String nom) {
        CsvFileHelper.nom = nom;
    }
      
}
*/
