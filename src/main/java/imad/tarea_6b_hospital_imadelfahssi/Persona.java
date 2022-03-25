/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imad.tarea_6b_hospital_imadelfahssi;

import java.time.LocalDate;
import java.time.Month;
import java.util.Random;
import java.util.logging.Logger;
import org.apache.commons.lang.RandomStringUtils;

/**
 *
 * @author imad
 */
public abstract class Persona {

    protected String nombre;
    protected String apellido;
    protected final Nif NIF_PERSONA;

    public Persona() {
        this.NIF_PERSONA = new Nif(RandomStringUtils.randomNumeric(8), LocalDate.of(2026, Month.MARCH, 15));
        String[] nombres = "Juan,Alberto,Jose,Maria,Laura,Cristina,Sofia".split("\\,");
        this.nombre = nombres[Utilidades.generadorNumeroAleatorioEntreDosRangos(0, 6)];
        String[] apellidos = "Jimenez,Lopez,Vico".split("\\,");
        this.apellido = apellidos[Utilidades.generadorNumeroAleatorioEntreDosRangos(0, 2)];
    }

    public Persona(String nombre, String apellido, Nif nifPersona) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.NIF_PERSONA = nifPersona;
    }

    public void renovarNif(LocalDate fechaSolicitud) {
        this.NIF_PERSONA.renovarDni(fechaSolicitud);
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", nifPersona=" + NIF_PERSONA + '}'+"\n";
    }

   
}
