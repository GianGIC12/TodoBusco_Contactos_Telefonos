/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import archivos.ExportarCSV;
import conexion.Conexion_Mongo;
import gestion.Consultas;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, SQLException {
        // TODO code application logic here

        /**
         * Consultas c= new Consultas();
         *
         * String dia="01"; String mes="01"; String anio="2018";
         *
         * c.obtenerContactabilidad(); c.recorrerContactabilidad();
         * c.obtenerContactabilidadMensual("01","01","2017");
         * c.recorrerContactabilidad();
         *
         * String idExcel= anio+mes+dia;
         *
         * // ExportarCSV e= new ExportarCSV();
         * e.exportarResultados(c.getContactosLista(),idExcel);
         *
         */
        Consultas c = new Consultas();

        System.out.println("******Primer recorrido*****");
        c.completarAvisos();
        c.recorrerAvisos();

        System.out.println("*********Completando Email**************");
        c.completarEmail();

        System.out.println("******Segundo recorrido*****");
        c.obtenerContactabilidadMensual("08", "02", "2018");
        c.recorrerAvisosContactos();

        String dia = "08";
        String mes = "02";
        String anio = "2018";

        String extraccion = anio + mes + dia;

        System.out.println("Exportando datos a CSV");
        ExportarCSV e = new ExportarCSV();
        e.exportarResultados(c.getAvisos(), extraccion);

    }

}
