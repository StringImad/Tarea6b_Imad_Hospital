/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imad.tarea_6b_hospital_imadelfahssi;

import org.apache.commons.lang.RandomStringUtils;

/**
 *
 * @author imad
 */
public abstract class Empleado extends Persona{
    protected String numeroSeguridadSocial;
    protected double salario;

    public Empleado() {
        numeroSeguridadSocial = RandomStringUtils.randomNumeric(15);
        salario = 2500;
    }

    public Empleado(String numeroSeguridadSocial, double salario, String nombre, String apellido, Nif nifPersona) {
        super(nombre, apellido, nifPersona);
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.salario = salario;
    }
    
    public abstract double calcularIRPF();

    @Override
    public String toString() {
        return super.toString()+"Empleado{" + "numeroSeguridadSocial=" + numeroSeguridadSocial + ", salario=" + salario + '}';
    }
    
}
