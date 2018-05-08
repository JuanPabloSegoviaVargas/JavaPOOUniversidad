/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Calendar;

/**
 *
 * @author Marcelo
 */
public class Administrativo extends Persona {
    protected String Cargo;
    protected String Lugar_de_trabajo;
    protected Calendar fechaIngreso;
    
    public Administrativo(String cargo,String carnetIdentidad, String nombre, String Lugar_de_trabajo,Calendar fechaNacimiento, Calendar fechaIngreso) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.Cargo = cargo;
        this.Lugar_de_trabajo = Lugar_de_trabajo;
    }

    public Administrativo(Calendar fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Calendar getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Calendar fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public Administrativo(String cargo, String Lugar_de_trabajo) {
        this.Cargo = cargo;
        this.Lugar_de_trabajo = Lugar_de_trabajo;
    }
    public Administrativo(){
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getLugar_de_trabajo() {
        return Lugar_de_trabajo;
    }

    public void setLugar_de_trabajo(String Lugar_de_trabajo) {
        this.Lugar_de_trabajo = Lugar_de_trabajo;
    }
    @Override
    public String toString() {
        return "Administrativo{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", Fecha_de_Nacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Fecha_de_Ingreso=" + Utilitarios.getFechaCalendario(this.fechaIngreso)
                + ", Cargo=" + Cargo + ", Lugar_de_trabajo=" + Lugar_de_trabajo + '}';
    }
    
}
