/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package archivos;

import beans.AvisoBean;
import beans.ContactabilidadBean;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author user
 */
public class ExportarCSV {

    public ExportarCSV() {
    }
    
    
    public void exportarResultados(List<AvisoBean> avisos,String idFecha ) throws IOException{
        
    String outputFile = "C:/Users/user/Google Drive/Digital_Balance_TB/Base_Transaccional/bd_Contactabilidad_"+idFecha+".csv";    
        
     boolean alreadyExists = new File(outputFile).exists();    
        
      
     if (alreadyExists) {
            File bd_contactabilidad_creada = new File(outputFile);
            bd_contactabilidad_creada.delete();
        }
     
     
      CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ';');
     
      csvOutput.write("id_aviso");
        csvOutput.write("id_fecha");
        csvOutput.write("pais");
        csvOutput.write("portal");
        csvOutput.write("destaque");
        csvOutput.write("fecha_publicacion");
        csvOutput.write("categoria");
        csvOutput.write("subCategoria");
        csvOutput.write("estado");
        csvOutput.write("fecha_extraccion");
        csvOutput.write("visitas");
        csvOutput.write("contactos");
        csvOutput.write("mensajes");
        csvOutput.write("telefonos");
        

        csvOutput.endRecord();
      
      for (AvisoBean aviso : avisos) {
      
           csvOutput.write(aviso.getId_Aviso() + "");
                csvOutput.write(aviso.getId_fecha() + "");
                csvOutput.write(aviso.getPais() + "");
                csvOutput.write(aviso.getPortal());
                csvOutput.write(aviso.getDestaque());
                csvOutput.write(aviso.getFecha_publicacion());
                csvOutput.write(aviso.getCategoria());
                csvOutput.write(aviso.getSubCategoria());
                csvOutput.write(aviso.getEstado()+"");
                csvOutput.write(aviso.getFecha_Extraccion()+"");
                csvOutput.write(aviso.getVisitas()+"");
                csvOutput.write(aviso.getContactos()+"");
                csvOutput.write(aviso.getMensajes()+"");
                csvOutput.write(aviso.getTelefonos()+"");
                

                csvOutput.endRecord();
          
          
          
      
      }
     
     
       csvOutput.close();  
        
    }
    
    
    
    
    
}
