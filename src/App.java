
import Controlleur.AppController;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrateur
 */
public class App {
    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) throws IOException {
        
      AppController  appController = new AppController();
       appController.Main();
   
    }

} 
