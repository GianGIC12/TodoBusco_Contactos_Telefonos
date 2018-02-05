/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebas;

import conexion.Conexion;

/**
 *
 * @author user
 */
public class PruebasLetales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conexion c= new Conexion();
        
        c.conectar();
        
        
        for (int i = 1; i < 32; i++) {
            System.out.println(""+i);
        }
        
        
        String fecha="01/08/2017";
        
        String aux=fecha.substring(6,10)+fecha.substring(3,5)+fecha.substring(0,2);
        System.out.println(""+aux);
        
    }
    
}
