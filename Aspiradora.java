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
public class Aspiradora extends Inductivos{


    public Aspiradora(double consumo) {
        super(consumo);
    }
   
    

   

    @Override
    public void encender() {
        encendido = true;
        
    }

    @Override
    public void apagar() {
        encendido = true;
    }


    @Override
    public double getConsumo() {
        if(encendido){
            return consumo;
        }else{
            return consumoPasivo;
        }
    }
    
    
}
