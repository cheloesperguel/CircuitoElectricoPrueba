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
public class PautaP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        AElectrico p1 = new Plancha(1000);
        AElectrico t1 = new TV(760);
        AElectrico a1 = new Aspiradora(675);
        
        InstalacionElectrica insta = new InstalacionElectrica();
        
        insta.agregarAparato(p1);
        insta.agregarAparato(t1);        
        insta.agregarAparato(a1);


        
        System.out.println(insta.getConsumoTotal());
        
        insta.prenderAparato(a1);
        insta.prenderAparato(p1);
        
        System.out.println(insta.getConsumoTotal());
        
        insta.apagarAparato(p1);
        insta.prenderAparato(t1);
        
        System.out.println(insta.getConsumoTotal());
    }
    
}
