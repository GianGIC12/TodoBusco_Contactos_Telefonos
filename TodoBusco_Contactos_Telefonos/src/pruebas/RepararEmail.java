/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import archivos.ExportarCSV;
import archivos.ImportarCSV;
import gestion.Consultas;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class RepararEmail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, SQLException {
        // TODO code application logic here

        ImportarCSV i = new ImportarCSV();
        i.importarData();

        Consultas c = new Consultas();
        c.repararEmail(i.getAvisos());

        ExportarCSV ex = new ExportarCSV();
        ex.exportarResultados(i.getAvisos(), "20180207");

        System.out.println("Finalizada la reparacion");

    }

}
