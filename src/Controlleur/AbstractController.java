/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlleur;

import Model.AbstractModel;
import java.util.ArrayList;
import javax.swing.JFrame;
/**
 *
 * @author Administrateur
 */
public abstract class  AbstractController {
    private AbstractModel model;
    private  ArrayList<AbstractModel> listeModels;
    protected  ArrayList<JFrame> listeViews;
    
    public AbstractController() {
        listeModels = new ArrayList();
        listeViews = new ArrayList();
    }

    
    public  AbstractModel getModel() {
        return model;
    }

    public  void setModel(AbstractModel pModel) {
        model = pModel;
    }

    public  ArrayList<AbstractModel> getListeModels() {
        return listeModels;
    }

    public  void setListeModel(ArrayList<AbstractModel> listeModels) {
       listeModels = listeModels;
    }
    
    public  void addModel(AbstractModel pModel)
    {
        listeModels.add(pModel);
    }
    
    public  void removeModel(AbstractModel pModel)
    {
        listeModels.remove(pModel);
    }
    
   public AbstractModel getModel(String unModel)
   {
       AbstractModel model =null;
       for (int i = 0; i < listeModels.size(); i++)
       {
           if(listeModels.get(i).getNom().equals(listeModels.get(i+1).getNom()))
           {
              model =  listeModels.get(i);
           }
       }
       return model;
   }

    public ArrayList<JFrame> getListeViews() {
        return listeViews;
    }

    public void setListeViews(ArrayList<JFrame> listeViews) {
        this.listeViews = listeViews;
    }
   
    public JFrame getView(JFrame pview)
    {
       JFrame view = null;
       for (int i = 0; i < listeViews.size(); i++)
       {
           if(listeViews.get(i).equals(pview))
           {
               view = listeViews.get(i);
           }
       }
       return view;
    }
    
    public  void addView(JFrame pView)
        {
            listeViews.add(pView);
        }
    
    public  void removeView(JFrame pView)
    {
        listeViews.remove(model);
    }
    
}
