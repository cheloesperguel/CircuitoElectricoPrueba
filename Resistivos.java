/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pautap3;

/**
 *
 * @author dci
 */
public abstract class Resistivos extends AElectrico{
    
    protected double tActual;


    public Resistivos(double consumo) {
        super(consumo);
        this.tActual = 0;
    }

    public Resistivos(double consumo, double consumoPasivo) {
        super(consumo, consumoPasivo);
        this.tActual = 0;
    }
    
    
    
   
}
