/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlleur;

import Model.AbstractModel;
import Model.ModelCSV;
import Model.ModelTest;
import View.MainView;

/**
 *
 * @author Administrateur
 */
public class AppController extends AbstractController{

    
    public AppController()
    {
        super();
    }
    
    private ModelCSV mainModel = new ModelCSV("ModelCSV");
    private ModelTest modelTest = new ModelTest("ModelTest");
    
    public void Main()
    {
        this.addModel(modelTest);
        this.getListeModels().add(modelTest);
        MainView view = new MainView(this.getListeModels());
        view.setVisible(true);
    }
    
    public void changeTest(String test)
    {
        modelTest.setHello(test);
    }
    
     public String getTest()
    {
       return  modelTest.toString();
    }
     
    
    @Override
    public AbstractModel getModel(String model)
    {
       return super.getModel(model);
    }
    
}
