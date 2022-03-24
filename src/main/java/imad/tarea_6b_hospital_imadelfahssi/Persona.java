/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imad.tarea_6b_hospital_imadelfahssi;

import java.time.LocalDate;

/**
 *
 * @author imad
 */
public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected Nif nifPersona;
    
    public void renovarNif(LocalDate fechaSolicitud){
        this.nifPersona.renovarDni(fechaSolicitud);
    }
    
    
}
