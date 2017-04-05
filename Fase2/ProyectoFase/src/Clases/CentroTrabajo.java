/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author joni_
 */
public class CentroTrabajo 
{
    private int CentroNO;
    private String Nombre;
    private String Direccion;
    private String Telefono;
    private String CodPostal;
    private String Ciudad;
    private String provincia;

    public CentroTrabajo() {
    }

    public CentroTrabajo(int CentroNO, String Nombre, String Direccion, String Telefono, String CodPostal, String Ciudad, String provincia) {
        this.CentroNO = CentroNO;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.CodPostal = CodPostal;
        this.Ciudad = Ciudad;
        this.provincia = provincia;
    }

    public int getCentroNO() {
        return CentroNO;
    }

    public void setCentroNO(int CentroNO) {
        this.CentroNO = CentroNO;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCodPostal() {
        return CodPostal;
    }

    public void setCodPostal(String CodPostal) {
        this.CodPostal = CodPostal;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    
}
