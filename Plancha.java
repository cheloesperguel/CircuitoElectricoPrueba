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
public class Plancha extends Resistivos{

   

    public Plancha(double consumo) {
        super(consumo);
    }


   

    @Override
    public void encender() {
        encendido = true;
        tActual=100;
        
    }

    @Override
    public void apagar() {
        encendido = false;
        tActual=0;
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
