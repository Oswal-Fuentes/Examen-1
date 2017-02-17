/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oswalfuentes_examen1_labprogra2;

/**
 *
 * @author Oswal
 */
public class Personas {

    protected String nombre;
    protected int edad, id, id_boleto, dinero;
    protected String departamento;

    public Personas() {
    }

    public Personas(String nombre, int edad, int id, int id_boleto, int dinero, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.id_boleto = id_boleto;
        this.dinero = dinero;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_boleto() {
        return id_boleto;
    }

    public void setId_boleto(int id_boleto) {
        this.id_boleto = id_boleto;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", edad=" + edad + ", id=" + id + ", id_boleto=" + id_boleto + ", dinero=" + dinero + ", departamento=" + departamento + '}';
    }

    
    
}
