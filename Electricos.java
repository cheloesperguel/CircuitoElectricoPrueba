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
public abstract class Electricos extends AElectrico{
   
    public Electricos(double consumo, double consumoPasivo) {
        super(consumo,consumoPasivo);
    }

    public Electricos(double consumo) {
        super(consumo);
    }
    
    
    
   
}
