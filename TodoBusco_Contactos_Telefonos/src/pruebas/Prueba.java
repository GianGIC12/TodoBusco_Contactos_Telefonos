/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebas;

import archivos.ExportarCSV;
import conexion.Conexion;
import gestion.Consultas;
import java.io.IOException;

/**
 *
 * @author user
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Consultas c= new Consultas();
        
        String dia="01";
        String mes="01";
        String anio="2018";
        
        c.obtenerContactabilidad();
        c.recorrerContactabilidad();
        c.obtenerContactabilidadMensual(dia,mes,anio);
        c.recorrerContactabilidad();
        
        String idExcel= anio+mes+dia;
        
        ExportarCSV e= new ExportarCSV();
        e.exportarResultados(c.getContactosLista(),idExcel);
        
        
    }
    
}
