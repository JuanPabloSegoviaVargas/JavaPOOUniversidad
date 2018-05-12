/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import java.util.Calendar;

/**
 *
 * @author HP
 */
public class administrativo1 extends Persona{
    String cargo;
    String LugarTrabajo;
    Calendar fechaingrso;

    public administrativo1(String cargo, String LugarTrabajo, Calendar fechaingrso, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.cargo = cargo;
        this.LugarTrabajo = LugarTrabajo;
        this.fechaingrso = fechaingrso;
    }

    
    
    
}
