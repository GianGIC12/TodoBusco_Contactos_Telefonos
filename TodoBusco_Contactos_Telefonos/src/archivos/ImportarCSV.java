/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import beans.AvisoBean;
import com.csvreader.CsvReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class ImportarCSV {

    List<AvisoBean> avisos;

    public ImportarCSV() {

        avisos = new ArrayList<>();

    }

    public void importarData() throws FileNotFoundException, IOException {

        CsvReader importar = new CsvReader("C:/Users/user/Google Drive/Digital_Balance_TB/Base_Transaccional/bd_Contactabilidad_20180207.csv");
        importar.readHeaders();

        while (importar.readRecord()) {

            String importar_id_aviso = importar.get(0);
            String importar_id_fecha = importar.get(1);
            String pais = importar.get(2);
            String portal = importar.get(3);
            String destaque = importar.get(4);
            String fecha_publica = importar.get(5);
            String categoria = importar.get(6);
            String subCategoria = importar.get(7);
            String estado = importar.get(8);
            String fecha_extraccion = importar.get(9);
            String importar_visitas = importar.get(10);
            String importar_contactos = importar.get(11);
            String importar_mensajes = importar.get(12);
            String importar_telefonos = importar.get(13);
            String nombreContacto = importar.get(14);
            String emailContacto = importar.get(15);
            String tituloAviso = importar.get(16);
            String telefonoContacto = importar.get(17);

            int id_aviso = Integer.parseInt(importar_id_aviso);
            int id_fecha = Integer.parseInt(importar_id_fecha);
            int visitas = Integer.parseInt(importar_visitas);
            int contactos = Integer.parseInt(importar_contactos);
            int mensajes = Integer.parseInt(importar_mensajes);
            int telefonos = Integer.parseInt(importar_telefonos);

            AvisoBean aviso = new AvisoBean(id_aviso, id_fecha, portal, destaque, pais, fecha_publica, categoria, subCategoria, estado, fecha_extraccion, visitas, contactos, mensajes, telefonos, nombreContacto, emailContacto, tituloAviso, telefonoContacto, id_fecha);

            avisos.add(aviso);

        }

    }

    public List<AvisoBean> getAvisos() {
        return avisos;
    }

    public void setAvisos(List<AvisoBean> avisos) {
        this.avisos = avisos;
    }

}
