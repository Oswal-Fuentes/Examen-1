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
public class Politico extends Personas {

    private String afiliacion;

    public Politico() {
    }

    public Politico(String afiliacion, String nombre, int edad, int id, String departamento) {
        super(nombre, edad, id, departamento);
        this.afiliacion = afiliacion;
    }

    public String getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
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
        return "Politico - " + " Nombre: " + nombre + "    Edad: " + edad
                + "    ID: " + id + "    ID Boleto: " + id_boleto + "    Dinero: "
                + dinero + "    Departamento: " + departamento;
    }
}
