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

public class Trabajador 
{
   private String DNI;
   private String FNAC;
   private float salario;
   private String Nombre;
   private String Ape1;
   private String Ape2;
   private String Direccion;
   private String Telefono_per;
   private String Telefono_emp;
   private CentroTrabajo centro;
   private int Categoria;

    public Trabajador() {
    }

    public Trabajador(String DNI, String FNAC, float salario, String Nombre, String Ape1, String Ape2, String Direccion, String Telefono_per, String Telefono_emp, CentroTrabajo centro, int Categoria) {
        this.DNI = DNI;
        this.FNAC = FNAC;
        this.salario = salario;
        this.Nombre = Nombre;
        this.Ape1 = Ape1;
        this.Ape2 = Ape2;
        this.Direccion = Direccion;
        this.Telefono_per = Telefono_per;
        this.Telefono_emp = Telefono_emp;
        this.centro = centro;
        this.Categoria = Categoria;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getFNAC() {
        return FNAC;
    }

    public void setFNAC(String FNAC) {
        this.FNAC = FNAC;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApe1() {
        return Ape1;
    }

    public void setApe1(String Ape1) {
        this.Ape1 = Ape1;
    }

    public String getApe2() {
        return Ape2;
    }

    public void setApe2(String Ape2) {
        this.Ape2 = Ape2;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono_per() {
        return Telefono_per;
    }

    public void setTelefono_per(String Telefono_per) {
        this.Telefono_per = Telefono_per;
    }

    public String getTelefono_emp() {
        return Telefono_emp;
    }

    public void setTelefono_emp(String Telefono_emp) {
        this.Telefono_emp = Telefono_emp;
    }

    public CentroTrabajo getCentro() {
        return centro;
    }

    public void setCentro(CentroTrabajo centro) {
        this.centro = centro;
    }

    public int getCategoria() {
        return Categoria;
    }

    public void setCategoria(int Categoria) {
        this.Categoria = Categoria;
    }
   
   
}
