/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package archivos;

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
    
    
    public void exportarResultados(List<ContactabilidadBean> contactosLista,String idFecha ) throws IOException{
        
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
        csvOutput.write("fecha_contacto");
        csvOutput.write("Categoria");
        csvOutput.write("SubCategoria");
        csvOutput.write("visitas");
        csvOutput.write("contactos");
        csvOutput.write("mensajes");
        csvOutput.write("telefonos");
        

        csvOutput.endRecord();
      
      for (ContactabilidadBean contacto : contactosLista) {
          
           csvOutput.write(contacto.getIdAviso() + "");
                csvOutput.write(contacto.getIdFecha() + "");
                csvOutput.write(contacto.getPais() + "");
                csvOutput.write(contacto.getPortal());
                csvOutput.write(contacto.getDestaque());
                csvOutput.write(contacto.getFecha());
                csvOutput.write(contacto.getCategoria());
                csvOutput.write(contacto.getSubCategoria());
                csvOutput.write(contacto.getVisitas()+"");
                csvOutput.write(contacto.getContactos()+"");
                csvOutput.write(contacto.getMensajes()+"");
                csvOutput.write(contacto.getTelefonos()+"");

                csvOutput.endRecord();
          
          
          
          
      }
     
     
       csvOutput.close();  
        
    }
    
    
    
    
    
}
