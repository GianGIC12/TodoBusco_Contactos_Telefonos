/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author user
 */
public class AvisoBean {

    int id_Aviso, id_fecha;
    String portal, destaque, pais, fecha_publicacion, categoria, subCategoria;
    String estado;
    String fecha_Extraccion;
    int visitas, contactos, mensajes, telefonos,calls,whatsapp;
    String nombreContacto, emailContacto, tituloAviso, telefonoContacto;
    int idPerfil;

    public AvisoBean(int id_Aviso, int id_fecha, String portal, String destaque, String pais, String fecha_publicacion, String categoria, String subCategoria, String estado, String fecha_Extraccion, int visitas, int contactos, int mensajes, int telefonos, String nombreContacto, String emailContacto, String tituloAviso, String telefonoContacto, int idPerfil) {
        this.id_Aviso = id_Aviso;
        this.id_fecha = id_fecha;
        this.portal = portal;
        this.destaque = destaque;
        this.pais = pais;
        this.fecha_publicacion = fecha_publicacion;
        this.categoria = categoria;
        this.subCategoria = subCategoria;
        this.estado = estado;
        this.fecha_Extraccion = fecha_Extraccion;
        this.visitas = visitas;
        this.contactos = contactos;
        this.mensajes = mensajes;
        this.telefonos = telefonos;
        this.nombreContacto = nombreContacto;
        this.emailContacto = emailContacto;
        this.tituloAviso = tituloAviso;
        this.telefonoContacto = telefonoContacto;
        this.idPerfil = idPerfil;
    }

    public AvisoBean(int id_Aviso, int id_fecha, String portal, String destaque, String pais, String fecha_publicacion) {
        this.id_Aviso = id_Aviso;
        this.id_fecha = id_fecha;
        this.portal = portal;
        this.destaque = destaque;
        this.pais = pais;
        this.fecha_publicacion = fecha_publicacion;
    }

    public AvisoBean() {
    }

    public int getId_Aviso() {
        return id_Aviso;
    }

    public void setId_Aviso(int id_Aviso) {
        this.id_Aviso = id_Aviso;
    }

    public int getId_fecha() {
        return id_fecha;
    }

    public void setId_fecha(int id_fecha) {
        this.id_fecha = id_fecha;
    }

    public String getPortal() {
        return portal;
    }

    public void setPortal(String portal) {
        this.portal = portal;
    }

    public String getDestaque() {
        return destaque;
    }

    public void setDestaque(String destaque) {
        this.destaque = destaque;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(String fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }

    public String getFecha_Extraccion() {
        return fecha_Extraccion;
    }

    public void setFecha_Extraccion(String fecha_Extraccion) {
        this.fecha_Extraccion = fecha_Extraccion;
    }

    public int getVisitas() {
        return visitas;
    }

    public void setVisitas(int visitas) {
        this.visitas = visitas;
    }

    public int getContactos() {
        return contactos;
    }

    public void setContactos(int contactos) {
        this.contactos = contactos;
    }

    public int getMensajes() {
        return mensajes;
    }

    public void setMensajes(int mensajes) {
        this.mensajes = mensajes;
    }

    public int getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(int telefonos) {
        this.telefonos = telefonos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getEmailContacto() {
        return emailContacto;
    }

    public void setEmailContacto(String emailContacto) {
        this.emailContacto = emailContacto;
    }

    public String getTituloAviso() {
        return tituloAviso;
    }

    public void setTituloAviso(String tituloAviso) {
        this.tituloAviso = tituloAviso;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public int getCalls() {
        return calls;
    }

    public void setCalls(int calls) {
        this.calls = calls;
    }

    public int getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(int whatsapp) {
        this.whatsapp = whatsapp;
    }

    
    
    
    
}
