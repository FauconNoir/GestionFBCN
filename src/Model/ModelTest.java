/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Administrateur
 */
public class ModelTest extends AbstractModel{
    
    private String nom;
    private String hello;

    public ModelTest(String nom) {
        super(nom);
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
    
    @Override
    public String toString()
    {
        return hello;
    }
    
}
