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
public abstract class AElectrico implements Encendible{
    
    protected boolean encendido;
    protected double consumo;
    protected double consumoPasivo;

    public AElectrico(double consumo, double consumoPasivo) {
        this.consumo=consumo;
        this.encendido=false;
        this.consumoPasivo=consumoPasivo;
    }
    
    public AElectrico(double consumo) {
        this.consumo=consumo;
        this.encendido=false;
        this.consumoPasivo=0;
    }
    

    public abstract double getConsumo();
    
    
}
