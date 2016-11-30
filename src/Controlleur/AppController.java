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
        modelCSV.addFile("res_defiDuGouet_20-2012.csv");
        modelCSV.addFile("res_loco_15_2012.csv");
        modelCSV.addFile("res_loco_32_2012.csv");
        modelCSV.addFile("res_menebre_10-2012.csv");
        modelCSV.addFile("res_menebre_26-2012.csv");
        modelCSV.addFile("res_randomuco_14-2012.csv");
        modelCSV.addFile("res_randomuco_36-2012.csv");
        MainView view = new MainView(this.getListeModels());
        view.setVisible(true);
    }
    
    public void setFile(String File)
    {
        modelCSV.setFile(File);
    }
    
    public String getFile(String file)
    {
        
        for (int i = 0; i < modelCSV.getListeFile().size(); i++)
        {
            if(modelCSV.getListeFile().get(i).equals(file))
            {
                file = modelCSV.getListeFile().get(i);
            }
        }
        return file;
    }
    
    public ArrayList<Courir> getListeCourir(String file) throws FileNotFoundException, IOException
    {
        ArrayList<Courir> data = new ArrayList();
        data = (ArrayList<Courir>) modelCourir.getListeCourir(file);
        return data;
    }
    
    
}
