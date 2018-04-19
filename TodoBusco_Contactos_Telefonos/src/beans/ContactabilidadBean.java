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
public class ContactabilidadBean {

    int idAviso;
    int idFecha;
    String pais, portal, categoria, subCategoria, destaque;
    int visitas, contactos, mensajes, telefonos;
    int calls,whatsapp;
    String fecha;

    public ContactabilidadBean() {
    }

    public int getIdAviso() {
        return idAviso;
    }

    public void setIdAviso(int idAviso) {
        this.idAviso = idAviso;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPortal() {
        return portal;
    }

    public void setPortal(String portal) {
        this.portal = portal;
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

    public String getDestaque() {
        return destaque;
    }

    public void setDestaque(String destaque) {
        this.destaque = destaque;
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

    public int getMensaje() {
        return mensajes;
    }

    public void setMensaje(int mensaje) {
        this.mensajes = mensaje;
    }

    public int getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(int telefonos) {
        this.telefonos = telefonos;
    }

    public int getMensajes() {
        return mensajes;
    }

    public void setMensajes(int mensajes) {
        this.mensajes = mensajes;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdFecha() {
        return idFecha;
    }

    public void setIdFecha(int idFecha) {
        this.idFecha = idFecha;
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
