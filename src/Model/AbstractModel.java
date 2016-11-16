/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.ArrayList;
import java.util.Observable;
import javax.swing.JFrame;

/**
 *
 * @author Administrateur
 */
public abstract class AbstractModel extends Observable{
 
    private ArrayList<JFrame> listeViews = new ArrayList();
    private JFrame view;
    private ArrayList<Object> listeObjets;
    private Object objet;
    private String nom;

    public AbstractModel() {
        
    }
    
    public AbstractModel(String nom) {
        this.nom = nom;
    }

    public ArrayList<JFrame> getListeViews() {
        return listeViews;
    }

    public void setListeView(ArrayList<JFrame> listeViews) {
        this.listeViews = listeViews;
        setChanged();
        notifyObservers(listeViews);
    }

    public JFrame getView() {
        return view;
    }

    public void setView(JFrame view) {
        this.view = view;
        setChanged();
        notifyObservers(view);
    }

    public ArrayList<Object> getListeObjets() {
        return listeObjets;
    }

    public void setListeObjets(ArrayList<Object> listeObjets) {
        this.listeObjets = listeObjets;
        setChanged();
        notifyObservers(listeObjets);
    }

    public Object getObjet() {
        return objet;
    }

    public void setObjet(Object objet) {
        this.objet = objet;
        setChanged();
        notifyObservers(objet);
    }
    
    public void ToString()
    {
        System.out.print("Objet :" + listeViews);
    }
     
    public void addView(JFrame view)
    {
        listeViews.add(view);
    }
    
    public void removeView(JFrame view)
    {
        listeViews.remove(view);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

