/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.AbstractModel;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Administrateur
 */
public  class AbstractView extends javax.swing.JFrame implements Observer{
    
         protected AbstractModel model;
         protected ArrayList<AbstractModel> listeModels = new ArrayList();
         private Object data;
         

    public AbstractView(Object data)
            throws HeadlessException {
            this.data = data;
            
    }

    public AbstractView()  {
        
    }
            
       @Override
        public   void  update(Observable o, Object arg) {
           /*
            if (o.equals(model))
           {
              show();
           }
                   */
        }
        
        public void addModel(AbstractModel model)
        {
           listeModels.add(model);
           model.addObserver(this);
        }     
        
        public void removeModel(AbstractModel model)
        {
            listeModels.remove(model);
        }
        
       @Override
        public void show(){
           
        } 
}
