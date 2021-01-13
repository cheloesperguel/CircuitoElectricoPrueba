/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pautap3;

import java.util.ArrayList;

/**
 *
 * @author chelo
 */
public class InstalacionElectrica {
    
    private ArrayList<AElectrico> aparatos = new ArrayList<AElectrico>();
    
    private double consumoT = 0;
      
      
    public InstalacionElectrica() {
    }
    
    public void agregarAparato(AElectrico a){
        aparatos.add(a);
    }
    
    public void prenderAparato(AElectrico a){
        
        int i = aparatos.indexOf(a);
        aparatos.get(i).encender();
    }
    
    public void apagarAparato(AElectrico a){
        
        int i = aparatos.indexOf(a);
        aparatos.get(i).apagar();
    }
    
    public double getConsumoTotal(){
        for(int i = 0; i< aparatos.size(); i++){
           consumoT+= aparatos.get(i).getConsumo();
           
        }
        
        return consumoT;
    }
    
    public void imprimir(){
        
        for (int i = 0; i < aparatos.size(); i++) {
            AElectrico get = aparatos.get(i);
            
            System.out.println(get.encendido+" = "+get.getConsumo());
        }
    }
    
}
