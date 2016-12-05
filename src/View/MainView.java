/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controlleur.AppController;
import Metier.Courir;
import Metier.MonModelDeTable;
import Model.AbstractModel;
import java.awt.event.ItemEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrateur
 */
public class MainView extends javax.swing.JFrame implements Observer{
        
    ArrayList <AbstractModel> listeModels;
    AppController appController = new AppController();
    AbstractModel model;
    Object data;
    
    
    /**
     * Creates new form MainView
     */
    public MainView(ArrayList <AbstractModel> listeModels,AppController appController,Object data) {
        initComponents();
        this.data = data;
        this.appController = appController;
        this.listeModels = listeModels;
        for (int i=0; i < listeModels.size(); i++)
        {
            listeModels.get(i).addObserver(this);
        }
         
    }
    
    public MainView(ArrayList <AbstractModel> listeModels,Object data) {
        initComponents();
        this.data = data;
        this.listeModels = listeModels;
        for (int i=0; i < listeModels.size(); i++)
        {
            listeModels.get(i).addObserver(this);
        }
         
    }
    
    public MainView(ArrayList <AbstractModel> listeModels) {
        initComponents();
        this.listeModels = listeModels;
        for (int i=0; i < listeModels.size(); i++)
        {
            listeModels.get(i).addObserver(this);
        }
        
    }
   
    
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCSV = new javax.swing.JLabel();
        cmbCSV = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnCSVBase = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblCSV.setText("Fichier CSV:");

        cmbCSV.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCSVItemStateChanged(evt);
            }
        });
        cmbCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCSVActionPerformed(evt);
            }
        });

        jTable1.setModel(new MonModelDeTable());
        jScrollPane1.setViewportView(jTable1);

        btnCSVBase.setText("Transfert vers la base");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 469, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(btnCSVBase, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnCSVBase, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCSVActionPerformed

         
    }//GEN-LAST:event_cmbCSVActionPerformed

    private void cmbCSVItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCSVItemStateChanged
            if (evt.getStateChange() != 1) {
                updateTableCourir();
            }
    }//GEN-LAST:event_cmbCSVItemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        for (int i = 0; i < appController.getListeFiles().size(); i++)
        {
            cmbCSV.addItem(appController.getListeFiles().get(i).getName());
        }
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCSVBase;
    private javax.swing.JComboBox cmbCSV;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCSV;
    // End of variables declaration//GEN-END:variables

    
    
    public void afficher(){
           
        }
    
   @Override
    public void update(Observable o, Object arg) {
        if(o==model) 
        afficher(); 
    }
    
    public void updateTableCourir() {
        showCourir(); 
    }

    private void showCourir() {
        
        for (int i = 0; i< jTable1.getRowCount();i++)
        {
             for (int j = 0; j < jTable1.getColumnCount(); j++)
            {
                if (jTable1.getValueAt(i, j) != null)
                    {
                        jTable1.setValueAt("", i, j);
                        jTable1.setValueAt("", i, j);
                        jTable1.setValueAt("", i, j);
                        jTable1.setValueAt("", i, j);
                    }
            } 
        }
       
        {
         ArrayList<Courir> listeCourir = null;
        try {
            updateTableCourir();
            System.out.println("FICHIER : " + (String) cmbCSV.getSelectedItem());
            listeCourir = appController.getListeCourir(cmbCSV.getSelectedItem().toString());
            System.out.println("TAILLE COURIR : " + listeCourir.size());
        } catch (IOException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
            for (int i = 0; i < listeCourir.size(); i++)
            {
               
                jTable1.setValueAt(listeCourir.get(i).getNomCoureur(), i, 0);
                jTable1.setValueAt(listeCourir.get(i).getPrenomCoureur(), i, 1);
                jTable1.setValueAt(listeCourir.get(i).getPlace(), i, 2);              
                jTable1.setValueAt(listeCourir.get(i).getTemps(), i, 3);          
            }
      }
    }
 } 
 


