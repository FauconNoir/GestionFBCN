/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlleur;

import Metier.Courir;
import Model.ModelCSV;
import Model.ModelCourir;
import View.MainView;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Administrateur
 */
public class AppController extends AbstractController{

    
    public AppController()
    {
        super();
    }
    
    private ModelCSV  modelCSV = new ModelCSV("ModelCSV");
    private ModelCourir modelCourir = new ModelCourir("ModelCourir");
    
    public void Main()
    {
        this.addModel(modelCourir);
        this.addModel(modelCSV);
        this.getListeModels().add(modelCSV);
        this.getListeModels().add(modelCourir);
        MainView view = new MainView(this.getListeModels());
        view.setVisible(true);
    }
    
    
    public void setFile(File File)
    {
        modelCSV.setFile(File);
    }
    
    public ArrayList<File> getListeFiles()
    {
        return modelCSV.getListeFiles();
    }
    
    public ArrayList<Courir> getListeCourir(String file) throws FileNotFoundException, IOException
    {
        ArrayList<Courir> data = new ArrayList();
        data = modelCourir.getListeCourir(file);
        return data;
    }
    
    
}
